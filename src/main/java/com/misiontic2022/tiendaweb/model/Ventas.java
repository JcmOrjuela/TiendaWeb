package com.misiontic2022.tiendaweb.model;

public class Ventas {
    private String codigo_venta;
    private String ivaventa;
    private String total_venta;
    private String valor_venta;
    private String cedula_usuario;
    private String cedula_cliente;

    public String getCodigo_venta() {
        return this.codigo_venta;
    }

    public void setCodigo_venta(String codigo_venta) {
        this.codigo_venta = codigo_venta;
    }

    public String getIvaventa() {
        return this.ivaventa;
    }

    public void setIvaventa(String ivaventa) {
        this.ivaventa = ivaventa;
    }

    public String getTotal_venta() {
        return this.total_venta;
    }

    public void setTotal_venta(String total_venta) {
        this.total_venta = total_venta;
    }

    public String getValor_venta() {
        return this.valor_venta;
    }

    public void setValor_venta(String valor_venta) {
        this.valor_venta = valor_venta;
    }

    public String getCedula_usuario() {
        return this.cedula_usuario;
    }

    public void setCedula_usuario(String cedula_usuario) {
        this.cedula_usuario = cedula_usuario;
    }

    public String getCedula_cliente() {
        return this.cedula_cliente;
    }

    public void setCedula_cliente(String cedula_cliente) {
        this.cedula_cliente = cedula_cliente;
    }

}
