package com.example.ClassRoomApp.Services;

import com.example.ClassRoomApp.Models.Inscription;
import com.example.ClassRoomApp.Repositories.IInscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InscriptionServices {
    @Autowired
    IInscription repository;

    public Inscription saveRegistration(Inscription registration)throws Exception{
        try{
            return this.repository.save(registration);
        }catch (Exception error){
            throw new RuntimeException(error.getMessage());
        }
    }
}
