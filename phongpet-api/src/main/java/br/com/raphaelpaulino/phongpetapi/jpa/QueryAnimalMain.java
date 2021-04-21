package br.com.raphaelpaulino.phongpetapi.jpa;

import br.com.raphaelpaulino.phongpetapi.PhongpetApiApplication;
import br.com.raphaelpaulino.phongpetapi.domain.repository.AnimalRepository;
import br.com.raphaelpaulino.phongpetapi.models.Animal;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class QueryAnimalMain {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new SpringApplicationBuilder(PhongpetApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        AnimalRepository animalRepository = applicationContext.getBean(AnimalRepository.class);

        List<Animal> animals = animalRepository.all();

        for (Animal animal: animals) {
            System.out.printf("%s - %s (%s)\n", animal.getId(), animal.getName(), animal.getCompany().getTradingName());
        }
    }
}
