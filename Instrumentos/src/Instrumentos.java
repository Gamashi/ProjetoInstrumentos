public class Instrumentos {

    private String Proprietario;
    //private Tipologia tipo;
   // private int numeração;
    private boolean verificado;

    public boolean Verifica(String palavra){
        if (palavra == "Instrumento"){
            return true;
        }
            return false;
}

    public boolean Autentica(String palavra){

        if (Verifica(palavra)){
            System.out.println("Certo!");
            return true;
        }else{
            System.out.println("Só aceitamos instrumentos musicais");
            return false;
        }
    }

    public void setProprietario(String Proprietario ) {
        this.Proprietario = Proprietario;
    }      
    
    public String getProprietario() {
        return Proprietario;
    }

    public boolean getVerificado() {
        return verificado;
    }
}

 