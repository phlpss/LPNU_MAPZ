package com.example.registrationsystem.model;

public class User {
    private String firstName;
    private String lastName;
    private String email;

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public void save() {
        // Save user to database
    }

    public void delete() {
        // Delete user from database
    }

    public void updateEmail(String newEmail) {
        this.email = newEmail;
        // Update email in database
    }

    public String getEmail() {
        return email;
    }
}
