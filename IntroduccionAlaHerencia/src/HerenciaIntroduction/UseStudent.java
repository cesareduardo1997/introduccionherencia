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
public class UseStudent {

    public static void main(String[] args) {
        FullTime c = new FullTime();
        PartTime p = new PartTime();
        c.setDias(4);
        p.setHoras(9);
        System.out.println(c.Colegiatura());

        System.out.println(p.Colegiatura());

    }

}
