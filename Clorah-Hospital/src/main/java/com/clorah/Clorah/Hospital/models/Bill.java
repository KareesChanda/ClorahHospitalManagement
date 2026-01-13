package com.clorah.Clorah.Hospital.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Bill_Id")
    private Long id;

    private Long patientId;
    private double amount;
    private String status;



}
