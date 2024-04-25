package com.example.rhsalhuman.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FicheDePaie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int periode;
    private double montantBrut;
    private double montantNet;
    private String detailsDeductions;

    @ManyToOne
    private Employee employee;

    @OneToMany(mappedBy = "ficheDePaie", cascade = CascadeType.ALL , orphanRemoval = true)
    private List<ElementSalaire> elementSalaires= new ArrayList<>();



}
