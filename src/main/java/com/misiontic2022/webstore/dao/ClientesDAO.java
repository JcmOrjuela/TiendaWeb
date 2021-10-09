package com.misiontic2022.webstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.misiontic2022.webstore.model.Clientes;

public interface ClientesDAO extends JpaRepository<Clientes, String> {

}
