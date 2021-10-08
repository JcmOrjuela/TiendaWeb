package com.misiontic2022.tiendaweb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.misiontic2022.tiendaweb.model.Ventas;

public interface VentasDAO extends JpaRepository<Ventas, String> {

}
