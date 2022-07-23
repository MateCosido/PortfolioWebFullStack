
package com.seba.ArgProg.repo;

import com.seba.ArgProg.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SkillsRepo extends JpaRepository <Skills, Long> {
    
}
