package br.com.raphaelpaulino.phongpetapi.domain.repository;

import br.com.raphaelpaulino.phongpetapi.models.Company;

import java.util.List;

public interface CompanyRepository {

    List<Company> all();
    Company byId(Long id);
    Company add(Company company);
    void remove(Company company);
}
