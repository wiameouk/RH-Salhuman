package com.example.rhsalhuman.services;
import com.example.rhsalhuman.entities.HeureTravail;
import java.util.List;

public interface HeureTravailService {
    HeureTravail saveHeureTravail(HeureTravail heuretravail);

    HeureTravail updateHeureTravail(Long id, HeureTravail heuretravail);

    void deleteHeureTravailById(Long id);
    HeureTravail getHeureTravailById(Long id);
    List<HeureTravail> getAllHeureTravail();

}
