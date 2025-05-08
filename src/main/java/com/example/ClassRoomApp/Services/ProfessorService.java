package com.example.ClassRoomApp.Services;

import com.example.ClassRoomApp.Models.Professor;
import com.example.ClassRoomApp.Repositories.IProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    @Autowired
    IProfessorRepository repository;

    //guardar
    public Professor saveTeacher(Professor teacher)throws Exception{
        try {
            return this.repository.save(teacher);
        }catch (Exception error){
            throw new RuntimeException(error.getMessage());
        }
    }

    //Buscar todos
    public List<Professor> searcheAll()throws Exception{
        try{
            return this.repository.findAll();
        }catch (Exception error){
            throw new RuntimeException(error.getMessage());
        }
    }
}
