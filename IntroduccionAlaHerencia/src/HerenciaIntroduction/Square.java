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
public class Square extends GeometricFigure {

    public Square(Double altura, Double ancho, String figura) {
        super(altura, ancho, figura);
    }

  

    @Override
    public Double Area() {
       return (this.getAltura()*this.getAncho());
    }
    
    
}
