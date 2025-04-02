package com.example.ClassRoomApp.Models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSubject")
    private Integer id;

    @Column(name = "speciality", length = 100, nullable = false)
    private String name;

    @OneToMany(mappedBy = "subject")
    @JsonManagedReference//la que tenga la one lleva jsonmanage
    private List<Grade> grades;

    public Subject() {
    }

    public Subject(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getid() {
        return id;
    }

    public void setid(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
