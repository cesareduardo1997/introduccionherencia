
package heredar;


public class Jupiterian extends Alien {
   
    public Jupiterian(Integer numojos, String nombre, String colorpiel) {
        super(numojos, nombre, colorpiel);
    }
    

    
     public static void main(String[] args) {
        Jupiterian alien2= new Jupiterian(2,"agabus","naranja");
        System.out.println(alien2.toString());
    }

 
    public String toString(String x) {
        return x.toString();
    }

    /**
     *
     */
    public  Jupiterian() {
       Jupiterian alien2= new Jupiterian(2,"agabus","naranja");
        alien2.toString();
    }

 

}
