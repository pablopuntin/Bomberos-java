
package com.mycompany.bomberos.logica;

import com.mycompany.bomberos.persistencia.ControladoraPersistencia;
import java.util.List;


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

    public List<Socio> traerSocios() {
        
        //La controladora de la logica le pide los datos a la persistencia, solo hace de pasamano
        return controlPersis.traerSocios();
        
        
    }

    public void borarSocio(int idSocio) {
        //este metodo le envia el id a la persistencia, es void por eso no tiene return
        controlPersis.borrarSocio(idSocio);
       
    }

    public Socio traerSocioModif(int idSocio) {
        
        return controlPersis.traerSocioModif(idSocio);
        
    }

    public void modificarSocio(Socio socio,String nombre,String direccion,String apellido,String dni,String codArea,String telefono) {
        //Eteamos los datos nuevos en el socio
        socio.setNombre(nombre);
        socio.setApellido(apellido);
        socio.setDireccion(direccion);
        socio.setDni(dni);
        socio.setCodigoArea(codArea);
        socio.setTel(telefono);
        
        //le pido a persis que modifique
        controlPersis.modificarsocio(socio);

    }

    
    

    }
    

   
