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
public class NivelExperiencia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNE;
    @Column
    private String nombre;
}
