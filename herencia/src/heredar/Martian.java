
package heredar;


public class Martian extends Alien {
    
    public Martian(Integer numojos, String nombre, String colorpiel) {
        super(numojos, nombre, colorpiel);
    }
    public static void main(String[] args) {
        Martian alien1= new Martian(4,"alex leon","azul");
        System.out.println(alien1.toString());
    }


    public String toString() {
        return "Martian{" + '}';
    }

    public Martian() {
        
    }
    
    
}
