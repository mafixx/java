package whileForExercises; 
 
import java.util.Scanner; 
 
public class WhileEx2 { 
 
 public static void main(String[] args) { 
  /* Fa�a um programa que leia um nome de usu�rio, a sua senha  
   * e que n�o aceite a senha igual ao nome do usu�rio,  
   * mostrando uma mensagem de erro e voltando a pedir as informa��es. */ 
   
  Scanner scan = new Scanner (System.in); 
   
  String usuario, senha; 
   
  System.out.println("Digite o nome do usu�rio: "); 
  usuario = scan.next(); 
  System.out.println("Digite a senha: "); 
  senha = scan.next(); 
     
    while (usuario.equalsIgnoreCase(senha)) { 
     System.out.println("Usu�rio e senha iguais!"); 
      
     System.out.println("Digite o nome do usu�rio: "); 
     usuario = scan.next(); 
     System.out.println("Digite a senha: "); 
     senha = scan.next(); 
    } 
 } 
 
}