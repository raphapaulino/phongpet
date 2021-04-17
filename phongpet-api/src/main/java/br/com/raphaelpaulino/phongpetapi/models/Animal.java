package br.com.raphaelpaulino.phongpetapi.models;

import java.util.Date;

public class Animal {

    protected Long id;
    protected String uuid;
    protected String photo;
    protected String name;
    protected String born_date;
    protected String name_slug;
    protected String specie;
    protected String color;
    protected String gender;
    protected String size;
    protected String coat;
    protected String breed;
    protected Integer age;
    protected Integer age_months;
    protected String age_group; //adult or puppy
    protected boolean is_neutered;
    protected boolean is_active;
    protected Date deleted_at;
    protected Date created_at;
    protected Date updated_at;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBorn_date() {
        return born_date;
    }

    public void setBorn_date(String born_date) {
        this.born_date = born_date;
    }

    public String getName_slug() {
        return name_slug;
    }

    public void setName_slug(String name_slug) {
        this.name_slug = name_slug;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCoat() {
        return coat;
    }

    public void setCoat(String coat) {
        this.coat = coat;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge_months() {
        return age_months;
    }

    public void setAge_months(Integer age_months) {
        this.age_months = age_months;
    }

    public String getAge_group() {
        return age_group;
    }

    public void setAge_group(String age_group) {
        this.age_group = age_group;
    }

    public boolean isIs_neutered() {
        return is_neutered;
    }

    public void setIs_neutered(boolean is_neutered) {
        this.is_neutered = is_neutered;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    public Date getDeleted_at() {
        return deleted_at;
    }

    public void setDeleted_at(Date deleted_at) {
        this.deleted_at = deleted_at;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }
}
