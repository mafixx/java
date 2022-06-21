package matematicA; 
 
import java.util.Scanner; 
 
public class Ex1 { 
 
 public static void main(String[] args) { 
  //Calcule a área de um cubo 
 
  Scanner scan = new Scanner (System.in); 
 
  double areaTotal; 
  double a; 
   
  System.out.println("Digite a área do cubo: "); 
  a = scan.nextDouble(); 
   
  areaTotal = (6*(a*a)); 
  System.out.println("A área total é: "+areaTotal); 
  
   
  System.out.println("Digite o lado do cubo: "); 
  a = scan.nextDouble(); 
   
  areaTotal = (a*a*a); 
  System.out.println("O volume do cubo é: "+areaTotal); 
   
 } 
 
}