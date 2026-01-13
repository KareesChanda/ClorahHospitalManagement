package com.clorah.Clorah.Hospital.controllers;

import com.clorah.Clorah.Hospital.models.Appointment;
import com.clorah.Clorah.Hospital.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/appointments")
public class AppointmentController {
    //connect to appointment service layer
    @Autowired
    private AppointmentService appointmentService;

    //create an appointment
    @PostMapping("/create-apt")
    public Appointment createAppointment (@RequestBody Appointment appointment){
        System.out.println("creating Appointment");
        return appointmentService.createAppointment(appointment);
    }

    //edit an appointment
    @PutMapping("/{id}")
    public void editAppointment(@PathVariable Long id){
        System.out.println("Edit an appointment");
        appointmentService.updateAppointment(id);
    }

    //get an appointment by unique id
    @GetMapping("/{id}")
    public Appointment getAppointmentById (@PathVariable Long id) {
        return appointmentService.getAppointmentById(id);
    }

    //List all appointments
    @GetMapping
    public List<Appointment> getAllAppointments(){
        System.out.println("Fetching all appointments");
        return appointmentService.getAllAppointments();
    }

    @DeleteMapping("/{id}")
    public void deleteAppointment(@PathVariable Long id){
        appointmentService.deleteAppointment(id);
    }
}
