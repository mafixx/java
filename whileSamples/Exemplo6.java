package whileSamples;

import java.util.Scanner;

public class Exemplo6 {

	public static void main(String[] args) {
		//Exemplo 6

		Scanner scan = new Scanner (System.in);

		System.out.println("Digite quantas notas deseja cadastrar: ");
		int qtd = scan.nextInt();
		int i = 0;
		double media = 0;
		double nota = 0;

		while (i<qtd) {
			i++;
			System.out.println("Nota "+i+":");
			nota = scan.nextDouble();
			media = media+nota;
			System.out.println("Valor da variável média: "+media);
		}
		System.out.println("Média final = "+(media/qtd));
		media = media+nota;
		
	}

}

