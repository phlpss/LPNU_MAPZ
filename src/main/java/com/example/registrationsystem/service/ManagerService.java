package com.example.registrationsystem.service;

import com.example.registrationsystem.model.Student;
import com.example.registrationsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService {

    @Autowired
    private StudentRepository studentRepository;

    public Student findStudent(String searchCriteria) {
        // Logic to find student by criteria (example: search by email)
        return studentRepository.findByEmail(searchCriteria);
    }

    public void formGroup(List<Student> students) {
        // Logic to form a group of students
    }

    public void assignSpecialization(Student student, String specialization) {
        // Logic to assign specialization to student
    }

    public void enrollInCourse(Student student, String course) {
        // Logic to enroll student in a course
    }

    public void removeDuplicateAccounts() {
        // Logic to remove duplicate accounts
    }
}
