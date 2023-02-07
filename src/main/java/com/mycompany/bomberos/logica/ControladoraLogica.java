
package com.mycompany.bomberos.logica;

import com.mycompany.bomberos.persistencia.ControladoraPersistencia;


public class ControladoraLogica {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia ();

    public void crearSocio(String nombreSocio, String apellidoSocio, String dirSocio, String dniSocio, String codAreaSocio, String telSocio) {
       
        Socio soci = new Socio();
        soci.setNombre(nombreSocio);
        soci.setApellido(apellidoSocio);
        soci.setDireccion(dirSocio);
        soci.setDni(dniSocio);
        soci.setCodigoArea(codAreaSocio);
        soci.setTel(telSocio);
        controlPersis.crearSocio(soci);
        
        
        
    }
    

    }
    

   
