package com.example.rhsalhuman.controllers;

import com.example.rhsalhuman.entities.Conge;
import com.example.rhsalhuman.servicesImpl.CongeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/conge")
@RestController
public class CongeController {
    @Autowired
    private CongeServiceImpl congeService;


    @GetMapping
    public ResponseEntity<List<Conge>> getConge()
    {
        return ResponseEntity.ok(congeService.getAllConges());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Conge> getEmployee(@PathVariable("id") Long congeId)
    {
        return ResponseEntity.ok(congeService.getCongeById(congeId));
    }

    @PostMapping
    public ResponseEntity<Conge> createConge(@RequestBody Conge conge)
    {
        Conge conge1 = congeService.saveConge(conge);
        return new ResponseEntity<>(conge1, HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Conge> updateConge(@PathVariable("id") Long congeId, @RequestBody Conge conge)
    {
        Conge conge1 = congeService.updateConge(congeId,conge);
        return new ResponseEntity<>(conge1, HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteConge(@PathVariable("id") Long congeId) {
        congeService.deleteCongeById(congeId);
        return ResponseEntity.ok("conge deleted successfully !");
    }

}
// test
//test 22
//test1