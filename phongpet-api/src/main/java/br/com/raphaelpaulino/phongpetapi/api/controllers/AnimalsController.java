package br.com.raphaelpaulino.phongpetapi.api.controllers;

import br.com.raphaelpaulino.phongpetapi.domain.repository.AnimalRepository;
import br.com.raphaelpaulino.phongpetapi.models.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// @Controller
@RestController
@RequestMapping("/animals")
public class AnimalsController {

    @Autowired
    private AnimalRepository animalRepository;

    @GetMapping
    public List<Animal> all() {
        return animalRepository.all();
    }
}
