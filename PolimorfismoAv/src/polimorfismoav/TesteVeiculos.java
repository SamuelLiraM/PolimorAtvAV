
package polimorfismoav;

import java.util.Scanner;

public class TesteVeiculos {
    public static void main(String[] args) {
        Veiculos[]lista = new Veiculos[10];
        
        int opcao;
        
        for (int i=0; i<2; i++){
            System.out.println("Digite 1 para Carro e 2 para Moto: ");
            Scanner in = new Scanner(System.in);
            opcao = in.nextInt();
            if(1==opcao)
                lista[i]= new Carro();
            else
                lista[i]= new Moto();
            lista[i].inserirDados();
        }
        for (int i=0; i<2; i++)
            lista[i].printDados();
        System.out.println("Cadastro: ");
    }
}
