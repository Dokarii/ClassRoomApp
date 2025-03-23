package com.example.ClassRoomApp.Models;

import  java.util.Date;

public class Inscription {
    private Integer idInscription;
    //idEstudiante
    //idCurso
    private Date inscriptionDate;

    public Inscription() {
    }

    public Inscription(Integer idInscription, Date inscriptionDate) {
        this.idInscription = idInscription;
        this.inscriptionDate = inscriptionDate;
    }

    public Integer getIdInscription() {
        return idInscription;
    }

    public void setIdInscription(Integer idInscription) {
        this.idInscription = idInscription;
    }

    public Date getInscriptionDate() {
        return inscriptionDate;
    }

    public void setInscriptionDate(Date inscriptionDate) {
        this.inscriptionDate = inscriptionDate;
    }
}
