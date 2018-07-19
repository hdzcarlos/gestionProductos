package per.chc.spring.gestionProductos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import per.chc.spring.gestionProductos.repository.IProductoRepository;
import per.chc.spring.gestionProductos.service.IProductoService;
import per.chc.spring.gestionProductos.web.dto.ProductoDTO;

import java.util.List;
@Service
public class ProductoServiceImpl implements IProductoService {

    @Autowired
    IProductoRepository productoRepository;

    @Override
    public ProductoDTO crearProducto(Long idProducto, String name, Long price, String stock) {

        return null;
    }

    @Override
    public List<ProductoDTO> getAllProductos() {
        return null;
    }

    @Override
    public ProductoDTO getProducto(String name) {
        return null;
    }

    @Override
    public ProductoDTO getProducto(Long idProducto) {
        return null;
    }

    @Override
    public ProductoDTO actualizarProducto(ProductoDTO productoActualizado) {
        return null;
    }

    @Override
    public ProductoDTO eliminarProducto(Long id) {
        return null;
    }
}
