package com.example.registrationsystem.controller;

import com.example.registrationsystem.model.Student;
import com.example.registrationsystem.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    @GetMapping("/findStudent")
    public Student findStudent(@RequestParam("criteria") String criteria) {
        return managerService.findStudent(criteria);
    }

    @PostMapping("/formGroup")
    public String formGroup(@RequestBody List<Student> students) {
        managerService.formGroup(students);
        return "Group formed successfully.";
    }

    @PostMapping("/assignSpecialization")
    public String assignSpecialization(@RequestBody Student student, @RequestParam("specialization") String specialization) {
        managerService.assignSpecialization(student, specialization);
        return "Specialization assigned successfully.";
    }

    @PostMapping("/enrollInCourse")
    public String enrollInCourse(@RequestBody Student student, @RequestParam("course") String course) {
        managerService.enrollInCourse(student, course);
        return "Student enrolled in course successfully.";
    }

    @DeleteMapping("/removeDuplicates")
    public String removeDuplicateAccounts() {
        managerService.removeDuplicateAccounts();
        return "Duplicate accounts removed successfully.";
    }
}