package com.example.rhsalhuman.services;

import com.example.rhsalhuman.entities.ElementSalaire;

import java.util.List;

public interface ElementSalaireService {

    List<ElementSalaire> getAllElementSalaires(); // Correction du nom de la méthode
    ElementSalaire getElementSalaireById(Long id);
    ElementSalaire saveElementSalaire(ElementSalaire elementSalaire);
    void deleteElementSalaire(Long id);
    ElementSalaire updateElementSalaire(ElementSalaire elementSalaire);

    void deleteElementSalaireById(Long elementSalaireId);

    ElementSalaire updateElementSalaire(Long elementSalaireId, ElementSalaire elementSalaire);
    double calculerSalaireTotal(ElementSalaire elementSalaire);
}
