package examenad;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;

/**
 *
 * @author josel
 */
public class ConexionBD {
    static Connection conn = null;
    static Statement st = null;
    static ResultSet rs = null;
    static String bd = "examen";
    static String user = "examen";
    static String password = "examen";
    static String url = "jdbc:mysql://localhost/"+bd+"?serverTimezone=Europe/Madrid";
    
    public static Connection getConexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,password);
        }
        catch(ClassNotFoundException ex){
            System.out.println("Imposible acceder al driver MYSQL");
        }
        catch(SQLException ex){
            System.out.println("Error en la ejecución SQL: "+ex.getMessage());
        }
        return conn;
    }
    
    public static ResultSet queryUrbanizacion(){ //Método para consultar datos de la tabla vivienda
        conn = ConexionBD.getConexion();
        try{
            st = conn.createStatement();
        }
        catch (SQLException ex) {
            System.out.println("Error en la ejecución SQL: " + ex.getMessage());
	}
        
        try{
            rs = st.executeQuery("select * from urbanizacion");
        }
	catch (SQLException ex) {
            System.out.println("Error en la ejecución SQL: " + ex.getMessage());
	}
        return rs;
    }
    
    public static ResultSet queryViviendas(){ //Método para consultar datos de la tabla vivienda
        conn = ConexionBD.getConexion();
        try{
            st = conn.createStatement();
        }
        catch (SQLException ex) {
            System.out.println("Error en la ejecución SQL: " + ex.getMessage());
	}
        
        try{
            rs = st.executeQuery("select * from vivienda");
        }
	catch (SQLException ex) {
            System.out.println("Error en la ejecución SQL: " + ex.getMessage());
	}
        return rs;
    }
    
    public static int queryInsertarComunidad(Urbanizacion urbanizacion){ //Método para insertar documentos en la tabla documentosalumnos
        Statement st = ConexionBD.st;
        try{
            st = conn.createStatement();
        }
        catch (SQLException ex) {
            System.out.println("Error en la ejecución SQL: " + ex.getMessage());
	}
        
        try{
            st.executeUpdate("insert into urbanizacion (ciudad, cod_postal, nombre, calle, numero)"
                    + "values('"+urbanizacion.getCiudad()+"', '"+urbanizacion.getCodPostal()
                    +"', '"+urbanizacion.getNombre()+"', '"+urbanizacion.getCalle()+"', '"+urbanizacion.getNumero()+"')");
        }
	catch (SQLException ex) {
            System.out.println("Error en la ejecución SQL: " + ex.getMessage());
            return 0;
	}
        return 1;
    }
   
    public static int queryEliminarComunidad(Urbanizacion Urbanizacion){
        Statement st = ConexionBD.st;
        try{
            st = conn.createStatement();
        }
        catch (SQLException ex) {
            System.out.println("Error en la ejecución SQL: " + ex.getMessage());
	}
        
        try{
            st.executeUpdate("delete from urbanizacion where codigo='"+Urbanizacion.getCodigo()+"'");
        }
	catch (SQLException ex) {
            System.out.println("Error en la ejecución SQL: " + ex.getMessage());
            return 0;
	}
        return 1;
    }
    
    public static int queryModificarComunidad(Urbanizacion urbanizacion, String ciudad, Integer codPostal, String nombre, String calle, Integer numero){
        Statement st = ConexionBD.st;
        try{
            st = conn.createStatement();
        }
        catch(SQLException ex){
            System.out.println("Error en la ejecución SQL: " + ex.getMessage());
        }
        
        try{
            st.executeUpdate("update urbanizacion set ciudad = '"+ciudad+"', cod_postal = '"+codPostal+"', nombre = '"+nombre+"', calle = '"+calle+"', numero = '"+numero+"' where codigo = '"+urbanizacion.getCodigo()+"'");
        }
        catch(SQLException ex){
            System.out.println("Error en la ejecución SQL: " + ex.getMessage());
            return 0;
        }
        return 1;
    }
    
    public static void cerrarConexion(){
        try{
            rs.close();
            st.close();
            conn.close();
        }
        catch(SQLException ex){
            System.out.println("Error al cerrar la conexión con la BD: "+ex.getMessage());
        }
    }
}
