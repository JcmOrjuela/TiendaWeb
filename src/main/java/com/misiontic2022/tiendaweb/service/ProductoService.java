package com.misiontic2022.tiendaweb.service;

import java.util.List;
import java.util.Optional;

import com.misiontic2022.tiendaweb.interfaces.IProducto;
import com.misiontic2022.tiendaweb.iservice.IProductoService;
import com.misiontic2022.tiendaweb.model.Producto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService implements IProductoService {

    @Autowired
    private IProducto productDAO;

    @Override
    public List<Producto> listar() {

        return (List<Producto>) productDAO.findAll();
    }

    @Override
    public Optional<Producto> listarById(int id) {
        return productDAO.findById(id);
    }

    @Override
    public int guardar(Producto user) {
        int res = 0;

        Producto u = productDAO.save(user);
        if (!u.equals(null)) {
            res = 1;
        }
        return res;
    }

    @Override
    public void borrar(int id) {
        productDAO.deleteById(id);
    }

}
