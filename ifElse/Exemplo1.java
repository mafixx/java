package ifElse;

import java.util.Scanner;

//import javax.swing.JPasswordField;

public class Exemplo1 {

 public static void main(String[] args) {
  //Fazer tela de login

  Scanner scan = new Scanner (System.in);

  String usuario = "";
  String senha = "";
  String validaUsuario = "";
  String validaSenha = "";
  int op = 0;
  System.out.println("Bem vindo ao sistema!");
  System.out.println("Deseja criar sua conta?");
  System.out.println("1- Sim 2- N�o");
  op = scan.nextInt();

  if(op==1) {
   System.out.println("---------****---------");
   System.out.println("Bem vindo ao cadastro!");
   System.out.println("Crie o seu usu�rio: ");
   usuario = scan.next();
   System.out.println("Crie a sua senha: ");
   senha = scan.next();                                       //JPasswordField JPasswordField1 = new javax.swing.JPasswordField();
   System.out.println("Cadastro efetuado com sucesso!!"); 
  }
  System.out.println("Entre com seus dados: ");
  System.out.println("Usuario: ");
  validaUsuario = scan.next();
  System.out.println("Senha: ");
  validaSenha = scan.next();

  if(validaUsuario.equalsIgnoreCase(usuario) && validaSenha.equals(senha)) {  //se fosse um ou outro verdadeiro se utilizaria o || ao inv�s do &&
   System.out.println("-***************-");
   System.out.println("Bem vindo"+usuario);
   System.out.println("*---------------*");
  }
   else if (!(validaUsuario.equalsIgnoreCase(usuario)) && (validaSenha.equals(senha))) { //O parenteses serve para negar a senten�a
    System.out.println("Usu�rio incorreto!"); //Executa somente se a informa��o do usu�rio for incorreta
   }
   else if ((validaUsuario.equalsIgnoreCase(usuario)) && !(validaSenha.equals(senha))) { //O parenteses serve para negar a senten�a
    System.out.println("Senha incorreta!"); //Executa somente se a informa��o da senha for incorreta
   }
   else {
    System.out.println("Login inv�lido!");
   }
  }

 }