
package HerenciaIntroduction;


public class Chevy extends Auto {

    public Chevy(String marca, Double precio) {
        super(marca, precio);
    }

    @Override
    public void setPrice() {
         super.setPrecio(22000.00);
         System.out.println("el precio es:"+getPrecio());
    }
    
}
