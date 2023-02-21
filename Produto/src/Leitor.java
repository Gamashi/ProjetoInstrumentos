import java.util.Scanner;

public class Leitor {

    private String palavra;
    private double valor;
    private Scanner sx;

    public Leitor(){

         sx = new Scanner(System.in);
    }

        public void Ler(){

            System.out.println("Digite o nome do produto: ");
            this.palavra = this.sx.nextLine();
    
            System.out.println("Digite o preço bruto: ");
            this.valor = this.sx.nextDouble();

            
        }

    public void FecharLeitor(){
        sx.close();
    }

    public String getPalavra() {
            return palavra;
        }
    
    public double getValor() {
            return valor;
        }
    
}
