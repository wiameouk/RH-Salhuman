package com.example.rhsalhuman.services;
import com.example.rhsalhuman.entities.Conge;
import java.util.List;

public interface CongeService {
    Conge saveConge(Conge conge);
   Conge updateConge(Long id, Conge conge);

    void deleteCongeById(Long id);
    Conge getCongeById(Long id);
    List<Conge> getAllConges();

}
