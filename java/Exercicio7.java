package java;

import java.util.Scanner;


public class Exercicio7 {

	public static void main(String[] args) {
		//Programe para calculo de juros simples de uma d�vida.

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o valor inicial do d�bito: ");
		double varInc = scan.nextDouble();
		System.out.println("Digite a quantidade de meses: ");
		double qtdMes = scan.nextDouble();
		System.out.println("Digite os juros mensais: ");
		double jurosMes = scan.nextDouble();
		
		double divida = varInc*(jurosMes/100)*qtdMes;
		System.out.println("O valor da d�vida � : "+(divida+varInc));
		
	}

}
