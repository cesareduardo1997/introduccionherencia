
package HerenciaIntroduction;


public  class MetalElement extends Elemento {
    
    public MetalElement(String simbolo, Integer nAtomico, Double pAtomico) {
        super(simbolo, nAtomico, pAtomico);
    }

   
    public void describeElement() {
       System.out.println("DESCRIPCION"); 
    }
       
    
    
}
