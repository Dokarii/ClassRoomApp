package com.example.ClassRoomApp.Repositories;

import com.example.ClassRoomApp.Models.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISubject extends JpaRepository<Subject, Integer> {

}
