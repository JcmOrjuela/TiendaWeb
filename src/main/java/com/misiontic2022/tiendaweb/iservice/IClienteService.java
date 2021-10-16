package com.misiontic2022.tiendaweb.iservice;

import java.util.List;
import java.util.Optional;

import com.misiontic2022.tiendaweb.model.Cliente;

public interface IClienteService {
    public List<Cliente> listar();

    public Optional<Cliente> listarById(int id);

    public int guardar(Cliente user);

    public void borrar(int id);
}
