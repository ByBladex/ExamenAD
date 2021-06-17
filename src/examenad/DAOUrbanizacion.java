/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenad;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class DAOUrbanizacion {
    	public static ArrayList<Urbanizacion> comunidad;
        private static Connection conn;
        
        DAOUrbanizacion(){
            comunidad = new ArrayList<Urbanizacion>();
            conn = ConexionBD.getConexion();
            enlistarComunidad(ConexionBD.queryUrbanizacion());
        }
        
        private static void enlistarComunidad(ResultSet rs) {
            try {
                while (rs.next()){ 
                    comunidad.add(new Urbanizacion(rs.getInt("codigo"), rs.getString("ciudad"), rs.getInt("cod_postal"),rs.getString("nombre"),rs.getString("calle"),rs.getInt("numero")));
                }
            } 
            catch (SQLException ex) {
                System.out.println("Error en la ejecución SQL: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        
        public int insertarUrbanizacion(Urbanizacion urbanizacion) {
            conn = ConexionBD.getConexion();
            if (ConexionBD.queryInsertarComunidad(urbanizacion) == 1) {
                enlistarComunidad(ConexionBD.queryUrbanizacion());
                ConexionBD.cerrarConexion();
                return 1;  
            }
            else {
                ConexionBD.cerrarConexion();
                return 0;
            }
        }
        
        public int eliminarUrbanizacion(Urbanizacion urbanizacion) {
            // TODO Auto-generated method stub
            conn = ConexionBD.getConexion();
            if (ConexionBD.queryEliminarComunidad(urbanizacion) == 1) {
                enlistarComunidad(ConexionBD.queryUrbanizacion());
                ConexionBD.cerrarConexion();
                return 1;
            }
            else {
                ConexionBD.cerrarConexion();
                return 0;
            }
        }
        
        public int modificarUrbanizacion(Urbanizacion urbanizacion, String ciudad, Integer codPostal, String nombre, String calle, Integer numero) {
            // TODO Auto-generated method stub
            conn = ConexionBD.getConexion();
            if (ConexionBD.queryModificarComunidad(urbanizacion, ciudad, codPostal, nombre, calle, numero) == 1) {
                enlistarComunidad(ConexionBD.queryUrbanizacion());
                ConexionBD.cerrarConexion();
                return 1;
            }
            else {
                ConexionBD.cerrarConexion();
                return 0;
            }
        } 

        public void actualizarDAO(){
            comunidad.clear();
            enlistarComunidad(ConexionBD.queryUrbanizacion());
        }
        
        public ArrayList<Urbanizacion> getComunidades(){
            return this.comunidad;        
        }            
}
