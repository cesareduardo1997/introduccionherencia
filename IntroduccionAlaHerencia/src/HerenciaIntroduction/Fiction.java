
package HerenciaIntroduction;


public class Fiction extends Book{

    public Fiction(String titulo, Double precio) {
        super(titulo, precio);    
    }
    public Double setPrice() {
        Double precio=24.99;
      return precio;
    }
    
}
