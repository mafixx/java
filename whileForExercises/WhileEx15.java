package whileForExercises; 
 
import java.util.Scanner; 
 
public class WhileEx15 { 
 
 public static void main(String[] args) { 
  //A s�rie de Fibonacci � formada pela seq��ncia 1,1,2,3,5,8,13,21,34,55,... 
  //Fa�a um programa capaz de gerar a s�rie at� o en�simo termo. 
   
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