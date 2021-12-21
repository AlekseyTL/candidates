package ru.leroymerlin.candidate.api.http.dto;

import lombok.Data;

@Data
public class CandidateParams {
    private int id;
    private String name;
    private String surname;
    private GradeParams grage;

    public CandidateParams() {
        this.id = 0;
        this.name = "Test";
        this.surname = "surTest";
        this.grage = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public GradeParams getGrage() {
        return grage;
    }

    public void setGrage(GradeParams grage) {
        this.grage = grage;
    }
}
