package com.juanmercado.desafio1.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table( name = "personas")
public class Persona {
    @Id
    @GeneratedValue( strategy =  GenerationType.IDENTITY)
    @Column( name = "cli_id")
    private Long id;

    @Column(name="cli_nombre", nullable=false, length=50)
    private String nombre;
    
    @Column(name="cli_apellido",nullable=false,length=50)
    private String apellido;
    
    @Column( name = "cli_edad", nullable = false)
    private int edad;
    
    @ManyToMany( cascade = CascadeType.ALL)
    List<Telefono> telefonos;

    public Persona() {}

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public List<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<Telefono> telefonos) {
        this.telefonos = telefonos;
    }
}
