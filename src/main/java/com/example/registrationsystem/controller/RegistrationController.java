package com.example.registrationsystem.controller;
import com.example.registrationsystem.dto.StudentDTO;
import com.example.registrationsystem.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/registration")
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @PostMapping("/register")
    public String registerStudent(@RequestBody StudentDTO studentDTO) {
        registrationService.registerStudent(studentDTO.getFirstName(), studentDTO.getLastName(), studentDTO.getEmail());
        return "Registration successful. Please check your email to confirm your registration.";
    }

    @GetMapping("/confirm")
    public String confirmRegistration(@RequestParam("email") String email, @RequestParam("code") String confirmationCode) {
        registrationService.confirmRegistration(email, confirmationCode);
        return "Registration confirmed. You can now log in.";
    }
}
