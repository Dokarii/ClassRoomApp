package com.example.ClassRoomApp.Repositories;

import com.example.ClassRoomApp.Models.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInscription extends JpaRepository<Inscription, Integer> {

}
