package com.example.demonster.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "marines")
@Table(name = "marines")
public class Marine implements Serializable{
    
    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private String rank;
    
    @ManyToMany(targetEntity = Pirate.class)
    @JoinTable(name = "Catch")
    private List<Pirate> pirates;
}