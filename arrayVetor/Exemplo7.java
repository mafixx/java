package arrayVetor; 
 
import java.util.Scanner; 
 
public class Exemplo7 { 
 
 public static void main(String[] args) { 
  // TODO Auto-generated method stub 
 
  Scanner scan = new Scanner(System.in); 
   
  int op; 
  String nome[] = {"Joao","Pedro","Paula","Maria"}; 
   
  System.out.println("Escolha um aluno:"); 
  System.out.println("1-Aluno 1:"); 
  System.out.println("2-Aluno 2:"); 
  System.out.println("3-Aluno 3:"); 
  System.out.println("4-Aluno 4:"); 
  op = scan.nextInt(); 
   
  System.out.println("Nome do aluno: "+(nome[op-1])); 
 } 
 
}