package br.com.raphaelpaulino.phongpetapi.domain.repository;

import br.com.raphaelpaulino.phongpetapi.models.Animal;
import org.springframework.stereotype.Component;

import java.util.List;

public interface AnimalRepository {

    List<Animal> all();
    Animal byId(Long id);
    Animal add(Animal animal);
    void remove(Animal animal);

}
