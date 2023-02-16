
package com.example.demo.Interface;

import com.example.demo.Entity.Persona;
import java.util.List;

/**
 *
 * @author Grincode
 */
public interface IPersonaService {
    //Traigo lista persona
    public List<Persona> getPersona();
    
    //Guardar obj persona
    public void savePersona(Persona persona);
    
    //Elimino usuario por Id
    public void deletePersona(Long id);
    
    //Buscar persona por Id
    public Persona findPersona(Long id);
    
    
    
    
}
