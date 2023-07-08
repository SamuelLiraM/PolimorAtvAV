
package polimorfismoav;

import java.util.Scanner;

public class Midia {
    private int codigo;
    private double preco;
    private String name;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Midia(){
        this(0,0.0,"Nenhum");
    }
    public Midia(int codigo, double preco, String name){
        setCodigo(codigo);
        setPreco(preco);
        setName(name);
    }
    public String getTipo(){
        return "Midia: ";
    }
    public String getDetalhes(){
        return "Codigo: "+ getCodigo()+"\n"+
                "Preco: "+getPreco()+"\n"+
                "Nome: "+getName()+"\n";
    }
    
    public void printDados(){
        String s = getTipo()+ "\n"+ getDetalhes()+"\n";
        System.out.println(s);
    }
    
    public void inserirDados(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("\n Entre com o codigo: ");
        int cod = in.nextInt();
        System.out.println("\n Entre com o preco: ");
        double pre = in.nextDouble();
        System.out.println("\n Entre com o nome: ");
        String nam = in.nextLine();
        
        setCodigo(cod);
        setPreco(pre);
        setName(nam);
    }
}
