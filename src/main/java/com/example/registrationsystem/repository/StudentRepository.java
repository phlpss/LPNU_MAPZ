package com.example.registrationsystem.repository;

import com.example.registrationsystem.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends UserRepository {
    // Additional methods specific to Student can be defined here
}