package com.example4.demo4.Model;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Persona")
public class Persona{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;


    @NotNull
    private String nombre;

    @NotNull
    private String apellido;

    @NotNull
    private Integer identificacion;



    public void setId(Long id){
        this.id = id;
    }
    public Long getId()
    {
        return id;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre()
    {
        return nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public String getApellido()
    {
        return apellido;
    }

    public void setIdentificacion(Integer identificacion){
        this.identificacion = identificacion;
    }
    public Integer getIdentificacion()
    {
        return identificacion;
    }

    
}

