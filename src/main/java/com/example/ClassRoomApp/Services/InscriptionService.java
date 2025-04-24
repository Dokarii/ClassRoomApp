package com.example.ClassRoomApp.Services;

import com.example.ClassRoomApp.Models.Inscription;
import com.example.ClassRoomApp.Repositories.IInscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InscriptionService {
    @Autowired
    IInscription repository;
    //Crear los metodos para guardar
    public Inscription saveInscription(Inscription inscriptionDatas){
        try{
            return this.repository.save(inscriptionDatas);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
