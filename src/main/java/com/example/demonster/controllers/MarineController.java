package com.example.demonster.controllers;

import java.util.List;
import java.util.Optional;

import com.example.demonster.entities.Marine;
import com.example.demonster.services.MarineService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.RequestMapping;

// @RequestMapping(path = "/marine")
@RestController
public class MarineController {
    
    @Autowired
    private MarineService marineService;

    // Create 1 Marine
    @PostMapping("/marine")
    public Marine createMarine(@RequestBody Marine marine) {
        
        return marineService.createMarine(marine);
    }
    
    // Create Multiple Marines
    @PostMapping("/marines")
    public List<Marine> createMultipleMarines(@RequestBody List<Marine> multipleMarines) {
        
        return marineService.createMultipleMarines(multipleMarines);
    }

    // Read or Retrieve 1 Marine by id
    @GetMapping("/marine/{id}")
    public Optional<Marine> findMarineById(@PathVariable int id) {
        
        return marineService.findMarineById(id);
    }
    
    // Read or Retrieve All Marines
    @GetMapping("/marines")
    public List<Marine> findAllMarines() {
        
        return marineService.findAllMarines();
    }

    // Update 1 Marine by id
    @PutMapping("/marine")
    public Marine updateMarineById(@RequestBody Marine marine) {
        
        return marineService.updateMarineById(marine);
    }

    // Delete 1 Marine by id
    @DeleteMapping("/marine/{id}")
    public void deleteMarineById(@PathVariable int id) {
        
        marineService.deleteMarineById(id);
    }
}