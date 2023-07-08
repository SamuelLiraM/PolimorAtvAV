
package polimorfismoav;

import java.util.Scanner;

public class Carro extends Veiculos{
    private double kilom;
    
    public Carro(){
        this("Nenhum",0.0,0.0);
    }

    public Carro(String modelo, double preco, double kilom) {
        super(modelo, preco);
        setKm(kilom);
    }

    public double getPreco(){
        return preco;
    }

    public void setKm(double k) {
        kilom = (k>0)? k:0;
    }
    
    
    public void inserirDados(){
        super.inserirDados();
        
        Scanner in = new Scanner(System.in);
       
        System.out.println("\n Entre com a kilometragem do carro: ");
        double k = in.nextDouble();
        
        setKm(k);
    }

    
}
