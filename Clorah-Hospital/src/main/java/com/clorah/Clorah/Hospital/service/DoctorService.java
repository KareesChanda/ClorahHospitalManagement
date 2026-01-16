package com.clorah.Clorah.Hospital.service;
import com.clorah.Clorah.Hospital.models.Doctor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class DoctorService {
    //Logger is important to manage errors as the application complexity grows
    private static final Logger logger = LoggerFactory.getLogger(DoctorService.class);

    public Doctor createDoctor(Doctor doctor){
        //logic to now create the doctor into the db
        try{
            return null;
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
            logger.error("An error occurred while creating doctor: {}", e.getMessage());
            return null;
        }
    }

    public Doctor getDoctorById (Long id){
        try{
            return null;
        }catch (Exception e) {
            logger.error("An error occurred while getting the doctor with id {}: {}", id, e.getMessage());
            return null;
        }
    }
    public List<Doctor> getAllDoctors(){
        try{
            return null;
        }catch(Exception e){
            System.out.println("Error Message: " + e.getMessage());
            logger.error("An error occurred while getting all doctors: {}", e.getMessage());
            return null;
        }
    }


    public Doctor updateDoctor(Long id, @RequestBody Doctor doctor){
        try{
            System.out.println("patient updating");
            return null;
        }catch(Exception e){
            System.out.println("Error Message: " + e.getMessage());
            logger.error("An error occurred while updating doctor with id {}: {}" , id, e.getMessage());
            return null;
        }
    }

    public void deleteDoctor(Long id){
        try{
            System.out.println("patient deleting");
        }catch(Exception e){
            System.out.println("Error Message: " + e.getMessage());
            logger.error("An error occurred while deleting doctor with id {}: {}", id, e.getMessage());
        }
    }
}
