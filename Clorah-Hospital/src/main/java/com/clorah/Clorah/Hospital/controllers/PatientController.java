package com.clorah.Clorah.Hospital.controllers;

import com.clorah.Clorah.Hospital.models.Patient;
import com.clorah.Clorah.Hospital.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {
    //let's connect the Patient controller to the patient service
    @Autowired //this autowire annotation is an automatic dependency injection using ioc to revert controll of bean lifecycle to the JVM
    private PatientService patientService; //this is known as a BEAN which is really an object using auto wired to connect us to the patientService

    //API to create a new Patient record
    @PostMapping("/create-patient")
    public Patient createPatient (@RequestBody Patient patient){
        System.out.println("Creating Patient");
        return patientService.createPatient(patient);
    }

    //retrieve patient by ID
    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable Long id){
        //use IOC to get the data via bean injection
        return patientService.getPatientById(id);
    }

    //update patient information
    @PutMapping("/{id}")
    public void updatePatientInfo(@PathVariable Long id){
        patientService.updatePatient(id);
    }

    //API to retrieve all patients
    @GetMapping
    public List<Patient> getAllPatients (){
        System.out.println("Fetching patients");
        return patientService.getAllPatients();
    }

    //Delete patient record based on ID
    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Long id){
        //delete particular patient with unique id
        patientService.deletePatient(id);

    }
}
