package whileForExercises; 
 
import java.util.Scanner; 
 
public class WhileEx8 { 
 
 public static void main(String[] args) { 
  //Fa�a um programa que leia 5 n�meros e informe a soma e a m�dia dos n�meros 
 
  Scanner scan = new Scanner(System.in); 
 
  int numero[] = new int[5]; 
  double soma=0; 
  double media; 
  int i=0; 
 
  while(i<numero.length) { 
   System.out.println("Digite um n�mero: "); 
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