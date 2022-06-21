package whileSamples;

import java.util.Scanner;

public class Exemplo7 {

	public static void main(String[] args) {
		//Exemplo 7

		Scanner scan = new Scanner (System.in);
		double n1=0,n2=0,n3=0,n4=0;
		double media;
		boolean flag = true;

		while(flag == true) {

			System.out.println("Digite a nota 1: ");
			n1 = scan.nextDouble();

			if (n1<0 || n1>10) {
				System.out.println("Nota inválida!");
				flag = true;
			}
			else {
				System.out.println("Nota válida.");
				flag = false;
			}

		}

	}

}