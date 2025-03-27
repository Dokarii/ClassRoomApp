package com.example.ClassRoomApp.Models;
import jakarta.persistence.*;

@Entity
@Table(name = "courses")
public class Course {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCourse")
    private Integer id;

    @Column(name = "nombre", length = 100, unique = false, nullable = false)
    private String name;
    //idProfessor


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
