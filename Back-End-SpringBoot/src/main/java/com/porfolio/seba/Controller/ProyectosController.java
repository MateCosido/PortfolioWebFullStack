package com.porfolio.seba.Controller;

import com.porfolio.seba.Entity.Proyectos;
import com.porfolio.seba.Interface.IProyectosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/proyectos")
public class ProyectosController {
    @Autowired IProyectosService iproyectosService;
    
    @GetMapping("/traer")
    public List<Proyectos> getProyectos(){
        return iproyectosService.getProyectos();
    }
    
    @PostMapping("/crear")
    public String createProyectos(@RequestBody Proyectos proyectos){
        iproyectosService.saveProyectos(proyectos);
        return "El Proyecto fue agregado";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String deleteProyectos(@PathVariable Long id){
        iproyectosService.deleteProyectos(id);
        return "El Proyecto fue borrado";
    }
    
    @PutMapping("/editar/{id}")
    public Proyectos editProyectos(@PathVariable Long id,
                                   @RequestParam("fecha") String nuevaFecha,
                                   @RequestParam("descripcion") String nuevaDescripcion){
        Proyectos proyectos = iproyectosService.findProyectos(id);
        
        proyectos.setFecha(nuevaFecha);
        proyectos.setDescripcion(nuevaDescripcion);
        
        iproyectosService.saveProyectos(proyectos);
        return proyectos;
                        
    }
}

/**
 *      
 */
