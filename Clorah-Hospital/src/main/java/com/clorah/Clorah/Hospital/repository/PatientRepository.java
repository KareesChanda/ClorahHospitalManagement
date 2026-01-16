package com.clorah.Clorah.Hospital.repository;

import com.clorah.Clorah.Hospital.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository  extends JpaRepository<Patient, Long> {
}
