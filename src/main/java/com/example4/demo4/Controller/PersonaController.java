package com.example4.demo4.Controller;

import java.util.ArrayList;

import javax.naming.Binding;
import javax.validation.Valid;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example4.demo4.Model.Persona;
import com.example4.demo4.Services.PersonaService;


@Controller
public class PersonaController {
  
    @Autowired
    PersonaService userService;
    
    @GetMapping("/")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
       
        return "index";
    }


    @GetMapping("/eliminar")
    public String eliminar()
    {
        return "eliminar";
    }


    @GetMapping("/actualizar")
    public String actualizar()
    {
        return "actualizar";
    }


//------------------------------------------------------------------------------
     @GetMapping("/persona")
    public String per(Model model) {
        ArrayList<Persona> personas = userService.obtenerUsuarios();
        model.addAttribute("personas", personas);
    
        return "per";
    }
//------------------------------------------------------------------------------


    @PostMapping("/eliminar")
    public void eliminar(@ModelAttribute Persona unaPersona)
    {
        userService.eliminarUsuario(unaPersona.getId());
        
    }

    @PostMapping("/agregar")
    public String insertPersona(@Valid @ModelAttribute Persona unaPersona, BindingResult res, Model model)
    {
        if (res.hasErrors()) {			
            return "index";
        }

            userService.insertarUsuario(unaPersona);
            return "per";
    }    

    @PostMapping("/actualizarPersona")
    public String actualizarPersona(@ModelAttribute Persona unaPersona)
    {
        userService.insertarUsuario(unaPersona);
        return "index";
    }    
    
}
