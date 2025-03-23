package com.example.ClassRoomApp.Models;

import java.util.Date;

public class Student {
    private Integer id_estudent;
    //id_user
    private Integer grade;
    private Date born_day;
    private String address;

    public Student() {
    }

    public Student(Integer id_estudent, Integer grade, Date born_day, String address) {
        this.id_estudent = id_estudent;
        this.grade = grade;
        this.born_day = born_day;
        this.address = address;
    }

    public Integer getid_estudent() {
        return id_estudent;
    }

    public void setid_estudent(Integer id_estudent) {
        this.id_estudent = id_estudent;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Date getBorn_day() {
        return born_day;
    }

    public void setBorn_day(Date born_day) {
        this.born_day = born_day;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
