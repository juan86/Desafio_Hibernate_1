package com.juanmercado.desafio1.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.juanmercado.desafio1.entities.Persona;

@Repository
public interface IPersonaRepository extends CrudRepository<Persona, Long>{
    
}
