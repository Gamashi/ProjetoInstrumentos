public class Instrumento {

    private String Proprietario;
    private String palavra;
    //private Tipologia tipo;
    // private int numeração;

    public boolean Verifica(String palavra){
        if (this.palavra == palavra){
            return true;
        }
            return false;
}

    public void setProprietario(String Proprietario ) {
        this.Proprietario = Proprietario;
    }      
    
    public String getProprietario() {
        return Proprietario;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }
}

 