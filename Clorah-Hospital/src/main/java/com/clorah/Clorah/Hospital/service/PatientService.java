package com.clorah.Clorah.Hospital.service;

import com.clorah.Clorah.Hospital.models.Patient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    // so I have now added the logger Log4j2 to our project so that we can have a better handle on failures as comlexity increases.
    //let's define and use the logger
    private static final Logger logger = LoggerFactory.getLogger(PatientService.class);


    public Patient createPatient(Patient patient){
        //logic to now create the patient into the db
        try{
            return null;
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
            logger.error("An error occurred while creating patient: {}", e.getMessage());
            return null;
        }
    }

    public Patient getPatientById (Long id){
        try{
            return null;
        }catch (Exception e) {
            logger.error("An error occurred while fetching patient with ID {}: {}", id, e.getMessage());
            return null;
        }
    }
    public List<Patient> getAllPatients(){
            try{
                System.out.println("into service layer");
                return null;
            }catch(Exception e){
                System.out.println("Error Message: " + e.getMessage());
                logger.error("An error occurred while fetching all patients: {}", e.getMessage());
                return null;
            }
    }


    public Patient updatePatient(Long id){
        try{
            System.out.println("patient updating");
            return null;
        }catch(Exception e){
            System.out.println("Error Message: " + e.getMessage());
            logger.error("An error occurred while updating patient: {}", e.getMessage());
            return null;
        }
    }

    public void deletePatient(Long id){
        try{
            System.out.println("patient deleting");

        }catch(Exception e){
            System.out.println("Error Message: " + e.getMessage());
            logger.error("An error occurred while deleting patient with ID {}: {}", id, e.getMessage());

        }
    }


}
