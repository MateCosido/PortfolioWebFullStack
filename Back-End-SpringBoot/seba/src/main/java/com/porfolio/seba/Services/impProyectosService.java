package com.porfolio.seba.Services;

import com.porfolio.seba.Entity.Proyectos;
import com.porfolio.seba.Interface.IProyectosService;
import com.porfolio.seba.Repository.IProyectosRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class impProyectosService implements IProyectosService{
    @Autowired IProyectosRepo iproyectosRepo;

    @Override
    public List<Proyectos> getProyectos() {
        List<Proyectos> proyectos = iproyectosRepo.findAll();
        return proyectos;
    }

    @Override
    public void saveProyectos(Proyectos proyectos) {
        iproyectosRepo.save(proyectos);
    }

    @Override
    public void deleteProyectos(Long id) {
        iproyectosRepo.deleteById(id);
    }

    @Override
    public Proyectos findProyectos(Long id) {
        Proyectos proyectos = iproyectosRepo.findById(id).orElse(null);
        return proyectos;
    }
    
    
}

/**
 */