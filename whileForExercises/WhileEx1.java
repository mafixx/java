package whileForExercises; 
 
import java.util.Scanner; 
 
public class WhileEx1 { 
 
 public static void main(String[] args) { 
  /*Faça um programa que peça uma nota, entre zero e dez.  
  Mostre uma mensagem caso o valor seja inválido e continue pedindo  
  até que o usuário informe um valor válido. */ 
 
  Scanner scan = new Scanner (System.in); 
   
   
  double n1=-1; 
  boolean flag = true; 
   
  while (n1<0 || n1>10) { 
   System.out.println("Digite nota: "); 
   n1 = scan.nextDouble(); 
   if (n1<0 || n1>10) { 
   System.out.println("Valor inválido!");  
   } 
  } 
   
 } 
 
}