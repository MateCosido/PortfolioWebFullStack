
package com.seba.ArgProg.security.service;

import com.seba.ArgProg.security.entity.Rol;
import com.seba.ArgProg.security.enums.RolNombre;
import com.seba.ArgProg.security.repo.RolRepo;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional //persistencia hace rollback
public class RolService {
    
    @Autowired
    RolRepo rolRepo;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepo.findByRolNombre(rolNombre);
    }

     public void save(Rol rol){
        rolRepo.save(rol);
    }
    
}
