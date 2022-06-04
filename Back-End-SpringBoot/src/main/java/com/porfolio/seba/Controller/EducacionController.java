package com.porfolio.seba.Controller;

import com.porfolio.seba.Entity.Educacion;
import com.porfolio.seba.Interface.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/educacion")
public class EducacionController {
    
    @Autowired IEducacionService ieducacionService;
    
    @GetMapping("/traer")
    public List<Educacion> getEducacion(){
        return ieducacionService.getEducacion();
    }
    
    @PostMapping("/crear")
    public String createEducacion(@RequestBody Educacion educacion){
        ieducacionService.saveEducacion(educacion);
        return "Su Educacion fue agregada";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String deleteEducacion(@PathVariable Long id){
        ieducacionService.deleteEducacion(id);
        return "Su Educacion fue borrada";
    }
    
    @PutMapping("/editar/{id}")
    public Educacion editEducacion(@PathVariable Long id,
                                   @RequestParam("fecha") String nuevaFecha,
                                   @RequestParam("descripcion") String nuevaDescripcion){
        Educacion educacion = ieducacionService.findEducacion(id);
        
        educacion.setFecha(nuevaFecha);
        educacion.setDescripcion(nuevaDescripcion);
        
        ieducacionService.saveEducacion(educacion);
        return educacion;
    }
    
}

