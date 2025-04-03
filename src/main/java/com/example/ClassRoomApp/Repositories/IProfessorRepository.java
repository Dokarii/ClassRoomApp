package com.example.ClassRoomApp.Repositories;

import com.example.ClassRoomApp.Models.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProfessorRepository extends JpaRepository<Professor,Integer> {

}
