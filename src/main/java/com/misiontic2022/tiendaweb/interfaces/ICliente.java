package com.misiontic2022.tiendaweb.interfaces;

import com.misiontic2022.tiendaweb.model.Cliente;

import org.springframework.data.repository.CrudRepository;

public interface ICliente extends CrudRepository<Cliente, Integer> {

}
