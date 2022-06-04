package com.porfolio.seba.Services;

import com.porfolio.seba.Entity.Educacion;
import com.porfolio.seba.Interface.IEducacionService;
import com.porfolio.seba.Repository.IEducacionRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
//AGREGO
@Transactional
public class ImpEducacionService implements IEducacionService{
    @Autowired IEducacionRepo ieducacionRepo;

    @Override
    public List<Educacion> getEducacion() {
        List<Educacion> educacion = ieducacionRepo.findAll();
        return educacion;
    }

    @Override
    public void saveEducacion(Educacion educacion) {
        ieducacionRepo.save(educacion);
    }

    @Override
    public void deleteEducacion(Long id) {
        ieducacionRepo.deleteById(id);
    }

    @Override
    public Educacion findEducacion(Long id) {
        Educacion educacion = ieducacionRepo.findById(id).orElse(null);
        return educacion;
    }
 
    /**
  
    **/
    
}
