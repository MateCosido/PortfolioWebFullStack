package com.porfolio.seba.Services;

import com.porfolio.seba.Entity.Experiencia;
import com.porfolio.seba.Interface.IExperienciaService;
import com.porfolio.seba.Repository.IExperienciaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpExperienciaService implements IExperienciaService{
    @Autowired IExperienciaRepo iexperienciaRepo;

    @Override
    public List<Experiencia> getExperiencia() {
        List<Experiencia> experiencia = iexperienciaRepo.findAll();
        return experiencia;
    }

    @Override
    public void saveExperiencia(Experiencia experiencia) {
        iexperienciaRepo.save(experiencia);
    }

    @Override
    public void deleteExperiencia(Long id) {
        iexperienciaRepo.deleteById(id);
    }

    @Override
    public Experiencia findExperiencia(Long id) {
        Experiencia experiencia = iexperienciaRepo.findById(id).orElse(null);
        return experiencia;
    }
    
}

/**
 *  
 * 
 */