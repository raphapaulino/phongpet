package br.com.raphaelpaulino.phongpetapi.jpa;

import br.com.raphaelpaulino.phongpetapi.PhongpetApiApplication;
import br.com.raphaelpaulino.phongpetapi.domain.repository.CompanyRepository;
import br.com.raphaelpaulino.phongpetapi.models.Company;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class InsertCompanyMain {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new SpringApplicationBuilder(PhongpetApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        CompanyRepository companyRepository = applicationContext.getBean(CompanyRepository.class);

        Company company = new Company();
        company.setCompanyName("Associação de Protetores de Animais Clube dos Focinhos ONG");
        company.setTradingName("Clube dos Focinhos");
        company = companyRepository.add(company);

        System.out.printf("%s - %s (%s)\n", company.getId(), company.getTradingName(), company.getCompanyName());
    }
}
