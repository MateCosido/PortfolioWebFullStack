
package com.seba.ArgProg.repo;

import com.seba.ArgProg.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRepo extends JpaRepository <Proyectos, Long>{
    
}