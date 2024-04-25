package com.example.rhsalhuman.repositories;

import com.example.rhsalhuman.entities.FicheDePaie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FichePaieRepository extends JpaRepository<FicheDePaie,Long> {
}
