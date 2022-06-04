package com.porfolio.seba.Services;

import com.porfolio.seba.Entity.Persona;
import com.porfolio.seba.Interface.IPersonaService;
import com.porfolio.seba.Repository.IPersonaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepo ipersonaRepo;

    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepo.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepo.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        ipersonaRepo.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = ipersonaRepo.findById(id).orElse(null);
        return persona;
    }
    
}
