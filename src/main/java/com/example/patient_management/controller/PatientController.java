package com.example.patient_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.patient_management.model.Patient;
import com.example.patient_management.service.PatientService;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientService service;

    // CREATE
    @PostMapping
    public Patient addPatient(@RequestBody Patient patient) {
        return service.savePatient(patient);
    }

    // READ
    @GetMapping
    public List<Patient> getAllPatients() {
        return service.getAllPatients();
    }

    // UPDATE
    @PutMapping("/{id}")
    public Patient updatePatient(@PathVariable String id, @RequestBody Patient patient) {
        return service.updatePatient(id, patient);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deletePatient(@PathVariable String id) {
        service.deletePatient(id);
        return "Patient deleted successfully";
    }


}
