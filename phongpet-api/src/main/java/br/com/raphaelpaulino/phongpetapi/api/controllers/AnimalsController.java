package br.com.raphaelpaulino.phongpetapi.api.controllers;

import br.com.raphaelpaulino.phongpetapi.domain.repository.AnimalRepository;
import br.com.raphaelpaulino.phongpetapi.models.Animal;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalsController {

    @Autowired
    private AnimalRepository animalRepository;

    @GetMapping
    public List<Animal> all() {
        return animalRepository.all();
    }

    @GetMapping("/{animalId}")
    public ResponseEntity<Animal> findById(@PathVariable Long animalId) {
        Animal animal = animalRepository.byId(animalId);
        return ResponseEntity.ok(animal);
    }

    @PostMapping
    public ResponseEntity<Animal> store(@RequestBody Animal animal) {
        animal = animalRepository.add(animal);
        return ResponseEntity.status(HttpStatus.CREATED).body(animal);
    }

    @PutMapping("/{animalId}")
    public ResponseEntity<Animal> update(@PathVariable Long animalId, @RequestBody Animal animal) {
        Animal currentAnimal = animalRepository.byId(animalId);

        if (currentAnimal != null) {
            BeanUtils.copyProperties(animal, currentAnimal, "id");
            animalRepository.add(currentAnimal);
            return ResponseEntity.ok(currentAnimal);
        }

        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{animalId}")
    public ResponseEntity<?> destroy(@PathVariable Long animalId) {
        Animal animal = animalRepository.byId(animalId);

        if (animal != null) {
            animalRepository.remove(animal);
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.notFound().build();
    }
}
