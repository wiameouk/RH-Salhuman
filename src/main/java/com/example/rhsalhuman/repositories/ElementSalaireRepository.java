package com.example.rhsalhuman.repositories;

import com.example.rhsalhuman.entities.ElementSalaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElementSalaireRepository extends JpaRepository<ElementSalaire,Long> {
}
