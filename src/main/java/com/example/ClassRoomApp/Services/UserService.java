package com.example.ClassRoomApp.Services;

import com.example.ClassRoomApp.Models.User;
import com.example.ClassRoomApp.Repositories.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    IUser repository;

    //Crear los metodos para guardar
    public User saveUser(User userDatas){
        try{
            return this.repository.save(userDatas);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    //Crear los metodos para buscarTodos

    //Crear los metodos para buscarUnoPorId

    //Crear los metodos para eliminar
}
