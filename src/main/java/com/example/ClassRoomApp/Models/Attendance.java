package com.example.ClassRoomApp.Models;

import java.util.Date;

public class Attendance {
    private Integer idAttendance;
    //IdEstudiante
    //Idcurso
    private Date date;
    private Status Status;

    public Attendance() {
    }

    public Attendance(Integer idAttendance, Date date, com.example.ClassRoomApp.Models.Status status) {
        this.idAttendance = idAttendance;
        this.date = date;
        Status = status;
    }

    public Integer getIdAttendance() {
        return idAttendance;
    }

    public void setIdAttendance(Integer idAttendance) {
        this.idAttendance = idAttendance;
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
