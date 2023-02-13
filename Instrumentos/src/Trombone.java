public class Trombone extends Instrumento implements Verificáveis {

    private Verificador verificador;

    public Trombone(String tipologia, String proprietario){

        super(tipologia, proprietario);

        this.verificador = new Verificador();
    }

    @Override
    public void setNumeracao(int numeracao) {
        this.verificador.setNumeracao(numeracao);
        
    }

    @Override
    public boolean autentica(int numeracao) {
        return this.verificador.autentica(numeracao);
     
    }

}
