package com.misiontic2022.tiendaweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

import com.misiontic2022.tiendaweb.iservice.IProductoService;
import com.misiontic2022.tiendaweb.model.Producto;

@Controller
@RequestMapping
public class ProductosController {

    @Autowired
    private IProductoService pservice;

    @PostMapping("productos/save")
    public String save(@Validated Producto Producto, Model model) {
        model.addAttribute("producto", new Producto());
        pservice.guardar(Producto);
        return "redirect:/productos";
    }

    @GetMapping("productos/update/{id}")
    public String update(Model model, @PathVariable int id) {
        Optional<Producto> user = pservice.listarById(id);
        model.addAttribute("producto", user);
        return "redirect:/productos";
    }

    @GetMapping("productos/delete/{id}")
    public String delete(Model model, @PathVariable int id) {
        pservice.borrar(id);
        return "redirect:/productos";
    }

    @GetMapping("/productos")
    public String list(Model model) {
        List<Producto> Productos_ = pservice.listar();
        System.out.println(Productos_);
        model.addAttribute("productox", Productos_);
        return "productos";
    }
}
