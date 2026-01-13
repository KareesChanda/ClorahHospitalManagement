package com.clorah.Clorah.Hospital.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Doctor_ID")
    private Long id;
    private String name;
    private String gender;
    private String speciality;
    private int age;
}
