package com.example.demonster.services;

import java.util.List;
import java.util.Optional;

import com.example.demonster.entities.Marine;
import com.example.demonster.repositories.MarineRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarineService {
    
    @Autowired
    private MarineRepository marineRepository;

    // Create 1 Marine
    public Marine createMarine(Marine marine) {
        
        return marineRepository.save(marine);
    }
    
    // Create Multiple Marines
    public List<Marine> createMultipleMarines(List<Marine> multipleMarines) {
        
        return marineRepository.saveAll(multipleMarines);
    }

    // Read or Retrieve 1 Marine by id
    public Optional<Marine> findMarineById(int id) {
        
        return marineRepository.findById(id);
    }

    // Read or Retrieve All Marines
    public List<Marine> findAllMarines() {
        
        return marineRepository.findAll();
    }

    // Update 1 Marine by id
    public Marine updateMarineById(Marine marine) {
        
        Marine toBeUpdatedMarine = null;
        if (marineRepository.findById(marine.getId()).isPresent()) {
            
            toBeUpdatedMarine = marineRepository.findById(marine.getId()).get();
            toBeUpdatedMarine.setName(marine.getName());
            toBeUpdatedMarine.setRank(marine.getRank());
            marineRepository.save(toBeUpdatedMarine);
            
        } else {
            
            return new Marine();
        }
        
        return toBeUpdatedMarine;
    }

    // Delete 1 Marine by id
    public void deleteMarineById(int id) {
        
        marineRepository.deleteById(id);
    }
}