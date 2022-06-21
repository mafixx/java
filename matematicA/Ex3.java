package matematicA; 
 
import java.util.Scanner; 
 
public class Ex3 { 
 
 public static void main(String[] args) { 
  /*Para calcularmos a �rea total de um dodecaedro precisamos levar em conta  
  a �rea do pent�gono, que � dada pela seguinte express�o  
  A = (a*P)/2, onde a: medida do ap�tema do pent�gono (depende do tamanho do lado) e P: per�metro  
  do pent�gono (depende do tamanho do lado).  
  Calculada a �rea do pent�gono, basta multiplicar por doze -  
  que � o n�mero de faces pentagonais do dodecaedro. */ 
 
  Scanner scan = new Scanner (System.in); 
   
  double areaTotal; 
  double apotema; 
  double perimetro; 
   
  System.out.println("Digite o ap�tema do dodecaedro: "); 
  apotema = scan.nextDouble(); 
   
  System.out.println("Digite o per�metro do dodecaedro: "); 
  perimetro = scan.nextDouble(); 
   
  areaTotal = (apotema*perimetro)/2; //C�lculo da �rea total 
  System.out.println("A �rea total do dodecadro �: "+areaTotal); 
   
   
  System.out.println("Digite a aresta do dodecaedro: "); 
  double aresta = scan.nextDouble(); 
   
  areaTotal = ((aresta*aresta*aresta)/4)*(15+7*(2.2360679775)); //C�lculo do volume 
  System.out.println("O volume do dodecaedro �: "+areaTotal); 
   
 } 
 
}