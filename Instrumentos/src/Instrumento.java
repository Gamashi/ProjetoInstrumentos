public abstract class Instrumento {

    private String proprietario;
    private double preço;
    private String tipologia;

    public Instrumento(String proprietario, String tipologia){
        this.proprietario = proprietario;
        this.tipologia = tipologia;

    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }
    public void setProprietario(String proprietario ) {
        this.proprietario = proprietario;
    }      
    
    public String getProprietario() {
        return proprietario;
    }

    public String getTipologia() {
        return tipologia;
    }

}

 