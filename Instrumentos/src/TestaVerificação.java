public class TestaVerificação {

    public static void main(String[] args) {

        Trompete trompete = new Trompete("sopro", "Gustavo");
        trompete.setNumeracao(5252);

        Trombone trombone = new Trombone("sopro", "Maria");
        trombone.setNumeracao(5252);

        CordaViolao corda = new CordaViolao();
        corda.setNumeracao(1010);

        SistemaInterno si = new SistemaInterno();
        si.auntentica(trompete);
        si.auntentica(trombone);
        si.auntentica(corda);


    }
}
