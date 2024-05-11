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

    private String type;
    private double montant;

    @ManyToOne
    private FicheDePaie ficheDePaie;

    public double getTauxHoraire() {

        if (ficheDePaie != null) {
            // Vous pouvez accéder au taux horaire à partir de la fiche de paie et le retourner
            return ficheDePaie.getTauxHoraire();
        } else {
            // Si la fiche de paie n'est pas définie, retournez une valeur par défaut
            return 0.0; // Remplacer 0.0 par le taux horaire par défaut ou une autre valeur appropriée
        }
    }

    // Méthode pour obtenir le nombre d'heures travaillées
    public double getHeuresTravaillees() {

        if (ficheDePaie != null) {
            // Vous pouvez accéder au nombre d'heures travaillées à partir de la fiche de paie et le retourner
            return ficheDePaie.getHeuresTravaillees();
        } else {
            // Si la fiche de paie n'est pas définie, retournez une valeur par défaut
            return 0.0; // Remplacer 0.0 par le nombre d'heures travaillées par défaut ou une autre valeur appropriée
        }
    }
}
