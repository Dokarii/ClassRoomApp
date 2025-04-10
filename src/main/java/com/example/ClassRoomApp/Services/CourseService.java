package com.example.ClassRoomApp.Services;

import com.example.ClassRoomApp.Repositories.ICourse;
import com.example.ClassRoomApp.Models.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    ICourse course;

    //Crear los metodos para guardar
    public Course saveCourse(Course courseDatas) {
        try {
            return this.course.save(courseDatas);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    //Crear los metodos para buscarTodos

    //Crear los metodos para buscarUnoPorId

    //Crear los metodos para eliminar
}
