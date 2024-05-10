package com.example.rhsalhuman.servicesImpl;

import com.example.rhsalhuman.entities.ElementSalaire;
import com.example.rhsalhuman.repositories.ElementSalaireRepository;
import com.example.rhsalhuman.services.ElementSalaireService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor

public class ElementSalaireServiceImpl implements ElementSalaireService {
    private ElementSalaireRepository elementSalaireRepository;


    @Override
    public List<ElementSalaire> getAllElementSalaires() {
        return elementSalaireRepository.findAll();
    }

    @Override
    public ElementSalaire getElementSalaireById(Long id) {
        return elementSalaireRepository.findById(id).get();
    }

    @Override
    public ElementSalaire saveElementSalaire(ElementSalaire elementSalaire) {
        return elementSalaireRepository.save(elementSalaire);
    }

    @Override
    public void deleteElementSalaire(Long id) {
      elementSalaireRepository.deleteById(id);
    }

    @Override
    public ElementSalaire updateElementSalaire(ElementSalaire elementSalaire) {
        return elementSalaireRepository.save(elementSalaire);
    }

    @Override
    public void deleteElementSalaireById(Long elementSalaireId) {
        elementSalaireRepository.deleteById(elementSalaireId);
    }

    @Override
    public ElementSalaire updateElementSalaire(Long elementSalaireId, ElementSalaire elementSalaire) {
        return elementSalaire = elementSalaireRepository.save(elementSalaire);
    }


        @Override
        public double calculerSalaireTotal(ElementSalaire elementSalaire) {
            return elementSalaire.getTauxHoraire() * elementSalaire.getHeuresTravaillees();
    }
}
