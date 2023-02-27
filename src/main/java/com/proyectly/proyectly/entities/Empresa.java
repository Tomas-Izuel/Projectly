package com.proyectly.proyectly.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
public class Empresa implements Serializable {
    @Id
    private int cuit;
    @Column
    private String name;
}
