package com.misiontic2022.tiendaweb;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ViewsController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
