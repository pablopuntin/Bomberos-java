
package com.mycompany.bomberos.persistencia;

import com.mycompany.bomberos.logica.Socio;


public class ControladoraPersistencia {
    
    SocioJpaController socioJpa = new SocioJpaController ();

   

    public void crearSocio(Socio soci) {
        
    socioJpa.create(soci);
        
    
    }
    
    

  
}
