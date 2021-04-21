package br.com.raphaelpaulino.phongpetapi.infrastructure.repository;

import br.com.raphaelpaulino.phongpetapi.domain.repository.CompanyRepository;
import br.com.raphaelpaulino.phongpetapi.models.Company;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class CompanyRepositoryImpl implements CompanyRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Company> all() {
        return manager.createQuery("from Company", Company.class).getResultList();
    }

    @Override
    public Company byId(Long id) {
        return manager.find(Company.class, id);
    }

    @Transactional
    @Override
    public Company add(Company company) {
        return manager.merge(company);
    }

    @Transactional
    @Override
    public void remove(Company company) {
        company = byId(company.getId());
        manager.remove(company);
    }
}
