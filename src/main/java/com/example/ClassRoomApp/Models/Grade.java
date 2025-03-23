package com.example.ClassRoomApp.Models;

import java.util.Date;

public class Grade {
    private Integer idGrade;
    //idEstudiante
    //idMateria
    private float grade;
    private Date examDate;

    public Grade() {
    }

    public Grade(Integer idGrade, float grade, Date examDate) {
        this.idGrade = idGrade;
        this.grade = grade;
        this.examDate = examDate;
    }

    public Integer getIdGrade() {
        return idGrade;
    }

    public void setIdGrade(Integer idGrade) {
        this.idGrade = idGrade;
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
