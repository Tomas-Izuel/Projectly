package com.proyectly.proyectly.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "Etapa")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Etapa extends Base{
    @Column
    private String nombre;
}
