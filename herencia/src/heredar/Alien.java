
package heredar;

public class Alien {
    private Integer numojos;
    private String nombre;
    private String colorpiel;

    public Alien(Integer numojos, String nombre, String colorpiel) {
        this.numojos = numojos;
        this.nombre = nombre;
        this.colorpiel = colorpiel;
    }
   public Alien(){
       
   }
    

    public Integer getNumojos() {
        return numojos;
    }

    public void setNumojos(Integer numojos) {
        this.numojos = numojos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColorpiel() {
        return colorpiel;
    }

    public void setColorpiel(String colorpiel) {
        this.colorpiel = colorpiel;
    }

    @Override
    public String toString() {
        return "Alien" + "numero de ojos = " + numojos + ", nombre = " + nombre + ", color de piel = " + colorpiel ;
    }
    
}
