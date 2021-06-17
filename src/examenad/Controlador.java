/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenad;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Controlador {
        static DAOUrbanizacion daoUrb = new DAOUrbanizacion();
    
        public static void cargarTablaUrbanizacion(JTable tabla){
        DefaultTableModel modeloTabla = new DefaultTableModel();
        
        modeloTabla.addColumn("Codigo");
        modeloTabla.addColumn("Ciudad");
        modeloTabla.addColumn("Cod_Postal");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Calle");
        modeloTabla.addColumn("Numero");
        
        String[] registros = new String[6];
        
        for(Urbanizacion urbanizacion: daoUrb.getComunidades()){
            registros[0] = urbanizacion.getCodigo().toString();
            registros[1] = urbanizacion.getCiudad();
            registros[2] = urbanizacion.getCodPostal().toString();
            registros[3] = urbanizacion.getNombre();
            registros[4] = urbanizacion.getCalle();
            registros[5] = urbanizacion.getNumero().toString();

            modeloTabla.addRow(registros);
        };
            tabla.setModel(modeloTabla);
    }
        
    public static int insertarComunidad(String ciudad, Integer codPostal, String nombre, String calle, Integer numero) {
        Urbanizacion urbanizacion = new Urbanizacion(ciudad, codPostal, nombre, calle, numero);
        DAOUrbanizacion dao = new DAOUrbanizacion();

        if (dao.insertarUrbanizacion(urbanizacion) == 1) {
            return 1;
        }
        else {
            return 0;
        }
    }
    
    public static int borrarUrbanizacion(int id) {
        DAOUrbanizacion daoUrb = new DAOUrbanizacion();
        
        if (daoUrb.eliminarUrbanizacion(daoUrb.getComunidades().get(id)) == 1) {
            return 1;
        }
        else {
            return 0;
        }
    }
    
    public static int actualizarUrbanizacion(int id, String ciudad, Integer codPostal, String nombre, String calle, Integer numero) {
        DAOUrbanizacion daoUrb = new DAOUrbanizacion();
        
        if (daoUrb.modificarUrbanizacion(daoUrb.getComunidades().get(id), ciudad, codPostal, nombre, calle, numero) == 1) {
            return 1;
        }
        else {
            return 0;
        }
    }
    
}
