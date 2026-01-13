package com.clorah.Clorah.Hospital.service;

import com.clorah.Clorah.Hospital.models.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    public Patient createPatient(Patient patient){
        //logic to now create the patient into the db
        try{
            return null;
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
            return null;
        }
    }

    public Patient getPatientById (Long id){
        try{
            return null;
        }catch (Exception e) {
            return null;
        }
    }
    public List<Patient> getAllPatients(){
            try{
                System.out.println("into service layer");
                return null;
            }catch(Exception e){
                System.out.println("Error Message: " + e.getMessage());
                return null;
            }
    }


    public Patient updatePatient(Long id){
        try{
            System.out.println("patient updating");
            return null;
        }catch(Exception e){
            System.out.println("Error Message: " + e.getMessage());
            return null;
        }
    }

    public void deletePatient(Long id){
        try{
            System.out.println("patient deleting");

        }catch(Exception e){
            System.out.println("Error Message: " + e.getMessage());

        }
    }


}
