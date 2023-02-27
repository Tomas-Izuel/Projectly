package com.proyectly.proyectly.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Empresa")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EtapaEmpleado implements Serializable{
    @Column
    private int cantidadHorasAsignadas;
    @Column
    private int cantidadHorasRealizadas;
    @Column
    private Date fechaAsignacion;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEtapaEmpleado;
}
