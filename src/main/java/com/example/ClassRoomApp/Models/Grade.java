package com.example.ClassRoomApp.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Grade {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "grade", nullable = false)
    private float grade;

    @Column(name = "examDate", nullable = false)
    private Date examDate;

    //creando relacion(muchos a 1) con estudiantes
    @ManyToOne
    @JoinColumn(name = "fk_student", referencedColumnName = "id")
    @JsonBackReference
    private Student student;

    //creando relacion(muchos a 1) con materias
    @ManyToOne
    @JoinColumn(name = "fk_subject", referencedColumnName = "id")
    @JsonBackReference//la que tenga la many lleva jsonback
    private Subject subject;

    public Grade() {
    }

    public Grade(Integer id, float grade, Date examDate) {
        this.id = id;
        this.grade = grade;
        this.examDate = examDate;
    }

    public Integer getid() {
        return id;
    }

    public void setid(Integer id) {
        this.id = id;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public Date getExamDate() {
        return examDate;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }
}
