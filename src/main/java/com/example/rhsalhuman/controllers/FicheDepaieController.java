package com.example.rhsalhuman.controllers;
import com.example.rhsalhuman.entities.FicheDePaie;
import com.example.rhsalhuman.servicesImpl.FicheDepaieServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/FicheDepaie")
@Service
public class FicheDepaieController {
    private FicheDepaieServiceImp ficheDepaieService;

        @GetMapping
        public ResponseEntity<List<FicheDePaie>> getFicheDePaie()
        {
            return ResponseEntity.ok(ficheDepaieService.getAllFicheDePaie());
        }

        @GetMapping("/{id}")
        public ResponseEntity<FicheDePaie> getFicheDepaie(@PathVariable("id") Long ficheDepaieId)
        {
            return ResponseEntity.ok(ficheDepaieService.getFicheDePaieById(ficheDepaieId));
        }

        @PostMapping
        public ResponseEntity<FicheDePaie> createFicheDepaie(@RequestBody FicheDePaie ficheDepaie)
        {
            FicheDePaie ficheDepaie1 = ficheDepaieService.saveFicheDePaie(ficheDepaie);
            return new ResponseEntity<>(ficheDepaie1 , HttpStatus.CREATED);
        }

        @PutMapping("/{id}")
        public ResponseEntity<FicheDePaie> updateFicheDepaie(@PathVariable("id") Long ficheDepaieId , @RequestBody FicheDePaie ficheDePaie)
        {
            FicheDePaie ficheDepaie1 =ficheDepaieService.updateFicheDePaie(ficheDepaieId,ficheDePaie);
            return new ResponseEntity<>(ficheDepaie1, HttpStatus.CREATED);
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<String> deleteFicheDePaie(@PathVariable("id") Long ficheDepaieId )
        {
            ficheDepaieService.deleteFicheDePaieById(ficheDepaieId );
            return ResponseEntity.ok("FicheDePaiedeleted successfully !");
        }

}


