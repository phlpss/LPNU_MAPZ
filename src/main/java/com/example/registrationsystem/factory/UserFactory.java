package com.example.registrationsystem.factory;

import com.example.registrationsystem.model.User;
import com.example.registrationsystem.model.Student;
import com.example.registrationsystem.model.Manager;

public class UserFactory {

    public static User createUser(String type, String firstName, String lastName, String email) {
        if ("Student".equalsIgnoreCase(type)) {
            return new Student(firstName, lastName, email);
        } else if ("Manager".equalsIgnoreCase(type)) {
            return new Manager(firstName, lastName, email);
        } else {
            throw new IllegalArgumentException("Invalid user type");
        }
    }
}
