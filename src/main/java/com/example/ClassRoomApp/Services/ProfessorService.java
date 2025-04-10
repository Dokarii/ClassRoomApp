package com.example.ClassRoomApp.Services;

import com.example.ClassRoomApp.Models.Professor;
import com.example.ClassRoomApp.Repositories.IProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService {
    @Autowired
    IProfessorRepository repository;

    //Crear los metodos para guardar
    public Professor saveProfessor(Professor professorDatas){
        try{
            return this.repository.save(professorDatas);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    //Crear los metodos para buscarTodos

    //Crear los metodos para buscarUnoPorId

    //Crear los metodos para eliminar

}
