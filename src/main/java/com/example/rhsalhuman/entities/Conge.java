package com.example.rhsalhuman.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Conge{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String typeConge;
    private Date dateDebut;
    private Date dateFin;
    private String statut;

    @ManyToOne
    private Employee employee;

}
