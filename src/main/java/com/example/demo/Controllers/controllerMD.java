package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Admnn")
public class controllerMD {

    @GetMapping
    public String admhtml(){

        return "admpruebas";

    }

}
