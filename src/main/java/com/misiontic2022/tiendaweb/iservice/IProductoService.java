package com.misiontic2022.tiendaweb.iservice;

import java.util.List;
import java.util.Optional;

import com.misiontic2022.tiendaweb.model.Producto;

public interface IProductoService {
    public List<Producto> listar();

    public Optional<Producto> listarById(int id);

    public int guardar(Producto user);

    public void borrar(int id);
}
