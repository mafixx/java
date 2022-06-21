package arrayVetor; 
 
import java.util.Scanner; 
 
public class Exemplo8 { 
 
 public static void main(String[] args) { 
  // TODO Auto-generated method stub 
 
  Scanner scan = new Scanner(System.in); 
 
  String nome[] = new String[3]; 
  double media[] = new double[3]; 
  int i=0; 
 
  while(i<nome.length) { 
   System.out.println("Digite o nome do aluno: "); 
   nome[i] = scan.next(); 
   System.out.println("Digite a média do(a): "+nome[i]); 
   media[i] = scan.nextDouble(); 
   i++; 
   System.out.println("--------------"); 
  } 
  i=0; 
  while(i<nome.length) { 
   System.out.println("Alunos(as) e suas médias: "+nome[i]+", "+media[i]); 
   i++; 
  } 
 
 } 
}