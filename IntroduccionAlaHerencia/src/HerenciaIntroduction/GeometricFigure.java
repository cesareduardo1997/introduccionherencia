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
public abstract class GeometricFigure {

    private Double altura;
    private Double ancho;
    private String figura;

    public GeometricFigure(Double altura, Double ancho, String figura) {
        this.altura = altura;
        this.ancho = ancho;
        this.figura = figura;
    }

    public abstract Double Area();

    public Double getAltura() {
        return altura;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

}
