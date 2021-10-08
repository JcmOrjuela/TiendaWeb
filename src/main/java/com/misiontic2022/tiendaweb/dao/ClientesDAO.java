package com.misiontic2022.tiendaweb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.misiontic2022.tiendaweb.model.Clientes;

public interface ClientesDAO extends JpaRepository<Clientes, String> {

}
