
public class Produto {

    private String nome;
    private double bruto;
    private Calcula calcula;
    private Leitor leitor;
    private static int total = 0;

    public Produto(){

        total ++;

        this.calcula = new Calcula();
        this.leitor = new Leitor();
        this.leitor.Ler();
        this.nome = this.leitor.getPalavra();
        this.bruto = this.leitor.getValor();

    }

    public void PreçoFinal(){
        System.out.println();
        System.out.println("Produto: " + this.nome);
        this.calcula.Final(this.bruto);
    }

    public void getImpostos(){
        System.out.println(calcula.getImpostos()); 
    }

    public String getNome() {
        return nome;
    }

    public Double getBruto(){
        return bruto;
    }

    public static int getTotal() {
        return total;
    }
}

