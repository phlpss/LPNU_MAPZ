package com.example.registrationsystem.repository;

import com.example.registrationsystem.model.Specialization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecializationRepository extends JpaRepository<Specialization, Long> {
    // Methods to handle Specialization data access
}