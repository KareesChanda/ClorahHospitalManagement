package com.clorah.Clorah.Hospital.controllers;


import com.clorah.Clorah.Hospital.models.Doctor;
import com.clorah.Clorah.Hospital.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    //create  a Doctor
    @PostMapping("/create-doctor")
    public Doctor createDoctor (@RequestBody Doctor doctor){
        System.out.println("Creating Doctor ");
        return doctorService.createDoctor(doctor);
    }

    //get a Doctor by unique id
    @GetMapping("/{id}")
    public Doctor getDoctorById (@PathVariable Long id) {
        return doctorService.getDoctorById(id);
    }

    //List all doctors
    @GetMapping
    public List<Doctor> getAllDoctors(){
        System.out.println("Fetching all Doctors");
        return doctorService.getAllDoctors();
    }
    //edit a doctor
    @PutMapping("/{id}")
    public void editDoctor(@PathVariable Long id){
        System.out.println("Edit a doctor's profile");
        doctorService.updateDoctor(id);
    }

    @DeleteMapping("/{id}")
    public void deleteDoctor(@PathVariable Long id){
        doctorService.deleteDoctor(id);
    }
}
