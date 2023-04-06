
package com.mycompany.bomberos.persistencia;

import com.mycompany.bomberos.logica.Socio;
import com.mycompany.bomberos.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    SocioJpaController socioJpa = new SocioJpaController ();

   

    public void crearSocio(Socio soci) {
        
    socioJpa.create(soci);
        
    
    }

    public List<Socio> traerSocios() {
        //Usamos los metodos de la JPA controler para traer los Socios (findSocioEntities, y los ponemos como return)
        return socioJpa.findSocioEntities();
        
    }

    public void borrarSocio(int idSocio) {
        try {
            //Java pide que un destroy este en un throw o dentro de una sentencia try catch por si no puede eliminar el registro

            socioJpa.destroy(idSocio);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    
    

  
}
