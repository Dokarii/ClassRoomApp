package com.example.ClassRoomApp.Services;

import com.example.ClassRoomApp.Repositories.IAttendance;
import com.example.ClassRoomApp.Models.Attendance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttendanceServices {
    @Autowired
    IAttendance repository;

    public Attendance saveAssistance(Attendance assistance)throws Exception{
        try{
            return this.repository.save(assistance);
        }catch (Exception error){
            throw new RuntimeException(error.getMessage());
        }
    }
}
