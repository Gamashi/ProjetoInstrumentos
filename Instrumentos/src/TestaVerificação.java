public class TestaVerificação {

    public static void main(String[] args) {

        Trompete trompete = new Trompete("sopro", "Gustavo");
        trompete.setNumeracao(5252);

        SistemaInterno si = new SistemaInterno();
        si.auntentica(trompete);



    }
}
