package com.example.rhsalhuman.controllers;

import com.example.rhsalhuman.entities.ElementSalaire;
import com.example.rhsalhuman.services.ElementSalaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/element-salaire")
@RestController
public class ElementSalaireController {
    @Autowired
    private ElementSalaireService elementSalaireService; // Injection de dépendances avec l'interface

    @GetMapping
    public ResponseEntity<List<ElementSalaire>> getAllElementsSalaire() {
        List<ElementSalaire> elementsSalaire = elementSalaireService.getAllElementSalaires();
        return ResponseEntity.ok(elementsSalaire);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ElementSalaire> getElementSalaireById(@PathVariable("id") Long elementSalaireId) {
        ElementSalaire elementSalaire = elementSalaireService.getElementSalaireById(elementSalaireId);
        return ResponseEntity.ok(elementSalaire);
    }

    @PostMapping
    public ResponseEntity<ElementSalaire> createElementSalaire(@RequestBody ElementSalaire elementSalaire) {
        ElementSalaire createdElementSalaire = elementSalaireService.saveElementSalaire(elementSalaire);
        return new ResponseEntity<>(createdElementSalaire, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ElementSalaire> updateElementSalaire(@PathVariable("id") Long elementSalaireId,
                                                               @RequestBody ElementSalaire elementSalaire) {
        ElementSalaire updatedElementSalaire = elementSalaireService.updateElementSalaire(elementSalaireId, elementSalaire);
        return new ResponseEntity<>(updatedElementSalaire, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteElementSalaire(@PathVariable("id") Long elementSalaireId) {
        elementSalaireService.deleteElementSalaireById(elementSalaireId);
        return ResponseEntity.ok("Element Salaire deleted successfully !");
    }
    @PostMapping("/calculer-salaire-total")
    public double calculerSalaireTotal(@RequestBody ElementSalaire elementSalaire) {
        return elementSalaireService.calculerSalaireTotal(elementSalaire);
    }
}
