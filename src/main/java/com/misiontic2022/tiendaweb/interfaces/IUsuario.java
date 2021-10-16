package com.misiontic2022.tiendaweb.interfaces;

import com.misiontic2022.tiendaweb.model.Usuario;

import org.springframework.data.repository.CrudRepository;

public interface IUsuario extends CrudRepository<Usuario, Integer> {

}
