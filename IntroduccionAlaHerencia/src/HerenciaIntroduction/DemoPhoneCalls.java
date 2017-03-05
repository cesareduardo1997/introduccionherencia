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
public class DemoPhoneCalls {

    public static void main(String[] args) {
        OutgoingPhoneCall telefono1 = new OutgoingPhoneCall("95123",2);
        telefono1.mensaje();
        System.out.println();
        IncomingPhoneCall telefono2 = new IncomingPhoneCall("83748464");
        telefono2.mensaje();
    }
}
