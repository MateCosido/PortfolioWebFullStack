package com.porfolio.seba.Repository;

import com.porfolio.seba.Entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducacionRepo extends JpaRepository<Educacion, Long> {
    
}
