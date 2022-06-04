package com.porfolio.seba.Entity;

import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
    
    @Basic
    @Size(min = 20, max = 500, message = "Deba contener entre 20 y 500 caracteres")
    private String descripcion;
    
    //ESTO AGREGUE NUEVO
    @OneToMany(fetch = FetchType.LAZY, mappedBy ="idEdu")
    private List<Educacion> educacionList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy ="idExp")
    private List<Experiencia> experienciaList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy ="idHab")
    private List<Habilidades> habilidadesList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy ="idProy")
    private List<Proyectos> proyectosList;
    
    
    

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String url, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.url = url;
        this.descripcion = descripcion;
        
    }
    
    
    
}
