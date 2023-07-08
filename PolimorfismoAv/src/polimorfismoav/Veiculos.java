
package polimorfismoav;

import java.util.Scanner;

public class Veiculos {
    String modelo;
    double preco;
    
    public Veiculos(String name, double preco){
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getPreco() {
        return preco;
    }
    public void printDados(){
        String n = getPreco()+ "\n";
        System.out.println(n);
    }
    public void inserirDados(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("\n Entre com o modelo: ");
        String modelo = in.nextLine();
        System.out.println("\n Entre com o preco: ");
        double preco = in.nextDouble();
              
    }     
}
