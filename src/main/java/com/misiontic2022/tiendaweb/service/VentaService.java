package com.misiontic2022.tiendaweb.service;

import java.util.List;
import java.util.Optional;

import com.misiontic2022.tiendaweb.interfaces.IVenta;
import com.misiontic2022.tiendaweb.iservice.IVentaService;
import com.misiontic2022.tiendaweb.model.Venta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaService implements IVentaService {

    @Autowired
    private IVenta ventaDAO;

    @Override
    public List<Venta> listar() {

        return (List<Venta>) ventaDAO.findAll();
    }

    @Override
    public Optional<Venta> listarById(int id) {
        return ventaDAO.findById(id);
    }

    @Override
    public int guardar(Venta user) {
        int res = 0;

        Venta u = ventaDAO.save(user);
        if (!u.equals(null)) {
            res = 1;
        }
        return res;
    }

    @Override
    public void borrar(int id) {
        ventaDAO.deleteById(id);
    }

}
