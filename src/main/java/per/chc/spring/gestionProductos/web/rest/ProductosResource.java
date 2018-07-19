package per.chc.spring.gestionProductos.web.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import per.chc.spring.gestionProductos.repository.IProductoRepository;
import per.chc.spring.gestionProductos.service.IProductoService;
import per.chc.spring.gestionProductos.web.dto.ProductoDTO;
@Slf4j
@RestController("/")
public class ProductosResource {

    @Autowired
    IProductoService productoService;

    /**
     * Metodo para devolver el estado de salud del producto.
     * @return
     */
    @RequestMapping(value = "health", method = RequestMethod.GET)
    public ResponseEntity<String> status(){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "producto", method = RequestMethod.POST)
    public ResponseEntity<Void> crearProducto(@RequestBody ProductoDTO productoDTO){
    log.info("Este producto {}", productoDTO.toString());


        return null;

    }
}
