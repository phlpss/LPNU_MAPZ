package com.example.registrationsystem.repository;

import com.example.registrationsystem.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {
    // Methods to handle Group data access
}