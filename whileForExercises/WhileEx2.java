package whileForExercises; 
 
import java.util.Scanner; 
 
public class WhileEx2 { 
 
 public static void main(String[] args) { 
  /* Faça um programa que leia um nome de usuário, a sua senha  
   * e que não aceite a senha igual ao nome do usuário,  
   * mostrando uma mensagem de erro e voltando a pedir as informações. */ 
   
  Scanner scan = new Scanner (System.in); 
   
  String usuario, senha; 
   
  System.out.println("Digite o nome do usuário: "); 
  usuario = scan.next(); 
  System.out.println("Digite a senha: "); 
  senha = scan.next(); 
     
    while (usuario.equalsIgnoreCase(senha)) { 
     System.out.println("Usuário e senha iguais!"); 
      
     System.out.println("Digite o nome do usuário: "); 
     usuario = scan.next(); 
     System.out.println("Digite a senha: "); 
     senha = scan.next(); 
    } 
 } 
 
}