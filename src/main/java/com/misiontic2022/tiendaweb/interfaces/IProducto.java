package com.misiontic2022.tiendaweb.interfaces;

import com.misiontic2022.tiendaweb.model.Producto;

import org.springframework.data.repository.CrudRepository;

public interface IProducto extends CrudRepository<Producto, Integer> {

}
