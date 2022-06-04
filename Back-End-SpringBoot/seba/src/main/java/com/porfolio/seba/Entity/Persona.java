package com.porfolio.seba.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "Debe contener entre 1 y 50 caracteres")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 50, message = "Debe contener entre 1 y 50 caracteres")
    private String apellido;
    
    @NotNull
    @Size(min = 1, max = 50, message = "Debe contener entre 1 y 50 caracteres")
    private String url;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String url) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.url = url;
    }
    
    
    
}
