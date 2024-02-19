package com.juanmercado.desafio1.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.juanmercado.desafio1.entities.Telefono;

@Repository
public interface ITelefonoRepository extends CrudRepository<Telefono, Long>{
    
}
