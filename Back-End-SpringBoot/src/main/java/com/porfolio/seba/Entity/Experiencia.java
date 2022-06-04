package com.porfolio.seba.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExp;
   
    @NotNull
    private String fecha;
    
    @NotNull
    private String descripcion;

    public Experiencia() {
    }

    public Experiencia(Long idExp, String fecha, String descripcion) {
        this.idExp = idExp;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }
    
    
}
/**
 *  Anotaciones
 */