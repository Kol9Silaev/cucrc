public class NOKandNOD {

    String found(int a, int b) {
        int nok = nokFound(a,b);
        return "НОК: " + nok + " НОД: " + nodFound(a,b,nok);
    }

    private int nokFound(int a, int b) {
        return b == 0? a : nokFound(b, a % b);
     }

    private int nodFound(int a, int b, int nok) {
        return a /nok * b;
    }
}
