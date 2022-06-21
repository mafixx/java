package matematicA; 
 
import java.util.Scanner; 
 
public class Ex3 { 
 
 public static void main(String[] args) { 
  /*Para calcularmos a área total de um dodecaedro precisamos levar em conta  
  a área do pentágono, que é dada pela seguinte expressão  
  A = (a*P)/2, onde a: medida do apótema do pentágono (depende do tamanho do lado) e P: perímetro  
  do pentágono (depende do tamanho do lado).  
  Calculada a área do pentágono, basta multiplicar por doze -  
  que é o número de faces pentagonais do dodecaedro. */ 
 
  Scanner scan = new Scanner (System.in); 
   
  double areaTotal; 
  double apotema; 
  double perimetro; 
   
  System.out.println("Digite o apótema do dodecaedro: "); 
  apotema = scan.nextDouble(); 
   
  System.out.println("Digite o perímetro do dodecaedro: "); 
  perimetro = scan.nextDouble(); 
   
  areaTotal = (apotema*perimetro)/2; //Cálculo da área total 
  System.out.println("A área total do dodecadro é: "+areaTotal); 
   
   
  System.out.println("Digite a aresta do dodecaedro: "); 
  double aresta = scan.nextDouble(); 
   
  areaTotal = ((aresta*aresta*aresta)/4)*(15+7*(2.2360679775)); //Cálculo do volume 
  System.out.println("O volume do dodecaedro é: "+areaTotal); 
   
 } 
 
}