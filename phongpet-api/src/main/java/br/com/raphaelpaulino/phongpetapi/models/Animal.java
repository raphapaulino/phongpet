package br.com.raphaelpaulino.phongpetapi.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Animal {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String uuid;

    @Column
    private String name;

    @Column
    private String photo;

    @Column(name = "born_date")
    private String bornDate;

    @Column
    private String nameSlug;

    @Column
    private String specie;

    @Column
    private String color;

    @Column
    private String gender;

    @Column
    private String size; // mini/standard/large/xl

    @Column
    private String coat;

    @Column
    private String breed; // dog/cat/horse/sheep/cattle

    @Column
    private Integer age;

    @Column
    private Integer ageMonths;

    @Column
    private String ageGroup; //adult or puppy

    @Column
    private Boolean isNeutered;

    @Column
    private Boolean isActive;

    @Column
    private LocalDateTime deletedAt;

    @JsonIgnore
    @CreationTimestamp
    @Column(nullable = false, columnDefinition = "datetime")
    private LocalDateTime createdAt;

    @JsonIgnore
    @UpdateTimestamp
    @Column(nullable = false, columnDefinition = "datetime")
    private LocalDateTime updatedAt;

    // Relationships
    @ManyToOne
    private Company company;

    @ManyToOne
    private User user;

}
