package com.example.ClassRoomApp.Models;

import com.example.ClassRoomApp.Helpers.*;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "Attendances")
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAttendance")
    private Integer id;

    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "status", nullable = false)
    private Status Status;

    @ManyToOne
    @JoinColumn(name = "fk_student", referencedColumnName = "id")
    @JsonBackReference//la que tenga la many lleva jsonback
    private Student student;

    //creando relacion(muchos a 1) con cursos
    @ManyToOne
    @JoinColumn(name = "fk_course", referencedColumnName = "id")
    @JsonBackReference//la que tenga la many lleva jsonback
    private Course course;

    public Attendance() {
    }

    public Attendance(Integer id, Date date, Status status) {
        this.id = id;
        this.date = date;
        Status = status;
    }

    public Integer getIdAssistance() {
        return id;
    }

    public void setIdAssistance(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public com.example.ClassRoomApp.Models.Status getStatus() {
        return Status;
    }

    public void setStatus(com.example.ClassRoomApp.Models.Status status) {
        Status = status;
    }
}
