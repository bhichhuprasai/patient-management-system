package com.example.patient_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.patient_management.model.Patient;
import com.example.patient_management.repository.PatientRepository;

@Service
public class PatientService {

    @Autowired
    private PatientRepository repository;

    // CREATE
    public Patient savePatient(Patient patient) {
        return repository.save(patient);
    }

    // READ
    public List<Patient> getAllPatients() {
        return repository.findAll();
    }

    // UPDATE
    public Patient updatePatient(String id, Patient patient) {
        patient.setId(id);
        return repository.save(patient);
    }

    // DELETE
    public void deletePatient(String id) {
        repository.deleteById(id);
    }
}
