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
public abstract class Auto {
    private String marca;
    private Double precio;

    public Auto(String marca,Double precio) {
        this.marca = marca;
        this.precio=precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public Double getPrecio() {
        return precio;
    }
    
    public abstract void setPrice();
 
    
}
