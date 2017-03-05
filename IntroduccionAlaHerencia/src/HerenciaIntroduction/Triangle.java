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
public class Triangle extends GeometricFigure {

    public Triangle(Double altura, Double ancho, String figura) {
        super(altura, ancho, figura);
    }


     public Double Area(){
        return(this.getAncho()*this.getAltura())/2;
        
    }
   
     
    
}
