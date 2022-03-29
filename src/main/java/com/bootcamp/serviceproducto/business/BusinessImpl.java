package com.bootcamp.serviceproducto.business;

import com.bootcamp.serviceproducto.clients.IClients;
import com.bootcamp.serviceproducto.clients.model.Cliente;
import com.bootcamp.serviceproducto.entity.Producto;
import com.bootcamp.serviceproducto.repository.ProductoRepository;
import com.bootcamp.serviceproducto.util.Constantes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Stream;

@Service
public class BusinessImpl implements IBusiness {

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private IClients clientImpl;


    @Override
    public Mono<Producto> save(Producto producto) {
        Flux<Cliente> client = clientImpl.getClientByTipNum(producto.getTipDoc(), producto.getNumDoc());
        Mono<Cliente> cliente = client.map(Mono::just).blockFirst();
        List<Producto> productos = productoRepository.findByIdClient(cliente.block().getId());

        //validar el tipo
        if(cliente.block().getTipo().equals(Constantes.TIPO_PERSONAL)){ //P
            //Validar Productos personal (return boolean)
            if(this.validarProductosPersonal(client, productos.stream())){  //true
                System.out.println("entro personal");
                return productoRepository.save(producto);
            }
        }else{ //E
            //Validar Productos Emp
            if(this.validarProductosEmpresariales(client, productos.stream())){
                System.out.println("entro validarProductosEmpresariales");
                return productoRepository.save(producto);

            }
        }
        return null;
    }

    private boolean validarProductosEmpresariales(Flux<Cliente> cliente, Stream<Producto> productos) {

        //  traer del api Producto por Tipo y Num Doc = (List Prod)
        // Lista filtrar (filter por tipo de producto (CA o PF)
        return productos.anyMatch(producto ->
                producto.getSubTipo().equals(Constantes.SUB_TIPO_CA) ||
                producto.getSubTipo().equals(Constantes.SUB_TIPO_PF));
        //findAny == no cumple el filtro = (true)
        // // si no, return false

    }

    private boolean validarProductosPersonal(Flux<Cliente> cliente, Stream<Producto> productos) {

        return productos
                .anyMatch(producto ->
                        producto.getTipo().equals(Constantes.TIPO_PRODUCTO_PASIVO))
                ;
    }


}
