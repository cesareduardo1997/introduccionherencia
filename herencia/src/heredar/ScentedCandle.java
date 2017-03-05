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
public class ScentedCandle extends Candle {
     private String Aroma;

    public String getAroma() {
        return Aroma;
    }

    public void setAroma(String Aroma) {
        this.Aroma = Aroma;
    }
    

    public void setAltura (double altura){
    
        super.altura = altura;
	super.precio = 3.00 * altura;   
    }    
         
}
