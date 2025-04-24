package com.example.ClassRoomApp.Services;

import com.example.ClassRoomApp.Models.Student;
import com.example.ClassRoomApp.Repositories.IStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    IStudent repository;

    //Crear los metodos para guardar
    public Student saveStudent(Student studentDatas){
        try{
            return this.repository.save(studentDatas);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    //Crear los metodos para buscarTodos

    //Crear los metodos para buscarUnoPorId

    //Crear los metodos para eliminar
}
