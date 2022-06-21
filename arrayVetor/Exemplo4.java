package arrayVetor; 
 
import java.util.Scanner; 
 
public class Exemplo4 { 
 
 public static void main(String[] args) { 
  // TODO Auto-generated method stub 
   
  Scanner scan = new Scanner(System.in); 
   
  double notas[] = new double[4]; 
   
  System.out.println("Digite a nota 1: "); 
  notas[0] = scan.nextDouble(); 
   
  System.out.println("Digite a nota 2: "); 
  notas[1] = scan.nextDouble(); 
   
  System.out.println("Digite a nota 3: "); 
  notas[2] = scan.nextDouble(); 
   
  System.out.println("Digite a nota 4: "); 
  notas[3] = scan.nextDouble(); 
   
  double media = (notas[0]+notas[1]+notas[2]+notas[3])/4; 
   
  System.out.println("Média final: "+media); 
 } 
 
}