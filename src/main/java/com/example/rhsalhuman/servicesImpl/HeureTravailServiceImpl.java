package com.example.rhsalhuman.servicesImpl;

import com.example.rhsalhuman.entities.HeureTravail;
import com.example.rhsalhuman.repositories.HeureTravailRepository;
import com.example.rhsalhuman.services.HeureTravailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class HeureTravailServiceImpl implements HeureTravailService {

    @Autowired
    private HeureTravailRepository heuretravailrepository;

    @Override
    public HeureTravail saveHeureTravail(HeureTravail heuretravail) {
        return null;
    }

    @Override
    public HeureTravail updateHeureTravail(Long id, HeureTravail heuretravail) {
        return null;
    }

    @Override
    public void deleteHeureTravailById(Long id) {

    }

    @Override
    public HeureTravail getHeureTravailById(Long id) {
        return null;
    }

    @Override
    public List<HeureTravail> getAllHeureTravail() {
        return null;
    }
}
