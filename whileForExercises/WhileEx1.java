package whileForExercises; 
 
import java.util.Scanner; 
 
public class WhileEx1 { 
 
 public static void main(String[] args) { 
  /*Fa�a um programa que pe�a uma nota, entre zero e dez.  
  Mostre uma mensagem caso o valor seja inv�lido e continue pedindo  
  at� que o usu�rio informe um valor v�lido. */ 
 
  Scanner scan = new Scanner (System.in); 
   
   
  double n1=-1; 
  boolean flag = true; 
   
  while (n1<0 || n1>10) { 
   System.out.println("Digite nota: "); 
   n1 = scan.nextDouble(); 
   if (n1<0 || n1>10) { 
   System.out.println("Valor inv�lido!");  
   } 
  } 
   
 } 
 
}