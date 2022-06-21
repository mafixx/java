package whileForExercises; 
 
import java.util.Scanner; 
 
public class WhileEx15 { 
 
 public static void main(String[] args) { 
  //A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,... 
  //Faça um programa capaz de gerar a série até o enésimo termo. 
   
  Scanner scan = new Scanner (System.in); 
   
  int num1 = 1, num2 = 0; 
   
  System.out.println(num1); 
  System.out.println(num2); 
  for (int i = 0; i < 8; i++) { 
   num1 = num1 + num2; 
   num2 = num1 - num2; 
    
   System.out.println(num1); 
    
  } 
   
 } 
 
}