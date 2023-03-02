package com.proyectly.proyectly.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Empleado")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Empleado extends Base{
    @Column
    private int cuil;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private int tel;
    @Column
    private Date fechaNacimiento;
}
