/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heredar;

/**
 *
 * @author Cesar
 */
public class Candle {
    private String Color;
    double altura;
    double precio;

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura =altura;
        this.precio= altura*2;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
