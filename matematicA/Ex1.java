package matematicA; 
 
import java.util.Scanner; 
 
public class Ex1 { 
 
 public static void main(String[] args) { 
  //Calcule a �rea de um cubo 
 
  Scanner scan = new Scanner (System.in); 
 
  double areaTotal; 
  double a; 
   
  System.out.println("Digite a �rea do cubo: "); 
  a = scan.nextDouble(); 
   
  areaTotal = (6*(a*a)); 
  System.out.println("A �rea total �: "+areaTotal); 
  
   
  System.out.println("Digite o lado do cubo: "); 
  a = scan.nextDouble(); 
   
  areaTotal = (a*a*a); 
  System.out.println("O volume do cubo �: "+areaTotal); 
   
 } 
 
}