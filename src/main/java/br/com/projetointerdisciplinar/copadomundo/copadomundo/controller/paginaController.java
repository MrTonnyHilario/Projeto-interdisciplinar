package br.com.projetointerdisciplinar.copadomundo.copadomundo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class paginaController {

    @GetMapping("/")
public String index() {
    return "index";
}

@GetMapping("/login")
public String login() {
    return "criar";
}

@GetMapping("/home")
public String home() {
    return "incial";
}
}