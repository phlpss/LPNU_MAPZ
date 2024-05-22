package com.example.registrationsystem.model;

public class Student extends User {
    public Student(String firstName, String lastName, String email) {
        super(firstName, lastName, email);
    }

    public void register() {
        // Register student
    }

    public void confirmRegistration(String confirmationCode) {
        // Confirm student registration
    }

}
