package com.example4.demo4.Services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example4.demo4.Model.Persona;
import com.example4.demo4.Repositories.PersonaRepository;

@Service
public class PersonaService {
    @Autowired
    PersonaRepository userRepository;

    public ArrayList<Persona> obtenerUsuarios()
    {
       return (ArrayList<Persona>) userRepository.findAll();
        
    }


    public Persona insertarUsuario(Persona unaPersona)
    {
        return userRepository.save(unaPersona);
    }

    public void eliminarUsuario(Long id)
    {
        userRepository.deleteById(id);
    }
    
}

