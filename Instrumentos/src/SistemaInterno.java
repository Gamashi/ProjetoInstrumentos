public class SistemaInterno {

    private String palavra = "instrumento";

    public void Autentica(Instrumento instrumento){

        boolean autenticou = instrumento.Verifica(this.palavra);
            if(autenticou){
                System.out.println("ok!");
            }else{
                System.out.println("Não podemos prosseguir");
            }
        }
    }

