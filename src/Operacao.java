
import java.util.Scanner;


public class Operacao {
    Scanner scan = new Scanner(System.in);
    public String Objeto;
    private String Valor;
    
    public void Atributo(){
        System.out.println("Digite o nome do Objeto: ");
        this.Objeto = scan.next();
        
    }
    public void ImprimirValores(){
        System.out.println("=======");
        System.out.print("Valor: " + this.Valor);
        
        
    } 
    
}
