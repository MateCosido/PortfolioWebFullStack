
package com.porfolio.seba.Controller;

import com.porfolio.seba.Entity.Experiencia;
import com.porfolio.seba.Interface.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExperienciaController {
    @Autowired IExperienciaService iexperienciaService;
    
    @GetMapping("experiencia/traer")
    public List<Experiencia> getExperiencia(){
        return iexperienciaService.getExperiencia();
    }
    
    @PostMapping("/experiencia/crear")
    public String createExperiencia(@RequestBody Experiencia experiencia){
        iexperienciaService.saveExperiencia(experiencia);
        return "La Experiencia fue agregada";
    }
    
    @DeleteMapping("/experiencia/borrar/{id}")
    public String deleteExperiencia(@PathVariable Long id){
        iexperienciaService.deleteExperiencia(id);
        return "La Experiencia fue borrada";
    }
    
    @PutMapping("/experiencia/editar/{id}")
    public Experiencia editExperiencia(@PathVariable Long id,
                                       @RequestParam("fecha") String nuevaFecha,
                                       @RequestParam("descripcion") String nuevaDescripcion){
        Experiencia experiencia = iexperienciaService.findExperiencia(id);
        
        experiencia.setFecha(nuevaFecha);
        experiencia.setDescripcion(nuevaDescripcion);
        
        iexperienciaService.saveExperiencia(experiencia);
        return experiencia;
    }
    
    
}

/**
 *    
 */