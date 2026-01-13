package com.clorah.Clorah.Hospital.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Appointment_Id")
    private Long id;
    private long patientId;
    private long doctorId;
    private String date;

}
