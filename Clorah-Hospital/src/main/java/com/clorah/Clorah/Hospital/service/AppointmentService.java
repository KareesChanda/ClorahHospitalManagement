package com.clorah.Clorah.Hospital.service;


import com.clorah.Clorah.Hospital.models.Appointment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    //Logger is important to manage errors as the application complexity grows
    private static final Logger logger = LoggerFactory.getLogger(DoctorService.class);

    //create appointment
    public Appointment createAppointment(Appointment appointment){
        //logic to now create the appointment into the db
        try{
            return null;
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
            logger.error("An error occurred while creating an appointment: {}", e.getMessage());
            return null;
        }
    }

    public Appointment updateAppointment(Long id){
        try{
            System.out.println("appointment updating");
            return null;
        }catch(Exception e){
            System.out.println("Error Message: " + e.getMessage());
            logger.error("An error occurred while updating an appointment with id {}: {}", id, e.getMessage());
            return null;
        }
    }

    public Appointment getAppointmentById (Long id){
        try{
            return null;
        }catch (Exception e) {
            logger.error("An error occurred while getting an appointment with id {}: {}", id, e.getMessage());
            return null;
        }
    }

    public List<Appointment> getAllAppointments(){
        try{
            return null;
        }catch(Exception e){
            System.out.println("Error Message: " + e.getMessage());
            logger.error("An error occurred while getting all appointments: {}", e.getMessage());
            return null;
        }
    }



    public void deleteAppointment(Long id){
        try{
            System.out.println("Appointment deleting");
        }catch(Exception e){
            System.out.println("Error Message: " + e.getMessage());
            logger.error("An error occurred while deleting an appointment with id {}: {}", id, e.getMessage());
        }
    }
}
