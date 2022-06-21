package arrayVetor; 
 
import java.util.Scanner; 
 
public class Exemplo6 { 
 
 public static void main(String[] args) { 
  // TODO Auto-generated method stub 
   
  Scanner scan = new Scanner(System.in); 
   
  int vetor[] = {5,6,7,8,9}; 
  int i=0; 
   
  while(i<5) { 
   System.out.println("Valor de i: "+i); 
   System.out.println("Posição do vetor de acordo com o valor de i: "+vetor[i]); 
   i++; 
  } 
 } 
 
}