package com.example4.demo4.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example4.demo4.Model.Persona;

@Repository
public interface PersonaRepository extends CrudRepository<Persona, Long>{
    
}
