package com.misiontic2022.webstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.misiontic2022.webstore.model.Ventas;

public interface VentasDAO extends JpaRepository<Ventas, String> {

}
