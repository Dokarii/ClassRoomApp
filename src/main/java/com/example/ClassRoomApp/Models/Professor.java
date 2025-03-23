package com.example.ClassRoomApp.Models;

public class Professor {
    private Integer idProfessor;
    //IdUser
    private String speciality;

    public Professor() {
    }

    public Professor(Integer idProfessor, String speciality) {
        this.idProfessor = idProfessor;
        this.speciality = speciality;
    }

    public Integer getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(Integer idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
