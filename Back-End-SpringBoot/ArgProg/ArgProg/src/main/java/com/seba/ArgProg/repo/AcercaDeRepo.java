
package com.seba.ArgProg.repo;

import com.seba.ArgProg.model.AcercaDe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcercaDeRepo extends JpaRepository <AcercaDe, Long>{
    
}
