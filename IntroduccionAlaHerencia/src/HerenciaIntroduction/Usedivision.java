package HerenciaIntroduction;

public class Usedivision {

    public static void main(String[] args) {
        InternationalDivision empresa = new InternationalDivision("sony", "123465", "alemania", "aleman");
        System.out.println(empresa.getNombre());
        System.out.println(empresa.getnCuenta());
        System.out.println(empresa.getLengua());
        System.out.println(empresa.getPais());
        System.out.println();

        DomesticDivision empresa2 = new DomesticDivision("adidas", "74383", "oaxaca");
        System.out.println(empresa2.getNombre());
        System.out.println(empresa2.getnCuenta());

        System.out.println(empresa2.getEstado());

    }
}
