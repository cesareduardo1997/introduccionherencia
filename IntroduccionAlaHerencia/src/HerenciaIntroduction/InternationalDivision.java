
package HerenciaIntroduction;


public class InternationalDivision extends Division{
     private String pais;
     private String lengua; 

    public InternationalDivision(String nombre, String nCuenta,String pais,String lengua) {
        super(nombre, nCuenta);
        this.pais=pais;
        this.lengua=lengua;
    }

    public String getPais() {
        return pais;
    }

    public String getLengua() {
        return lengua;
    }
    

    
    
}
