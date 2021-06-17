/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenad;

/**
 *
 * @author Usuario
 */
public class Urbanizacion {
    Integer codigo;
    String ciudad;
    Integer codPostal;
    String nombre;
    String calle;
    Integer numero;
    
    Urbanizacion(Integer codigo, String ciudad, Integer codPostal, String nombre, String calle, Integer numero){
        this.codigo=codigo;
        this.ciudad=ciudad;
        this.codPostal=codPostal;
        this.nombre=nombre;
        this.calle=calle;
        this.numero=numero;
    }
    
    Urbanizacion(String ciudad, Integer codPostal, String nombre, String calle, Integer numero){
        this.ciudad=ciudad;
        this.codPostal=codPostal;
        this.nombre=nombre;
        this.calle=calle;
        this.numero=numero;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(Integer codPostal) {
        this.codPostal = codPostal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Urbanizacion{" + "codigo=" + codigo + ", ciudad=" + ciudad + ", codPostal=" + codPostal + ", nombre=" + nombre + ", calle=" + calle + ", numero=" + numero + '}';
    }
    
    
}
