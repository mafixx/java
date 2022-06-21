package whileForExercises; 
 
import java.util.Scanner; 
 
public class WhileEx3 { 
 
 public static void main(String[] args) { 
  /* 1.Fa�a um programa que leia e valide as seguintes informa��es: 
    a. Nome: maior que 3 caracteres; 
    b. Idade: entre 0 e 150; 
    c. Sal�rio: maior que zero; 
    d. Sexo: 'f' ou 'm'; 
    e. Estado Civil: 's', 'c', 'v', 'd'; */ 
 
  Scanner scan = new Scanner (System.in); 
   
  String nome="", sexo="", estadoCivil=""; 
  int idade=0; 
  double salario=0; 
   
  while (nome.length() < 3) { 
   System.out.println("Digite o nome: "); 
   nome = scan.next(); 
   if (nome.length() < 3) { 
    System.out.println("Nome inv�lido!"); 
   }  
 
   } 
  System.out.println("Digite a idade: "); 
  idade = scan.nextInt(); 
  while (idade < 0 || idade > 150) { 
   System.out.println("Digite a idade novamente: "); 
   idade = scan.nextInt(); 
  } 
  boolean flag = true; 
  while (flag) { 
   System.out.println("Digite o sal�rio: "); 
   salario = scan.nextDouble(); 
   if (salario<0) { 
    System.out.println("Valor inv�lido!"); 
   } 
   else { 
    flag = false; 
   } 
  } 
  System.out.println("Digite o estado civil: "); 
  System.out.println("S- Solteiro\nC- Casado\nV- Vi�vo\nD- Divorciado"); 
  estadoCivil = scan.next(); 
   
  while(!estadoCivil.equals("s") || !estadoCivil.equals("c") || !estadoCivil.equals("v") || !estadoCivil.equals("d")) { 
   System.out.println("Valor inv�lido!"); 
   System.out.println("Digite novamente."); 
   System.out.println("S- Solteiro\nC- Casado\nV- Vi�vo\nD- Divorciado"); 
  } 
  } 
 
 }