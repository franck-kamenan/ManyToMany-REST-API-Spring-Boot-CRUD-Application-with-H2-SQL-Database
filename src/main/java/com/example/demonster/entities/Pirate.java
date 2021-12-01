package com.example.demonster.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "pirates")
@Table(name = "pirates")
public class Pirate implements Serializable{
    
    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private String crew;    
}