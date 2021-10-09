package com.misiontic2022.webstore.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Productos {

    @Id
    private String codigo_producto;
    private String ivacompra;
    private String nombre_producto;
    private String precio_compra;
    private String precio_venta;
    private String nitproveedor;
    private String productoscol;

    public String getCodigo_producto() {
        return this.codigo_producto;
    }

    public void setCodigo_producto(String codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public String getIvacompra() {
        return this.ivacompra;
    }

    public void setIvacompra(String ivacompra) {
        this.ivacompra = ivacompra;
    }

    public String getNombre_producto() {
        return this.nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getPrecio_compra() {
        return this.precio_compra;
    }

    public void setPrecio_compra(String precio_compra) {
        this.precio_compra = precio_compra;
    }

    public String getPrecio_venta() {
        return this.precio_venta;
    }

    public void setPrecio_venta(String precio_venta) {
        this.precio_venta = precio_venta;
    }

    public String getNitproveedor() {
        return this.nitproveedor;
    }

    public void setNitproveedor(String nitproveedor) {
        this.nitproveedor = nitproveedor;
    }

    public String getProductoscol() {
        return this.productoscol;
    }

    public void setProductoscol(String productoscol) {
        this.productoscol = productoscol;
    }

}
