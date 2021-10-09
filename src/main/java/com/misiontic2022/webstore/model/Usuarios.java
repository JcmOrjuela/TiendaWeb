package com.misiontic2022.webstore.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuarios {

    @Id
    private String cedula_usuario;
    private String email_usuario;
    private String nombre_usuario;
    private String password;
    private String usuario;

    public String getCedula_usuario() {
        return this.cedula_usuario;
    }

    public void setCedula_usuario(String cedula_usuario) {
        this.cedula_usuario = cedula_usuario;
    }

    public String getEmail_usuario() {
        return this.email_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    public String getNombre_usuario() {
        return this.nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}
