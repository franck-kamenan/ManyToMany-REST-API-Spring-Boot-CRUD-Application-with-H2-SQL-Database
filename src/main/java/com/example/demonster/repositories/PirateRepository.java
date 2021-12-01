package com.example.demonster.repositories;

import com.example.demonster.entities.Pirate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PirateRepository extends JpaRepository<Pirate, Integer> {}