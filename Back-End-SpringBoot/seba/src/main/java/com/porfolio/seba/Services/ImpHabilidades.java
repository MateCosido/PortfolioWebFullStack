package com.porfolio.seba.Services;

import com.porfolio.seba.Entity.Habilidades;
import com.porfolio.seba.Interface.IHabilidadesService;
import com.porfolio.seba.Repository.IHabilidadesRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpHabilidades implements IHabilidadesService {
    @Autowired IHabilidadesRepo ihabilidadesRepo;

    @Override
    public List<Habilidades> getHabilidades() {
        List<Habilidades> habilidades = ihabilidadesRepo.findAll();
        return habilidades;
    }

    @Override
    public void saveHabilidades(Habilidades habilidades) {
        ihabilidadesRepo.save(habilidades);
    }

    @Override
    public void deleteHabilidades(Long id) {
        ihabilidadesRepo.deleteById(id);
    }

    @Override
    public Habilidades findHabilidades(Long id) {
        Habilidades habilidades = ihabilidadesRepo.findById(id).orElse(null);
        return habilidades;
    }
    
}

/** 
 **/