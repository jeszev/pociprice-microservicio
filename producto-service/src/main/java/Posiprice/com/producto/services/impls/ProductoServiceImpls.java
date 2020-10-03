package Posiprice.com.producto.services.impls;

import Posiprice.com.producto.entities.Producto;
import Posiprice.com.producto.repositories.ProductoRepository;
import Posiprice.com.producto.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public class ProductoServiceImpls implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Transactional
    @Override
    public Producto save(Producto entity) throws Exception {
        return productoRepository.save(entity);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Producto> findAll() throws Exception {
        return productoRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<Producto> findById(Long aLong) throws Exception {
        return productoRepository.findById( aLong);
    }

    @Transactional
    @Override
    public Producto update(Producto entity) throws Exception {
        return productoRepository.save(entity);
    }

    @Transactional
    @Override
    public void deleteById(Long aLong) throws Exception {
        productoRepository.deleteById( aLong);
    }
}
