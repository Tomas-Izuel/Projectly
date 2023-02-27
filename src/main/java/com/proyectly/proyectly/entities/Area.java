package com.proyectly.proyectly.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "Empresa")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Area implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idArea;
    @Column
    private String nombre;
}
