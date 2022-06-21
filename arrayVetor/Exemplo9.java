package arrayVetor; 
 
import java.util.Iterator; 
import java.util.Scanner; 
 
public class Exemplo9 { 
 
 public static void main(String[] args) { 
  //Peça ao usuário o nome de 6 produtos diferentes 
 
  Scanner scan = new Scanner(System.in); 
 
  String nome[] = new String[6]; 
  int i=0; 
 
  for (int j = 0; j < nome.length; j++) { 
   System.out.println("Digite o nome de 6 produtos: "); 
   nome[j] = scan.next(); 
 
  } 
  i=0; 
  for (int j = 0; j < nome.length; j++) { 
   System.out.println("Os 6 produtos escolhidos foram: "+nome[j]); 
 
  } 
 
 } 
 
 
}