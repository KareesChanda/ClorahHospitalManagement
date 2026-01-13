package com.clorah.Clorah.Hospital.controllers;

import com.clorah.Clorah.Hospital.models.Patient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {
    //API to create a new Patient record
    @PostMapping("/create-patient")
    public Patient createPatient (@RequestBody Patient patient){
        System.out.println("Patient created");
        return patient;
    }

    //retrieve patient by ID
    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable Long id){
        //use IOC to get the data via bean injection
        return null;
    }

    //update patient information
    @PutMapping("/{id}")
    public void updatePatientInfo(@PathVariable Long id){

    }

    //API to retrieve all patients
    @GetMapping
    public List<Patient> getAllPatients (){
        System.out.println("Fetching patients");
        return null;
    }

    //Delete patient record based on ID
    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Long id){
        //delete particular patient with unique id

    }
}
