package teste; 
  
import javax.swing.JOptionPane; 
  
 
public class TesteShowInputDialog { 
  
    public static void main(String[] args) { 
  
        int numeroLido;         
        int menor; 
        int maior; 
        final int CONTADOR = 5; 
  
        // Inicia com o primeiro numero lido 
        System.out.println("Informe um valor"); 
        numeroLido = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor")); 
  
        menor = numeroLido; 
        maior = numeroLido; 
  
        for (int i = 1; i < CONTADOR; i++) { 
            System.out.println("Informe um valor"); 
            numeroLido = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor")); 
  
            if(numeroLido > maior){ 
                maior = numeroLido; 
            } 
  
            if(numeroLido < menor){ 
                menor = numeroLido; 
            } 
  
        } 
  
        System.out.println("O menor n�mero lido foi: " + menor); 
        System.out.println("O maior n�mero lido foi: " + maior); 
    } 
  
}