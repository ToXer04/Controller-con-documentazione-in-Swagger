package com.example.demowebapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class ControllerNomeProvincia {
    @GetMapping("/ciao")
    public String helloNomeProvincia(@RequestParam String nome, String provincia) {
        return "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
    }
}
