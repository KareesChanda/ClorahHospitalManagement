package com.clorah.Clorah.Hospital.service;


import com.clorah.Clorah.Hospital.models.Appointment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {
    //create appointment
    public Appointment createAppointment(Appointment appointment){
        //logic to now create the appointment into the db
        try{
            return null;
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
            return null;
        }
    }

    public Appointment updateAppointment(Long id){
        try{
            System.out.println("appointment updating");
            return null;
        }catch(Exception e){
            System.out.println("Error Message: " + e.getMessage());
            return null;
        }
    }

    public Appointment getAppointmentById (Long id){
        try{
            return null;
        }catch (Exception e) {
            return null;
        }
    }

    public List<Appointment> getAllAppointments(){
        try{
            return null;
        }catch(Exception e){
            System.out.println("Error Message: " + e.getMessage());
            return null;
        }
    }



    public void deleteAppointment(Long id){
        try{
            System.out.println("Appointment deleting");
        }catch(Exception e){
            System.out.println("Error Message: " + e.getMessage());
        }
    }
}
