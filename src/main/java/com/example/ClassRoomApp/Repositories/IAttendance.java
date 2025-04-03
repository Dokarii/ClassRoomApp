package com.example.ClassRoomApp.Repositories;

import com.example.ClassRoomApp.Models.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //
public interface IAttendance extends JpaRepository<Attendance, Integer>{

}
