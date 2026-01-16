package com.clorah.Clorah.Hospital.service;

import com.clorah.Clorah.Hospital.models.Patient;
import com.clorah.Clorah.Hospital.repository.PatientRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {
    // so I have now added the logger Log4j2 to our project so that we can have a better handle on failures as comlexity increases.
    //let's define and use the logger
    private static final Logger logger = LoggerFactory.getLogger(PatientService.class);

    @Autowired
    private PatientRepository patientRepository;


    public Patient createPatient(Patient patient){
        //logic to now create the patient into the db
        try{
            patientRepository.save(patient);
            return patient;
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
            logger.error("An error occurred while creating patient: {}", e.getMessage());
            return null;
        }
    }

    public Optional<Patient> getPatientById (Long id){
        try{
            return patientRepository.findById(id);
        }catch (Exception e) {
            logger.error("An error occurred while fetching patient with ID {}: {}", id, e.getMessage());
            return null;
        }
    }
    public List<Patient> getAllPatients(){
            try{
                System.out.println("Fetching all patients...");
                return patientRepository.findAll();
            }catch(Exception e){
                System.out.println("Error Message: " + e.getMessage());
                logger.error("An error occurred while fetching all patients: {}", e.getMessage());
                return null;
            }
    }


    public Patient updatePatient(Long id, @RequestBody Patient updatedPatient){
        try{
            System.out.println("patient updating");
            //use optional here to account for present and absent patients
            Optional<Patient> existingPatient = patientRepository.findById(id);
            if(existingPatient.isPresent()){
                Patient p = existingPatient.get();
                p.setName(updatedPatient.getName());
                p.setAge(updatedPatient.getAge());
                p.setGender(updatedPatient.getGender());
                //after collecting and changing info let's make sure to save
                patientRepository.save(p);
                return updatedPatient;

            }else{
                logger.error("Patient with the ID{} was not found" , id);
                return null;
            }


        }catch(Exception e){
            System.out.println("Error Message: " + e.getMessage());
            logger.error("An error occurred while updating patient: {}", e.getMessage());
            return null;
        }
    }

    public void deletePatient(Long id){
        try{
            logger.info("Deleting patient with id : {}" , id);
            patientRepository.deleteById(id);

        }catch(Exception e){
            System.out.println("Error Message: " + e.getMessage());
            logger.error("An error occurred while deleting patient with ID {}: {}", id, e.getMessage());

        }
    }


}
