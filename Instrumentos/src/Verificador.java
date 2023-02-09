public class Verificador {

    int numeracao;

    public void setNumeracao(int numeracao) {
        this.numeracao = numeracao;
    }

    public boolean autentica(int numeracao){
        if(this.numeracao == numeracao){

            return true;
        }

            return false;
    }
}
