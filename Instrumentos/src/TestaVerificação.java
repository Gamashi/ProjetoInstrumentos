public class TestaVerificação {

    public static void main(String[] args) {

        Instrumento trompete = new Instrumento();
        trompete.setPalavra("instrumento");

        SistemaInterno si = new SistemaInterno();
        si.Autentica(trompete);

    }
}
