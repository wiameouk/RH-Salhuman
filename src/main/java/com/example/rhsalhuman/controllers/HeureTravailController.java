package com.example.rhsalhuman.controllers;

import com.example.rhsalhuman.entities.HeureTravail;
import com.example.rhsalhuman.servicesImpl.HeureTravailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/HeureTravail")
@Service
public class HeureTravailController {

    @Autowired
    private HeureTravailServiceImpl heureTravailService;


    @GetMapping
    public ResponseEntity<List<HeureTravail>> getHeureTravail()
    {
        return ResponseEntity.ok(heureTravailService.getAllHeureTravail());
    }

    @GetMapping("/{id}")
    public ResponseEntity<HeureTravail> getHeureTravail(@PathVariable("id") Long heureTravailId)
    {
        return ResponseEntity.ok(heureTravailService.getHeureTravailById(heureTravailId));
    }

    @PostMapping
    public ResponseEntity<HeureTravail> createHeureTravail(@RequestBody HeureTravail heureTravail)
    {
        HeureTravail heureTravail1 = heureTravailService.saveHeureTravail(heureTravail);
        return new ResponseEntity<>(heureTravail1 , HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<HeureTravail> updateHeureTravail(@PathVariable("id") Long heureTravailId , @RequestBody HeureTravail  heureTravail)
    {
        HeureTravail heureTravail1 =heureTravailService.updateHeureTravail(heureTravailId,heureTravail);
        return new ResponseEntity<>(heureTravail1, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteHeureTravail(@PathVariable("id") Long heureTravailId )
    {
        heureTravailService.deleteHeureTravailById(heureTravailId );
        return ResponseEntity.ok("HeureTravail deleted successfully !");
    }

}

