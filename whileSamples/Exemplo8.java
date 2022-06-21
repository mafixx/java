package whileSamples;

import java.util.Scanner;

public class Exemplo8 {

	public static void main(String[] args) {
		//Exemplo 8

		Scanner scan = new Scanner (System.in);

		String usuarioSys = "proway";
		String senhaSys = "123456";

		String usuario = "";
		String senha = "";

		while (!usuario.equals(usuarioSys)) {
			System.out.println("Digite o usuário: ");
			usuario = scan.next();
		}
		while (!senha.equals(senhaSys)) {
			System.out.println("Digite a senha: ");
			senha = scan.next();
		}


	}
}