
package polimorfismoav;

import java.util.Scanner;

public class Moto extends Veiculos{
    private int nAnos;
    
    public Moto(){
        this("Nenhum",0.0, 0);
    }
    
    public Moto(String modelo, double preco, int nAnos) {
        super(modelo, preco);
        setAno(nAnos);
    }
    
    
    public double getPreco(){
        return preco;
    }
    
    public void setAno(int nAno){
        nAnos = (nAno > 0)? nAno:0;
    }

    
       public void inserirDados(){
        super.inserirDados();
        
        Scanner in = new Scanner(System.in);
           
        System.out.println("\n Entre com o ano da moto: ");
        int nAno = in.nextInt();
        
        setAno(nAno);
    } 
}
