package br.com.raphaelpaulino.phongpetapi.jpa;

import br.com.raphaelpaulino.phongpetapi.PhongpetApiApplication;
import br.com.raphaelpaulino.phongpetapi.domain.repository.AnimalRepository;
import br.com.raphaelpaulino.phongpetapi.models.Animal;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class InsertAnimalMain {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new SpringApplicationBuilder(PhongpetApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        AnimalRepository animalRepository = applicationContext.getBean(AnimalRepository.class);

        Animal animal1 = new Animal();
        animal1.setName("Maria");
        animal1.setBreed("Dog");
        animal1.setNameSlug("maria");
        animal1 = animalRepository.add(animal1);

        Animal animal2 = new Animal();
        animal2.setName("Maggie");
        animal2.setBreed("Dog");
        animal2.setNameSlug("maggie");
        animal2 = animalRepository.add(animal2);

        System.out.printf("%d - %s\n", animal1.getId(), animal1.getName());
        System.out.printf("%d - %s\n", animal2.getId(), animal2.getName());
    }
}
