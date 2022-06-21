package ifElse;

import java.util.Scanner;

public class Exercicio8 {

 public static void main(String[] args) {
  //Faça um Programa que leia três números e mostre-os em ordem decrescente.

  Scanner scan = new Scanner (System.in);
  
  System.out.println("Digite o primeiro número: ");
  int n1 = scan.nextInt();
  System.out.println("Digite o segundo número: ");
  int n2 = scan.nextInt();
  System.out.println("Digite o terceiro número: ");
  int n3 = scan.nextInt();

  
//Possiveis combinações:
//x > y > z --------- x > z > y
//y > x > z --------- y > z > x
//z > x > y --------- z > y > x
  
  
  if ((n1>n2 && n1>n3) && (n2>n3)) {
   System.out.println("A ordem decrecente é : "+n1+n2+n3);
  }
  else if ((n1>n2 && n1>n3) && (n3>n2)) {
   System.out.println("A ordem decrecente é : "+n1+n3+n2);
  }
  else if ((n2>n1 && n2>n3) && (n1>n3)) {
   System.out.println("A ordem decrecente é : "+n2+n1+n3);
  }
  else if ((n2>n1 && n2>n3) && (n3>n1)) {
   System.out.println("A ordem decrecente é : "+n2+n3+n1);
  }
  else if ((n3>n1 && n3>n2) && (n1>n2)) {
   System.out.println("A ordem decrescente é: "+n3+n1+n2);
  }
  else if ((n3>n1 && n3>n2) && (n2>n1)) {
   System.out.println("A ordem decrescente é: "+n3+n2+n1);
  }
 }

}