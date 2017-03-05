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
public class UseGeometric {

    public static void main(String[] args) {

        Square figura1 = new Square(23.5, 5.0, "cuadrado");
        System.out.println(figura1.Area());
        Triangle figura2 = new Triangle(4.0, 5.0, "triangulo");

        System.out.println(figura2.Area());

    }
}
