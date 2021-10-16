package com.misiontic2022.tiendaweb.iservice;

import java.util.List;
import java.util.Optional;

import com.misiontic2022.tiendaweb.model.Venta;

public interface IVentaService {
    public List<Venta> listar();

    public Optional<Venta> listarById(int id);

    public int guardar(Venta user);

    public void borrar(int id);
}
