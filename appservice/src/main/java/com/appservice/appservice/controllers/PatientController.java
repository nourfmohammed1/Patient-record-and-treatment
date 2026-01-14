/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.appservice.appservice.controllers;

import com.appservice.appservice.models.Patient.Patient;
import com.appservice.appservice.services.PatientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nour
 */
@RestController
@RequestMapping("/patients")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @GetMapping("/")
    public ResponseEntity<List<Patient>> showAllPatients() {
        List<Patient> patients = this.patientService.getAllPatients(); 
        
        return new ResponseEntity<>(patients, HttpStatus.OK); 
    }

    @GetMapping("/{id}")
    public ResponseEntity<Patient> getPatientById(@PathVariable Long id) {
        Patient retrievedItem = this.patientService.getPatientById(id);
        
        return new ResponseEntity<>(retrievedItem, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Patient> addPatient(@RequestBody Patient patient) {
        Patient newPatient = this.patientService.addPatient(patient);
        
        return new ResponseEntity<>(newPatient, HttpStatus.CREATED);
    }
    
@GetMapping("/nationalid/{nationalId}")
public Patient getPatientByNationalId(@PathVariable("nationalId") String nationalId) {
    return patientService.getPatientByNationalId(nationalId);
}
    
}
