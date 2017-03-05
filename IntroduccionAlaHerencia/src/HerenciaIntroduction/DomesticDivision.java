
package HerenciaIntroduction;

public class DomesticDivision extends Division {
    private String estado;


    public DomesticDivision(String nombre, String nCuenta ,String estado) {
        super(nombre, nCuenta);
        this.estado=estado;  
    }

    public String getEstado() {
        return estado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getnCuenta() {
        return nCuenta;
    }
    
}
