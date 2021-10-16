package com.misiontic2022.tiendaweb.service;

import java.util.List;
import java.util.Optional;

import com.misiontic2022.tiendaweb.interfaces.IProveedor;
import com.misiontic2022.tiendaweb.iservice.IProveedorService;
import com.misiontic2022.tiendaweb.model.Proveedor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProveedorService implements IProveedorService {

    @Autowired
    private IProveedor vendorDAO;

    @Override
    public List<Proveedor> listar() {

        return (List<Proveedor>) vendorDAO.findAll();
    }

    @Override
    public Optional<Proveedor> listarById(int id) {
        return vendorDAO.findById(id);
    }

    @Override
    public int guardar(Proveedor user) {
        int res = 0;

        Proveedor u = vendorDAO.save(user);
        if (!u.equals(null)) {
            res = 1;
        }
        return res;
    }

    @Override
    public void borrar(int id) {
        vendorDAO.deleteById(id);
    }

}
