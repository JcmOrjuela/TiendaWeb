package com.misiontic2022.webstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.misiontic2022.webstore.model.Productos;

public interface ProductosDAO extends JpaRepository<Productos, String> {

}
