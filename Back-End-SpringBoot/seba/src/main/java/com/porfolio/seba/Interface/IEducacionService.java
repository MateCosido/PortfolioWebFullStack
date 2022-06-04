package com.porfolio.seba.Interface;

import com.porfolio.seba.Entity.Educacion;
import java.util.List;


public interface IEducacionService {
     //Traer educacion
    public List<Educacion> getEducacion();
    
    //Guardar Educacion
    public void saveEducacion(Educacion educacion);
    
    //Eliminar Educacion por ID
    public void deleteEducacion(Long id);
    
    //Buscar Educacion por ID
    public Educacion findEducacion(Long id);
}
