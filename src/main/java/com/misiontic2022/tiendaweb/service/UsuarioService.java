package com.misiontic2022.tiendaweb.service;

import java.util.List;
import java.util.Optional;

import com.misiontic2022.tiendaweb.interfaces.IUsuario;
import com.misiontic2022.tiendaweb.iservice.IUsuarioService;
import com.misiontic2022.tiendaweb.model.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private IUsuario userDAO;

    @Override
    public List<Usuario> listar() {

        return (List<Usuario>) userDAO.findAll();
    }

    @Override
    public Optional<Usuario> listarById(int id) {
        return userDAO.findById(id);
    }

    @Override
    public int guardar(Usuario user) {
        int res = 0;

        Usuario u = userDAO.save(user);
        if (!u.equals(null)) {
            res = 1;
        }
        return res;
    }

    @Override
    public void borrar(int id) {
        userDAO.deleteById(id);
    }

}
