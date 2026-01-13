package com.clorah.Clorah.Hospital.controllers;


import com.clorah.Clorah.Hospital.models.Doctor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/doctors")
public class DoctorController {

    //Generate a Bill
    @PostMapping("/create-doctor")
    public Doctor createDoctor (@RequestBody Doctor doctor){
        System.out.println("Doctor created ");
        return null;
    }

    //edit a bill
    @PutMapping("/{id}")
    public void editDoctor(@PathVariable Long id){
        System.out.println("Edit a doctor's profile");
    }

    //get a bill by unique id
    @GetMapping("/{id}")
    public Doctor getDoctorById (@PathVariable Long id) {
        return null;
    }

    //List all bills
    @GetMapping
    public List<Doctor> getAllBills(){
        System.out.println("Fetching all Doctors");
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteDoctor(@PathVariable Long id){

    }
}
