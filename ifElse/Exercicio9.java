package ifElse;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		/*Faça um Programa que pergunte em que turno você estuda. 
		Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. 
		Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" 
		ou "Valor Inválido!", conforme o caso.*/

		Scanner scan = new Scanner (System.in);

		String m;
		String v;
		String n;

		System.out.println("Digite o turno que você estuda: ");
		System.out.println("M-matutino V-vespertino N-noturno");
		String turno = scan.next();

		if (turno.equalsIgnoreCase("m")) {
			System.out.println("Bom dia!");
		}
		else if (turno.equalsIgnoreCase("v")) {
			System.out.println("Boa tarde!");
		}
		else if (turno.equalsIgnoreCase("n")) {
			System.out.println("Boa noite!");
		}
	}

}
