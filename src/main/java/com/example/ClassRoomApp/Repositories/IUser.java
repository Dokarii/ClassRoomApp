package com.example.ClassRoomApp.Repositories;

import com.example.ClassRoomApp.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUser extends JpaRepository<User, Integer>{

}
