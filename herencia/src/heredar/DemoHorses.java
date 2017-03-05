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
public class DemoHorses {

    public static void main(String[] args) {

        Horse c1 = new Horse();
        c1.setNombre("caballo1");
        c1.setColor("cafe");
        c1.setNacimiento(2016);

        RaceHorse c2 = new RaceHorse();
        c2.setNombre("caballo2");
        c2.setColor("blanco");
        c2.setNacimiento(2017);
        c2.setnCarreras(7);
       
        System.out.println(c1.getNombre()+" "+c1.getColor() +" "+c1.getNacimiento());
       System.out.println(c2.getNombre()+" "+c2.getColor() +" "+c2.getNacimiento()+" "+c2.getnCarreras());

    }
}
