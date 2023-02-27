package com.proyectly.proyectly.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Proyecto")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Proyecto implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;
    @Column
    private Date fechaFin;
    @Column
    private Date fechaInicio;
    @Column
    private String name;
}
