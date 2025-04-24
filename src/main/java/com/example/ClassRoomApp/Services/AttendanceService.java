package com.example.ClassRoomApp.Services;

import com.example.ClassRoomApp.Repositories.IAttendance;
import com.example.ClassRoomApp.Models.Attendance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttendanceService {
    @Autowired
    IAttendance attendance;

    public Attendance saveAttendance(Attendance attendanceDatas) {
        try {
            return this.attendance.save(attendanceDatas);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
