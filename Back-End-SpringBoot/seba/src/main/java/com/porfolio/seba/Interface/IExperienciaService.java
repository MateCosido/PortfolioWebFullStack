package com.porfolio.seba.Interface;

import com.porfolio.seba.Entity.Experiencia;
import java.util.List;


public interface IExperienciaService {
    
    public List<Experiencia> getExperiencia();
    
    public void saveExperiencia(Experiencia experiencia);
    
    public void deleteExperiencia(Long id);
    
    public Experiencia findExperiencia(Long id);
    
}

/**
 **/