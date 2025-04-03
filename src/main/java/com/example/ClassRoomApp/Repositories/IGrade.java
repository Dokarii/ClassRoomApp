package com.example.ClassRoomApp.Repositories;

import com.example.ClassRoomApp.Models.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGrade extends JpaRepository<Grade, Integer>{

}
