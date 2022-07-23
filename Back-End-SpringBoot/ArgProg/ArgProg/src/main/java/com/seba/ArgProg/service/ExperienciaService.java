
package com.seba.ArgProg.service;

import com.seba.ArgProg.model.Experiencia;
import com.seba.ArgProg.repo.ExperienciaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ExperienciaService {
    private final ExperienciaRepo experienciaRepo;
    
    @Autowired
    public ExperienciaService(ExperienciaRepo experienciaRepo){
        this.experienciaRepo = experienciaRepo;
    }
    
        public Experiencia addExperiencia(Experiencia experiencia){
        return experienciaRepo.save(experiencia);
    }
    
    public List<Experiencia> buscarExperiencia(){
        return experienciaRepo.findAll();
    }
    
    public Experiencia editarExperiencia(Experiencia experiencia){
        return experienciaRepo.save(experiencia);
    }
    
    public void borrarExperiencia(Long id){
        experienciaRepo.deleteById(id);
    }
    
}
