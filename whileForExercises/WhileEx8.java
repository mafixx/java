package whileForExercises; 
 
import java.util.Scanner; 
 
public class WhileEx8 { 
 
 public static void main(String[] args) { 
  //Faça um programa que leia 5 números e informe a soma e a média dos números 
 
  Scanner scan = new Scanner(System.in); 
 
  int numero[] = new int[5]; 
  double soma=0; 
  double media; 
  int i=0; 
 
  while(i<numero.length) { 
   System.out.println("Digite um número: "); 
   numero[i] = scan.nextInt(); 
   soma += numero[i]; 
   i++; 
   System.out.println("--------------"); 
   System.out.println("Soma: "+soma); 
  } 
  media = soma/numero.length; 
  System.out.println("Media final: "+media); 
 } 
 
}