package com.example.registrationsystem.model;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String title;
    private String description;
    private List<Student> students;

    public Course(String title, String description) {
        this.title = title;
        this.description = description;
        this.students = new ArrayList<>();
    }
}