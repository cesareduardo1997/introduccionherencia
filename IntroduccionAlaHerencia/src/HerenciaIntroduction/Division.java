/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaIntroduction;

/**
 *
 * @author Cesar
 */
public abstract class Division {
    public String nombre;
    public String nCuenta;

    public Division(String nombre, String nCuenta) {
        this.nombre = nombre;
        this.nCuenta = nCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getnCuenta() {
        return nCuenta;
    }
    
  
    
    
}
