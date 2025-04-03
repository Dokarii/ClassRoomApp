package com.example.ClassRoomApp.Models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProfessor")
    private Integer id;
    
    
    private String speciality;

    //Creating @OneToMany relation
    @OneToMany(mappedBy = "professor")
    @JsonManagedReference
    private List<Course> courses;

    public Professor() {
    }

    public Professor(Integer id, String speciality) {
        this.id = id;
        this.speciality = speciality;
    }

    public Integer getid() {
        return id;
    }

    public void setid(Integer id) {
        this.id = id;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
