package com.example.ClassRoomApp.Services;

import com.example.ClassRoomApp.Models.Grade;
import com.example.ClassRoomApp.Repositories.IGrade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GradesServices {
    @Autowired
    IGrade repository;

    public Grade saveQualifications(Grade qualification)throws Exception{
        try{
            return this.repository.save(qualification);
        }catch (Exception error){
            throw new RuntimeException(error.getMessage());
        }
    }
}
