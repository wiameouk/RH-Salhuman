package com.example.rhsalhuman.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String departement;
    private String poste;
    private Date dateEmbauche;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL , orphanRemoval = true)
    private List<FicheDePaie> ficheDePaies = new ArrayList<>();
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL , orphanRemoval = true)
    private List<Conge> conges = new ArrayList<>();

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL , orphanRemoval = true)
    private List<HeureTravail> heureTravails= new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;



}
