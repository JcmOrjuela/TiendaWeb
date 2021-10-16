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

import com.misiontic2022.tiendaweb.iservice.IClienteService;
import com.misiontic2022.tiendaweb.model.Cliente;

@Controller
@RequestMapping
public class ClientesController {

    @Autowired
    private IClienteService cservice;

    @PostMapping("clientes/save")
    public String save(@Validated Cliente Cliente, Model model) {
        model.addAttribute("cliente", new Cliente());
        cservice.guardar(Cliente);
        return "redirect:/clientes";
    }

    @GetMapping("clientes/update/{id}")
    public String update(Model model, @PathVariable int id) {
        Optional<Cliente> cliente = cservice.listarById(id);
        model.addAttribute("cliente", cliente);
        return "redirect:/clientes";
    }

    @GetMapping("clientes/delete/{id}")
    public String delete(Model model, @PathVariable int id) {
        cservice.borrar(id);
        return "redirect:/clientes";
    }

    @GetMapping("clientes")
    public String list(Model model) {
        List<Cliente> clientes = cservice.listar();
        System.out.println(clientes);
        model.addAttribute("clientex", clientes);
        return "clientes";
    }
}
