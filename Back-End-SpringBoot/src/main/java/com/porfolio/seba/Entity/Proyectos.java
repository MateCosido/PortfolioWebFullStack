package com.porfolio.seba.Entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyectos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProy;
    
    @Basic
    private String fecha;
    
    @Basic
    private String descripcion;

    public Proyectos() {
    }

    public Proyectos(Long idProy, String fecha, String descripcion) {
        this.idProy = idProy;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }
    
    
    
}

/**
 *    
 * 
 */