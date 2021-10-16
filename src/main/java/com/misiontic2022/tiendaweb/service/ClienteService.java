package com.misiontic2022.tiendaweb.service;

import java.util.List;
import java.util.Optional;

import com.misiontic2022.tiendaweb.interfaces.ICliente;
import com.misiontic2022.tiendaweb.iservice.IClienteService;
import com.misiontic2022.tiendaweb.model.Cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService implements IClienteService {

    @Autowired
    private ICliente clientDAO;

    @Override
    public List<Cliente> listar() {

        return (List<Cliente>) clientDAO.findAll();
    }

    @Override
    public Optional<Cliente> listarById(int id) {
        return clientDAO.findById(id);
    }

    @Override
    public int guardar(Cliente user) {
        int res = 0;

        Cliente u = clientDAO.save(user);
        if (!u.equals(null)) {
            res = 1;
        }
        return res;
    }

    @Override
    public void borrar(int id) {
        clientDAO.deleteById(id);
    }

}
