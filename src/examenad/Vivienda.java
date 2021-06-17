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
public class Vivienda {
    Integer codUrbanizacion, piso;
    String letra;
    String propietario;
    Double tarifa;
    Boolean moroso;
    Integer numMesesAdeudados;
    
    Vivienda(Integer codUrbanizacion, Integer piso, String letra, String propietario, Double tarifa, Boolean moroso, Integer numMesesAdeudados){
       this.codUrbanizacion=codUrbanizacion;
       this.piso=piso;
       this.letra=letra;
       this.propietario=propietario;
       this.tarifa=tarifa;
       this.moroso=moroso;
       this.numMesesAdeudados=numMesesAdeudados;
    }

    public Integer getCodUrbanizacion() {
        return codUrbanizacion;
    }

    public void setCodUrbanizacion(Integer codUrbanizacion) {
        this.codUrbanizacion = codUrbanizacion;
    }

    public Integer getPiso() {
        return piso;
    }

    public void setPiso(Integer piso) {
        this.piso = piso;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public Double getTarifa() {
        return tarifa;
    }

    public void setTarifa(Double tarifa) {
        this.tarifa = tarifa;
    }

    public Boolean getMoroso() {
        return moroso;
    }

    public void setMoroso(Boolean moroso) {
        this.moroso = moroso;
    }

    public Integer getNumMesesAdeudados() {
        return numMesesAdeudados;
    }

    public void setNumMesesAdeudados(Integer numMesesAdeudados) {
        this.numMesesAdeudados = numMesesAdeudados;
    }

    @Override
    public String toString() {
        return "Vivienda{" + "codUrbanizacion=" + codUrbanizacion + ", piso=" + piso + ", letra=" + letra + ", propietario=" + propietario + ", tarifa=" + tarifa + ", moroso=" + moroso + ", numMesesAdeudados=" + numMesesAdeudados + '}';
    }

    
    
}
