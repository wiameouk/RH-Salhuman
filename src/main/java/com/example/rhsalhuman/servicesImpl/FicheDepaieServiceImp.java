package com.example.rhsalhuman.servicesImpl;

import com.example.rhsalhuman.entities.Conge;
import com.example.rhsalhuman.entities.FicheDePaie;
import com.example.rhsalhuman.repositories.FichePaieRepository;
import com.example.rhsalhuman.services.FicheDePaieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FicheDepaieServiceImp implements FicheDePaieService {

    @Autowired
    private FichePaieRepository fichePaieRepository;
    @Override
    public FicheDePaie saveFicheDePaie(FicheDePaie ficheDePaie) {
        return  fichePaieRepository.save(ficheDePaie);
    }

    @Override
    public FicheDePaie updateFicheDePaie(Long id, FicheDePaie ficheDePaie) {
        return fichePaieRepository.save(ficheDePaie);
    }

    @Override
    public void deleteFicheDePaieById(Long id) {
        FicheDePaie ficheDePaieexiste = fichePaieRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("ficheDePaie not found"));
        fichePaieRepository.deleteById(ficheDePaieexiste.getId());

    }

    @Override
    public FicheDePaie getFicheDePaieById(Long id) {
        return fichePaieRepository.findById(id).get();
    }

    @Override
    public List<FicheDePaie> getAllFicheDePaie() {
        return  fichePaieRepository.findAll();
    }
}
