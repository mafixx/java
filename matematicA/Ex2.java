package matematicA; 
 
import java.util.Scanner; 
 
public class Ex2 { 
 
 public static void main(String[] args) { 
  //Calcule a área total da pirâmide e o seu volume 
   
  Scanner scan = new Scanner (System.in); 
   
  double areaTotal; 
  double ab, al, h; 
   
  System.out.println("Digite a área da base da pirâmide: "); 
  ab = scan.nextDouble(); 
   
  System.out.println("Digite a área lateral da pirâmide: "); 
  al = scan.nextDouble(); 
   
  areaTotal = ab+al; // Cálculo da área total da pirâmide 
  System.out.println("A área total da pirâmide é: "+areaTotal); 
   
  System.out.println("Digite a altura da pirâmide: "); 
  h = scan.nextDouble(); 
   
  areaTotal = (ab*h)/3; // Cálculo do volume da pirâmide 
  System.out.println("O volume da pirâmide é: "+areaTotal); 
 
 } 
 
}