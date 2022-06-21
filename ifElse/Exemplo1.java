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
  System.out.println("1- Sim 2- Não");
  op = scan.nextInt();

  if(op==1) {
   System.out.println("---------****---------");
   System.out.println("Bem vindo ao cadastro!");
   System.out.println("Crie o seu usuário: ");
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

  if(validaUsuario.equalsIgnoreCase(usuario) && validaSenha.equals(senha)) {  //se fosse um ou outro verdadeiro se utilizaria o || ao invés do &&
   System.out.println("-***************-");
   System.out.println("Bem vindo"+usuario);
   System.out.println("*---------------*");
  }
   else if (!(validaUsuario.equalsIgnoreCase(usuario)) && (validaSenha.equals(senha))) { //O parenteses serve para negar a sentença
    System.out.println("Usuário incorreto!"); //Executa somente se a informação do usuário for incorreta
   }
   else if ((validaUsuario.equalsIgnoreCase(usuario)) && !(validaSenha.equals(senha))) { //O parenteses serve para negar a sentença
    System.out.println("Senha incorreta!"); //Executa somente se a informação da senha for incorreta
   }
   else {
    System.out.println("Login inválido!");
   }
  }

 }