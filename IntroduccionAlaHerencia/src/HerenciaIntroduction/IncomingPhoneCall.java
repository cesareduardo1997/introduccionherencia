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
public class IncomingPhoneCall extends PhoneCall {

    public IncomingPhoneCall(String numero) {
        super(numero);
        super.setPrecio(0.02);
    }

   
    public void mensaje() {
          System.out.println("numero telefonico "+super.getNumero());
        System.out.println("precio por minuto "+super.getPrecio());
        
    }
    
    
}
