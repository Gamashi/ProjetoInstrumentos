public class SistemaInterno {

    public int numeracao =  5252;

    public void auntentica(Verificáveis ve){

        boolean autenticou = ve.autentica(this.numeracao);
            if (autenticou){

                System.out.println("É um instrumento");
            }else{

                System.out.println("Não é um instrumento");

            }
                
    }   

}

