package br.com.raphaelpaulino.phongpetapi.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Date;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Animal {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    protected String uuid;
    protected String name;
    protected String photo;
    @Column(name = "born_date")
    protected String bornDate;
    protected String nameSlug;
    protected String specie;
    protected String color;
    protected String gender;
    protected String size;
    protected String coat;
    protected String breed; // dog/cat/horse/sheep/cattle
    protected Integer age;
    protected Integer ageMonths;
    protected String ageGroup; //adult or puppy
    // protected boolean isNeutered;
    // protected boolean isActive;
    protected Date deletedAt;
    protected Date createdAt;
    protected Date updatedAt;

}
