package com.example.demonster.controllers;

import java.util.List;
import java.util.Optional;

import com.example.demonster.entities.Pirate;
import com.example.demonster.services.PirateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.RequestMapping;

// @RequestMapping(path = "/pirate")
@RestController
public class PirateController {
    
    @Autowired
    private PirateService pirateService;

    // Create 1 Pirate
    @PostMapping("/pirate")
    public Pirate createPirate(@RequestBody Pirate pirate) {
        
        return pirateService.createPirate(pirate);
    }
    
    // Create Multiple Pirates
    @PostMapping("/pirates")
    public List<Pirate> createMultiplePirates(@RequestBody List<Pirate> multiplePirates) {
        
        return pirateService.createMultiplePirates(multiplePirates);
    }

    // Read or Retrieve 1 Pirate by id
    @GetMapping("/pirate/{id}")
    public Optional<Pirate> findPirateById(@PathVariable int id) {
        
        return pirateService.findPirateById(id);
    }
    
    // Read or Retrieve All Pirates
    @GetMapping("/pirates")
    public List<Pirate> findAllPirates() {
        
        return pirateService.findAllPirates();
    }

    // Update 1 Pirate by id
    @PutMapping("/pirate")
    public Pirate updatePirateById(@RequestBody Pirate pirate) {
        
        return pirateService.updatePirateById(pirate);
    }

    // Delete 1 Pirate by id
    @DeleteMapping("/pirate/{id}")
    public void deletePirateById(@PathVariable int id) {
        
        pirateService.deletePirateById(id);
    }
}