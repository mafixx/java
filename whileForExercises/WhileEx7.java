package whileForExercises; 
 
import java.util.Scanner; 
 
public class WhileEx7 { 
 
 public static void main(String[] args) { 
  //Fa�a um programa que leia 5 n�meros e informe o maior n�mero. 
 
  Scanner scan = new Scanner (System.in); 
 
  int maiorNumero = Integer.MIN_VALUE; 
  int menorNumero = Integer.MAX_VALUE; 
  int n1; 
  int i=0; 
  System.out.println("Maior n�mero: "+maiorNumero); 
  System.out.println("Menor n�mero: "+menorNumero); 
   
  System.out.println("Digite um n�mero: "); 
  n1 = scan.nextInt(); 
  maiorNumero = n1; 
  menorNumero = n1; 
   
  while(i<5) { 
   i++; 
   System.out.println("Digite um n�mero: "); 
   n1 = scan.nextInt(); 
   if(n1>maiorNumero) { 
    maiorNumero = n1; 
   } 
   else if(n1<menorNumero) { 
    menorNumero = n1; 
   } 
   System.out.println("----------"); 
   System.out.println("Maior n�mero: "+maiorNumero); 
   System.out.println("Menor n�mero: "+menorNumero); 
  } 
 
 } 
 
}