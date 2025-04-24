package com.example.ClassRoomApp.Services;

import com.example.ClassRoomApp.Repositories.IGrade;
import com.example.ClassRoomApp.Models.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GradeService {
    @Autowired
    IGrade grade;

    //Crear los metodos para guardar
    public Grade saveGrade(Grade gradeDatas) {
        try {
            return this.grade.save(gradeDatas);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
