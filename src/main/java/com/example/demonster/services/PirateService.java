package com.example.demonster.services;

import java.util.List;
import java.util.Optional;

import com.example.demonster.entities.Pirate;
import com.example.demonster.repositories.PirateRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PirateService {
    
    @Autowired
    private PirateRepository pirateRepository;

    // Create 1 Pirate
    public Pirate createPirate(Pirate pirate) {
        
        return pirateRepository.save(pirate);
    }
    
    // Create Multiple Pirates
    public List<Pirate> createMultiplePirates(List<Pirate> multiplePirates) {
        
        return pirateRepository.saveAll(multiplePirates);
    }

    // Read or Retrieve 1 Pirate by id
    public Optional<Pirate> findPirateById(int id) {
        
        return pirateRepository.findById(id);
    }

    // Read or Retrieve All Pirates
    public List<Pirate> findAllPirates() {
        
        return pirateRepository.findAll();
    }

    // Update 1 Pirate by id
    public Pirate updatePirateById(Pirate pirate) {
        
        Pirate toBeUpdatedPirate = null;
        if (pirateRepository.findById(pirate.getId()).isPresent()) {
            
            toBeUpdatedPirate = pirateRepository.findById(pirate.getId()).get();
            toBeUpdatedPirate.setName(pirate.getName());
            toBeUpdatedPirate.setCrew(pirate.getCrew());
            pirateRepository.save(toBeUpdatedPirate);
            
        } else {
            
            return new Pirate();
        }
        
        return toBeUpdatedPirate;
    }

    // Delete 1 Pirate by id
    public void deletePirateById(int id) {
        
        pirateRepository.deleteById(id);
    }
}