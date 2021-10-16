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

import com.misiontic2022.tiendaweb.iservice.IProveedorService;
import com.misiontic2022.tiendaweb.model.Proveedor;

@Controller
@RequestMapping
public class ProveedorsController {

    @Autowired
    private IProveedorService prservice;

    @PostMapping("proveedores/save")
    public String save(@Validated Proveedor proveedor, Model model) {
        model.addAttribute("proveedor", new Proveedor());
        prservice.guardar(proveedor);
        return "redirect:/proveedores";
    }

    @GetMapping("proveedores/update/{id}")
    public String update(Model model, @PathVariable int id) {
        Optional<Proveedor> user = prservice.listarById(id);
        model.addAttribute("proveedor", user);
        return "redirect:/proveedores";
    }

    @GetMapping("proveedores/delete/{id}")
    public String delete(Model model, @PathVariable int id) {
        prservice.borrar(id);
        return "redirect:/proveedores";
    }

    @GetMapping("/proveedores")
    public String list(Model model) {
        List<Proveedor> Proveedores_ = prservice.listar();
        System.out.println(Proveedores_);
        model.addAttribute("proveedorex", Proveedores_);
        return "proveedores";
    }
}
