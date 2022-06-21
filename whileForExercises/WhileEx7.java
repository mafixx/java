package whileForExercises; 
 
import java.util.Scanner; 
 
public class WhileEx7 { 
 
 public static void main(String[] args) { 
  //Faça um programa que leia 5 números e informe o maior número. 
 
  Scanner scan = new Scanner (System.in); 
 
  int maiorNumero = Integer.MIN_VALUE; 
  int menorNumero = Integer.MAX_VALUE; 
  int n1; 
  int i=0; 
  System.out.println("Maior número: "+maiorNumero); 
  System.out.println("Menor número: "+menorNumero); 
   
  System.out.println("Digite um número: "); 
  n1 = scan.nextInt(); 
  maiorNumero = n1; 
  menorNumero = n1; 
   
  while(i<5) { 
   i++; 
   System.out.println("Digite um número: "); 
   n1 = scan.nextInt(); 
   if(n1>maiorNumero) { 
    maiorNumero = n1; 
   } 
   else if(n1<menorNumero) { 
    menorNumero = n1; 
   } 
   System.out.println("----------"); 
   System.out.println("Maior número: "+maiorNumero); 
   System.out.println("Menor número: "+menorNumero); 
  } 
 
 } 
 
}