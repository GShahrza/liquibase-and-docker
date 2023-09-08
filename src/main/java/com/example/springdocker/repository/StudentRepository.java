package com.example.springdocker.repository;

import com.example.springdocker.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query(value = "select * from v_student",nativeQuery = true)
    String getView();
}
