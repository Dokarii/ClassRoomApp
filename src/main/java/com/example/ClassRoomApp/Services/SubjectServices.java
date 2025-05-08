package com.example.ClassRoomApp.Services;


import com.example.ClassRoomApp.Models.Subject;
import com.example.ClassRoomApp.Models.Professor;
import com.example.ClassRoomApp.Repositories.ISubject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectServices {

    @Autowired
    ISubject repository;

    //guardar
    public Subject saveSubject(Subject subject)throws Exception{
        try {
            return this.repository.save(subject);
        }catch (Exception error){
            throw new RuntimeException(error.getMessage());
        }
    }


}
