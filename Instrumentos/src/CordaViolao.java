public class CordaViolao implements Verificáveis {

    private Verificador verificador;

    public CordaViolao(){

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
