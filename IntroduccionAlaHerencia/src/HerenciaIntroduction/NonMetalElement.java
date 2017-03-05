
package HerenciaIntroduction;

/**
 *
 * @author Cesar
 */
public class NonMetalElement  extends Elemento {

    public NonMetalElement(String simbolo, Integer nAtomico, Double pAtomico) {
        super(simbolo, nAtomico, pAtomico);
    }

    @Override
    public void describeElement() {
           System.out.println("DESCRIPCION"); 
    }
        
    
}
