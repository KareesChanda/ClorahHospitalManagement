package com.clorah.Clorah.Hospital.repository;

import com.clorah.Clorah.Hospital.models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository  extends JpaRepository<Doctor, Long> {
}
