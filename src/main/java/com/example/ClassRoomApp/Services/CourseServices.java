package com.example.ClassRoomApp.Services;

import com.example.ClassRoomApp.Models.Course;
import com.example.ClassRoomApp.Repositories.ICourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServices {
    @Autowired
    ICourse repository;

    public Course saveCourse(Course course)throws Exception{
        try{
            return this.repository.save(course);
        }catch (Exception error){
            throw new RuntimeException(error.getMessage());
        }
    }
}
