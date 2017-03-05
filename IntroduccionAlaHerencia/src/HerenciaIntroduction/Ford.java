/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaIntroduction;

public class Ford extends Auto {

    public Ford(String marca, Double precio) {
        super(marca,precio);
      
    }

   
    public void setPrice() {
      super.setPrecio(20000.00);
         System.out.println("el precio es:"+getPrecio());
    }
  
   



  
  
    
}
