package com.example.ClassRoomApp.Repositories;

import com.example.ClassRoomApp.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudent extends  JpaRepository<Student, Integer>{

    //Si tengo consultas personalizadas, deben ir en este espacio
}
