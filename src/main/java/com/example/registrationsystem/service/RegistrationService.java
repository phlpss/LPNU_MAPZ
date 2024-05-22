package com.example.registrationsystem.service;

import com.example.registrationsystem.model.Student;

public class RegistrationService {
    private EmailService emailService;

    public RegistrationService() {
        this.emailService = new EmailService();
    }

    public void registerStudent(String firstName, String lastName, String email) {
        Student student = new Student(firstName, lastName, email);
        student.save();
        String confirmationLink = generateConfirmationLink(email);
        emailService.sendConfirmationEmail(student, confirmationLink);
    }

    public void confirmRegistration(String email, String confirmationCode) {
        // Confirm student registration
    }

    private String generateConfirmationLink(String email) {
        // Generate a confirmation link
        return "http://example.com/confirm?email=" + email + "&code=123456";
    }
}