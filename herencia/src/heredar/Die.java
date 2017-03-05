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
public class Die {

    public Die() {
        
    }
 
    private Integer numAleatorio;

  
    public Integer getNumAleatorio() {
        return numAleatorio;
    }

 
    public static Integer ValorDado( ){
      Integer  numero = (int)(Math.random() * 100) % 6 + 1;
   
       return numero;
    }

   
    
}

