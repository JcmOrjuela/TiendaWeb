package com.misiontic2022.tiendaweb.iservice;

import java.util.List;
import java.util.Optional;

import com.misiontic2022.tiendaweb.model.Usuario;

public interface IUsuarioService {
    public List<Usuario> listar();

    public Optional<Usuario> listarById(int id);

    public int guardar(Usuario user);

    public void borrar(int id);
}
