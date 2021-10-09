package com.misiontic2022.webstore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewsController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
    @RequestMapping("/ventas")
    public String ventas() {
        return "ventas";
    }
    @RequestMapping("/clientes")
    public String clientes() {
        return "clientes";
    }
    @RequestMapping("/productos")
    public String productos() {
        return "productos";
    }
    @RequestMapping("/proveedores")
    public String proveedores() {
        return "proveedores";
    }
    @RequestMapping("/usuarios")
    public String usuarios() {
        return "usuarios";
    }
}
