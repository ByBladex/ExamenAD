/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenad;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class JUNIT {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josel
 */
public class MockDAODocumentos {
    private final ArrayList<Urbanizacion> comunidad;
    boolean falloConexion;
    
    MockDAODocumentos() throws Exception{
        comunidad = new ArrayList();
        comunidad.add(new Urbanizacion(1, "Jerez", 11404, "Plata", "La Plata", 5));
    }
    
    public int insertarComunidad(Urbanizacion urbanizacion){
        if(this.getComunidad(urbanizacion.getCodigo()) == null){
            comunidad.add(urbanizacion);
            return 1;
        }
        else{
            return 0;
        }
    }
    
    public int eliminarUrbanizacion(Urbanizacion urbanizacion){
        if(comunidad.remove(urbanizacion))
            return 1;
        else
            return 0;
    }
    
    public Urbanizacion getComunidad(Integer codigo) {
        for(Urbanizacion urbanizacion: comunidad){
            if(urbanizacion.getCodigo().equals(codigo))
                return urbanizacion;
        }
        return null;
    }
    
    public ArrayList<Urbanizacion> getComunidades(){
        return comunidad;
    }
}

}
