public class Trompete extends Instrumento implements Verificáveis {

    private Verificador verificador;


    public Trompete(String tipologia, String proprietario) {

        super(tipologia, proprietario);

        this.verificador = new Verificador();
    }

    public void setNumeracao(int numeracao){

        this.verificador.setNumeracao(numeracao);
    }

    public boolean autentica(int numeracao){
    
        return this.verificador.autentica(numeracao);

    }
}
