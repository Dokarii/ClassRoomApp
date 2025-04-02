package com.example.ClassRoomApp.Models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "grade", unique = true, nullable = false)
    private Integer grade;

    @Column(name = "borndate")
    private Date borndate;

    @Column(name = "address", length = 255, nullable = false)
    private String address;

    //creando relacion(1 a muchos) con calificaciones
    @OneToMany(mappedBy = "student")
    @JsonManagedReference
    private List<Grade> Grade;

    //creando relacion(1 a muchos) con asistencia
    @OneToMany(mappedBy = "student")
    @JsonManagedReference
    private List<Attendance> attendance;

    public Student() {
    }

    public Student(Integer id, Integer grade, Date borndate, String address) {
        this.id = id;
        this.grade = grade;
        this.borndate = borndate;
        this.address = address;
    }

    public Integer getid() {
        return id;
    }

    public void setid(Integer id) {
        this.id = id;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Date getborndate() {
        return borndate;
    }

    public void setborndate(Date borndate) {
        this.borndate = borndate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
