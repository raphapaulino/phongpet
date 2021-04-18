package br.com.raphaelpaulino.phongpetapi.infrastructure.repository;

import br.com.raphaelpaulino.phongpetapi.domain.repository.AnimalRepository;
import br.com.raphaelpaulino.phongpetapi.models.Animal;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class AnimalRepositoryImpl implements AnimalRepository {

    @PersistenceContext
    EntityManager manager;

    @Override
    public List<Animal> all() {
        return manager.createQuery("from Animal", Animal.class).getResultList();
    }

    @Override
    public Animal byId(Long id) {
        return manager.find(Animal.class, id);
    }

    @Transactional
    @Override
    public Animal add(Animal animal) {
        return manager.merge(animal);
    }

    @Transactional
    @Override
    public void remove(Animal animal) {
        animal = byId(animal.getId());
        manager.remove(animal);
    }
}
