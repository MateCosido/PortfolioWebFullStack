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
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
        
    @Basic
    private String fecha;
    
    @Basic
    private String descripcion;

    public Educacion() {
    }

    public Educacion(Long id, String titulo, String fecha, String descripcion) {
        this.id = id;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }
    
    
}
