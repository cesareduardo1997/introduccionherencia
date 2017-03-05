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
public class OutgoingPhoneCall extends PhoneCall {

    private Integer tiempo;

    public OutgoingPhoneCall(String numero, Integer tiempo) {
        super(numero);
        tiempo=tiempo*60;
        setTiempo(tiempo);
        super.setPrecio(0.04);
        
    

    }

    public Integer getTiempo() {
        return tiempo;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }

    public void mensaje() {
        System.out.println("numero teleefonico "+super.getNumero());
        System.out.println("precio por minuto "+super.getPrecio());
        System.out.println("minutos de la llamada "+getTiempo());
        System.out.println("el precio de la llamada "+super.getPrecio()*getTiempo());
        
    }

}
