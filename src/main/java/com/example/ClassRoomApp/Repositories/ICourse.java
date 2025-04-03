package com.example.ClassRoomApp.Repositories;

import com.example.ClassRoomApp.Models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourse extends JpaRepository<Course, Integer>{

}
