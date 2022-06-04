package com.porfolio.seba.Interface;

import com.porfolio.seba.Entity.Habilidades;
import java.util.List;


public interface IHabilidadesService {
    
    public List<Habilidades> getHabilidades();
    
    public void saveHabilidades(Habilidades habilidades);
    
    public void deleteHabilidades(Long id);
    
    public Habilidades findHabilidades(Long id);
    
}

/**
 *     
 */