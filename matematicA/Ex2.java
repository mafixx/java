package matematicA; 
 
import java.util.Scanner; 
 
public class Ex2 { 
 
 public static void main(String[] args) { 
  //Calcule a �rea total da pir�mide e o seu volume 
   
  Scanner scan = new Scanner (System.in); 
   
  double areaTotal; 
  double ab, al, h; 
   
  System.out.println("Digite a �rea da base da pir�mide: "); 
  ab = scan.nextDouble(); 
   
  System.out.println("Digite a �rea lateral da pir�mide: "); 
  al = scan.nextDouble(); 
   
  areaTotal = ab+al; // C�lculo da �rea total da pir�mide 
  System.out.println("A �rea total da pir�mide �: "+areaTotal); 
   
  System.out.println("Digite a altura da pir�mide: "); 
  h = scan.nextDouble(); 
   
  areaTotal = (ab*h)/3; // C�lculo do volume da pir�mide 
  System.out.println("O volume da pir�mide �: "+areaTotal); 
 
 } 
 
}