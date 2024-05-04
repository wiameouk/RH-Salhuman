package com.example.rhsalhuman.services;
import com.example.rhsalhuman.entities.FicheDePaie;
import java.util.List;
public interface FicheDePaieService {

    FicheDePaie saveFicheDePaie(FicheDePaie ficheDePaie);

    FicheDePaie updateFicheDePaie(Long id, FicheDePaie ficheDePaie);

    void deleteFicheDePaieById(Long id);
    FicheDePaie getFicheDePaieById(Long id);
    List<FicheDePaie> getAllFicheDePaie();
}
