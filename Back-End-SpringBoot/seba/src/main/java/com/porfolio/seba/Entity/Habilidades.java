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
public class Habilidades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    private String porcentaje;
    
    @NotNull
    private String url;

    public Habilidades() {
    }

    public Habilidades(Long id, String porcentaje, String url) {
        this.id = id;
        this.porcentaje = porcentaje;
        this.url = url;
    }
    
    
    
}

/**

 */