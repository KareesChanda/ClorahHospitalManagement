package com.clorah.Clorah.Hospital.service;
import com.clorah.Clorah.Hospital.models.Doctor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    public Doctor createDoctor(Doctor doctor){
        //logic to now create the doctor into the db
        try{
            return null;
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
            return null;
        }
    }

    public Doctor getDoctorById (Long id){
        try{
            return null;
        }catch (Exception e) {
            return null;
        }
    }
    public List<Doctor> getAllDoctors(){
        try{
            return null;
        }catch(Exception e){
            System.out.println("Error Message: " + e.getMessage());
            return null;
        }
    }


    public Doctor updateDoctor(Long id){
        try{
            System.out.println("patient updating");
            return null;
        }catch(Exception e){
            System.out.println("Error Message: " + e.getMessage());
            return null;
        }
    }

    public void deleteDoctor(Long id){
        try{
            System.out.println("patient deleting");
        }catch(Exception e){
            System.out.println("Error Message: " + e.getMessage());
        }
    }
}
