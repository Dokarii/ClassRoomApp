package com.example.ClassRoomApp.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "courses")
public class Course {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCourse")
    private Integer id;

    @Column(name = "name", length = 100, unique = false, nullable = false)
    private String name;

    //Creating ManyToOne relation
    @ManyToOne
    @JoinColumn(name = "fk_proffessor", referencedColumnName = "id")
    @JsonBackReference
    private Professor professor;

    //1toMany relations
    @OneToMany(mappedBy = "course")//=Como es conocido esta tabla en la tabla asistencias
    @JsonManagedReference//la que tenga la one lleva jsonmanage
    private List<Attendance> attendance;


    public Course() {
    }

    public Course(Integer id, String name) {
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
