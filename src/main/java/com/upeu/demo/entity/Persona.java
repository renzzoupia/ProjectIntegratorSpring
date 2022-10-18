/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.upeu.demo.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;



@Data
@Entity
@Table(name = "persona")
public class Persona implements Serializable{
    
    @Id
    @Column(name = "pers_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long persId;

    @Column(name = "pers_nombres")
    private String persNombres;

    @Column(name = "pers_apellidos")
    private String persApellidos;

    @Column(name = "pers_dni")
    private String persDni;

    @Column(name = "pers_telefono")
    private String persTelefono;

// tabla  persona se relaciona a de tipo persona
    @ManyToOne //De muchos a uno
    @JoinColumn(name = "tipe_id")
    private TipoPersona tipoPersona;

// tabla  persona se relaciona a carrera
    @ManyToOne //De muchos a uno
    @JoinColumn(name = "carr_id")
    private Carrera carrera;
}