
package HerenciaIntroduction;

public class UseAuto {
    public static void main(String[] args) {
        Ford auto1=new Ford("Ford",0.00);
        auto1.setPrice();
        System.out.println(auto1.getMarca());
        Chevy auto2=new Chevy("Nissan",0.00);
        auto2.setPrice();
         System.out.println(auto2.getMarca());
        
    }
}
