
package com.seba.ArgProg.repo;

import com.seba.ArgProg.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepo extends JpaRepository <Persona, Long> {
    
}
