public class Calcula {

    private double impostos;
    private double revendedor;
    private double preçoFinal;


    public void Final(double bruto){

            impostos = bruto * 0.3;     

            revendedor = bruto * 0.28;
    
            preçoFinal = bruto + impostos + revendedor;
            System.out.println("Preço Final: " + preçoFinal);
            System.out.println();

    }

    public double getImpostos() {
        return impostos;
    }
    
}
