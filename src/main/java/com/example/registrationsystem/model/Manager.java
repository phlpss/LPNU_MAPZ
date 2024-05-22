package com.example.registrationsystem.model;


import java.util.List;

public class Manager extends User {
    public Manager(String firstName, String lastName, String email) {
        super(firstName, lastName, email);
    }

    public Student findStudent(String searchCriteria) {
        // Find student by criteria
        return null;
    }

    public void formGroup(List<Student> students) {
        // Form a group of students
    }

    public void assignSpecialization(Student student, String specialization) {
        // Assign specialization to student
    }

    public void enrollInCourse(Student student, String course) {
        // Enroll student in a course
    }

    public void removeDuplicateAccounts() {
        // Remove duplicate accounts
    }
}