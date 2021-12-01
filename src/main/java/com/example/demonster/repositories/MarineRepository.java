package com.example.demonster.repositories;

import com.example.demonster.entities.Marine;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarineRepository extends JpaRepository<Marine, Integer>{}