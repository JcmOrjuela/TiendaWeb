package com.misiontic2022.tiendaweb.iservice;

import java.util.List;
import java.util.Optional;

import com.misiontic2022.tiendaweb.model.Proveedor;

public interface IProveedorService {
    public List<Proveedor> listar();

    public Optional<Proveedor> listarById(int id);

    public int guardar(Proveedor user);

    public void borrar(int id);
}
