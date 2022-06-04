package com.porfolio.seba.Repository;

import com.porfolio.seba.Entity.Habilidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHabilidadesRepo extends JpaRepository<Habilidades, Long>{
    
}
