package com.juanmercado.desafio1.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table( name = "telefonos" )
public class Telefono {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "tel_id")
    private Long id;

    @Column( name = "tel_marca", nullable = false)
    private String marca;

    @Column( name = "tel_modelo", nullable = false )
    private  String modelo;
    
    @Column( name = "tel_numero" , nullable =  false)
    private int numero;

    public Telefono() {}

    public Telefono(String marca, String modelo, int numero) {
        this.marca = marca;
        this.modelo = modelo;
        this.numero = numero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
