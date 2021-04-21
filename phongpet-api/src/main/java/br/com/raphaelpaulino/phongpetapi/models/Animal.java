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
    private Long id;
    private String uuid;

    @ManyToOne
    private Company company;

    private String name;
    private String photo;
    @Column(name = "born_date")
    private String bornDate;
    private String nameSlug;
    private String specie;
    private String color;
    private String gender;
    private String size;
    private String coat;
    private String breed; // dog/cat/horse/sheep/cattle
    private Integer age;
    private Integer ageMonths;
    private String ageGroup; //adult or puppy
    // private boolean isNeutered;
    // private boolean isActive;
    private Date deletedAt;
    private Date createdAt;
    private Date updatedAt;

}
