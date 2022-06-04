package com.porfolio.seba.Repository;

import com.porfolio.seba.Entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienciaRepo extends JpaRepository<Experiencia, Long>{
    
}
