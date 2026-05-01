package com.example.patient_management.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.patient_management.model.Patient;

public interface PatientRepository extends MongoRepository<Patient, String> {
}