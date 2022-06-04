package com.porfolio.seba.Controller;

import com.porfolio.seba.Entity.Habilidades;
import com.porfolio.seba.Interface.IHabilidadesService;
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
@RequestMapping("/habilidades")
public class HabilidadesController {
    @Autowired IHabilidadesService ihabilidadesService;
    
    @GetMapping("/traer")
    public List<Habilidades> getHabilidades(){
        return ihabilidadesService.getHabilidades();
    }
    
    @PostMapping("/crear")
    public String createHabilidades(@RequestBody Habilidades habilidades){
        ihabilidadesService.saveHabilidades(habilidades);
        return "La Habilidad fue cargada";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String deleteHabilidades(@PathVariable Long id){
        ihabilidadesService.deleteHabilidades(id);
        return "La Habilidad fue borrada";
    }
    
    @PutMapping("/editar/{id}")
    public Habilidades editHabilidades(@PathVariable Long id,
                                       @RequestParam("porcentaje") String nuevoPorcentaje,
                                       @RequestParam("url") String nuevaUrl){
        Habilidades habilidades = ihabilidadesService.findHabilidades(id);
        
        habilidades.setPorcentaje(nuevoPorcentaje);
        habilidades.setUrl(nuevaUrl);
        
        ihabilidadesService.saveHabilidades(habilidades);
        return habilidades;
    }
    
}

/**     
**/