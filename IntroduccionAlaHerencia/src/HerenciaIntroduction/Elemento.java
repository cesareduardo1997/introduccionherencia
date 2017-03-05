
package HerenciaIntroduction;


public abstract class Elemento {
    private String simbolo;
    private Integer nAtomico;
    private Double pAtomico;

    public Elemento(String simbolo, Integer nAtomico, Double pAtomico) {
        this.simbolo = simbolo;
        this.nAtomico = nAtomico;
        this.pAtomico = pAtomico;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public Integer getnAtomico() {
        return nAtomico;
    }

    public Double getpAtomico() {
        return pAtomico;
    }
    
    public abstract void describeElement();
}
