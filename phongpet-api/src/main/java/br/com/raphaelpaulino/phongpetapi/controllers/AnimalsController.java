package br.com.raphaelpaulino.phongpetapi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AnimalsController {

    @GetMapping("/animals")
    @ResponseBody
    public String animals() {
        return "O primeiro método dessa aplicação!";
    }
}
