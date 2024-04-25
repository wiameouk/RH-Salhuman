package com.example.rhsalhuman.repositories;

import com.example.rhsalhuman.entities.HeureTravail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeureTravailRepository extends JpaRepository<HeureTravail,Long> {
}
