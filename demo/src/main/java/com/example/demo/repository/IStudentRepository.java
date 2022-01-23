package com.example.demo.repository;

import com.example.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IStudentRepository extends JpaRepository<Student, Long> {

    @Query(value = "SELECT * FROM jazdatabase.students WHERE groupnumber = ?1", nativeQuery = true)
    List<Student> findStudentsByGroup(String groupnumber);



}
