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

import com.misiontic2022.tiendaweb.iservice.IUsuarioService;
import com.misiontic2022.tiendaweb.model.Usuario;

@Controller
@RequestMapping
public class UsuariosController {

    @Autowired
    private IUsuarioService uservice;

    @PostMapping("usuarios/save")
    public String save(@Validated Usuario usuario, Model model) {
        model.addAttribute("usuario", new Usuario());
        uservice.guardar(usuario);
        return "redirect:/usuarios";
    }

    @GetMapping("usuarios/update/{id}")
    public String update(Model model, @PathVariable int id) {
        Optional<Usuario> user = uservice.listarById(id);
        model.addAttribute("usuario", user);
        return "redirect:/usuarios";
    }

    @GetMapping("usuarios/delete/{id}")
    public String delete(Model model, @PathVariable int id) {
        uservice.borrar(id);
        return "redirect:/usuarios";
    }

    @GetMapping("/usuarios")
    public String list(Model model) {
        List<Usuario> usuarios_ = uservice.listar();
        System.out.println(usuarios_);
        model.addAttribute("usuariox", usuarios_);
        return "usuarios";
    }
}
