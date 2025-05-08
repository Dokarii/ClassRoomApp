package com.example.ClassRoomApp.Controllers;

import com.example.ClassRoomApp.Models.Professor;
import com.example.ClassRoomApp.Services.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ProfessorController {
    @Autowired
    ProfessorService service;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Professor sentDatas) {
        try {

            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(this.service.saveTeacher(sentDatas));

        } catch (Exception e){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(e.getMessage());
        }
    }
}
