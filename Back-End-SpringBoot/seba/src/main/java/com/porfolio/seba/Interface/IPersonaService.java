package com.porfolio.seba.Interface;

import com.porfolio.seba.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer persona
    public List<Persona> getPersona();
    
    //Guardar Persona
    public void savePersona(Persona persona);
    
    //Eliminar Persona por ID
    public void deletePersona(Long id);
    
    //Buscar Persona por ID
    public Persona findPersona(Long id);
    
}
