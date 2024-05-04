package com.example.rhsalhuman.servicesImpl;

import com.example.rhsalhuman.entities.Conge;
import com.example.rhsalhuman.repositories.CongeRepository;
import com.example.rhsalhuman.services.CongeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CongeServiceImpl implements CongeService {
    @Autowired
    private CongeRepository congeRepository;
    @Override
    public Conge saveConge(Conge conge) {
        return congeRepository.save(conge);
    }

    @Override
    public Conge updateConge(Long id, Conge conge) {

        Conge congeFound = congeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("conge not existe"));
        congeFound.setTypeConge(conge.getTypeConge());
        congeFound.setDateDebut(conge.getDateDebut());
        congeFound.setDateFin(conge.getDateFin());
        congeFound.setStatut(conge.getStatut());
        return congeRepository.save(congeFound);
    }

    @Override
    public void deleteCongeById(Long id) {
            Conge congeexiste = congeRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("conge not found"));
            congeRepository.deleteById(congeexiste.getId());

    }

    @Override
    public Conge getCongeById(Long id) {
        return congeRepository.findById(id).get();
    }

    @Override
    public List<Conge> getAllConges() {
        return congeRepository.findAll();
    }
}
