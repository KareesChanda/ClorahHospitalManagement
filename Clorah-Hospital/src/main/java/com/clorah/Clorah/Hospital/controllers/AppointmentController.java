package com.clorah.Clorah.Hospital.controllers;

import com.clorah.Clorah.Hospital.models.Appointment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/appointments")
public class AppointmentController {

    //Generate a Bill
    @PostMapping("/create-apt")
    public Appointment createBill (@RequestBody Appointment appointment){
        System.out.println("Apt created");
        return null;
    }

    //edit a bill
    @PutMapping("/{id}")
    public void editAppointment(@PathVariable Long id){
        System.out.println("Edit an appointment");
    }

    //get a bill by unique id
    @GetMapping("/{id}")
    public Appointment getAppointmentById (@PathVariable Long id) {
        return null;
    }

    //List all bills
    @GetMapping
    public List<Appointment> getAllAppointments(){
        System.out.println("Fetching all appointments");
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteAppointment(@PathVariable Long id){

    }
}
