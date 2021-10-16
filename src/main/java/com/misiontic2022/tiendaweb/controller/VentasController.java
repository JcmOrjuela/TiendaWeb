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

import com.misiontic2022.tiendaweb.iservice.IVentaService;
import com.misiontic2022.tiendaweb.model.Venta;

@Controller
@RequestMapping
public class VentasController {

    @Autowired
    private IVentaService uservice;

    @PostMapping("ventas/save")
    public String save(@Validated Venta venta, Model model) {
        model.addAttribute("venta", new Venta());
        uservice.guardar(venta);
        return "redirect:/ventas";
    }

    @GetMapping("ventas/update/{id}")
    public String update(Model model, @PathVariable int id) {
        Optional<Venta> user = uservice.listarById(id);
        model.addAttribute("venta", user);
        return "redirect:/ventas";
    }

    @GetMapping("ventas/delete/{id}")
    public String delete(Model model, @PathVariable int id) {
        uservice.borrar(id);
        return "redirect:/ventas";
    }

    @GetMapping("/ventas")
    public String list(Model model) {
        List<Venta> ventas_ = uservice.listar();
        System.out.println(ventas_);
        model.addAttribute("ventax", ventas_);
        return "ventas";
    }

    @GetMapping("/")
    public String login(Model model) {
        return "login";
    }

    @PostMapping("/welcome")
    public String index() {
        return "redirect:ventas";
    }
}
