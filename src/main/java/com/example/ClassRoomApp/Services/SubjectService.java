package com.example.ClassRoomApp.Services;

import com.example.ClassRoomApp.Models.Subject;
import com.example.ClassRoomApp.Repositories.ISubject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {
    @Autowired
    ISubject repository;

    //Crear los metodos para guardar
    public Subject saveSubject(Subject subjectDatas){
        try{
            return this.repository.save(subjectDatas);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    //Crear los metodos para buscarTodos

    //Crear los metodos para buscarUnoPorId

    //Crear los metodos para eliminar
}
