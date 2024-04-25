package com.example.rhsalhuman.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ElementSalaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type ;
    private double montant;
    @ManyToOne
    private FicheDePaie ficheDePaie;

}

