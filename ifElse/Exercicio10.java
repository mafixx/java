package ifElse;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
/* As Organiza��es Tabajara resolveram dar um aumento de sal�rio aos seus colaboradores e 
    lhe contraram para desenvolver o programa que calcular� os reajustes.
     Fa�a um programa que recebe o sal�rio de um colaborador e o reajuste segundo o seguinte crit�rio, baseado no sal�rio atual:
      sal�rios at� R$ 280,00 (incluindo) : aumento de 20%
       sal�rios entre R$ 280,00 e R$ 700,00 : aumento de 15%
        sal�rios entre R$ 700,00 e R$ 1500,00 : aumento de 10%
         sal�rios de R$ 1500,00 em diante : aumento de 5% Ap�s o aumento ser realizado, informe na tela:
          o sal�rio antes do reajuste;
           o percentual de aumento aplicado;
            o valor do aumento;
             o novo sal�rio, ap�s o aumento. */

		Scanner scan = new Scanner (System.in);
		
		double novoSal = 0;
		
		System.out.println("Digite o seu sal�rio: ");
		double salario = scan.nextDouble();
		
		System.out.println("Digite o aumento do sal�rio: ");
		double aumento = scan.nextDouble();
		
		if (+salario<=280) {
			System.out.println("Seu sal�rio de "+salario+" teve aumento de 20%, totalizando: "+(novoSal=salario+(salario*aumento*0.20)));
		}
		else if ((+salario>=280) && (+salario<=700)) {
			System.out.println("Seu sal�rio de "+salario+" teve aumento de 15%, totalizando: "+(novoSal=salario+(aumento*0.15)));
		}
		else if ((+salario>700) && (+salario<=1500)) {	
			System.out.println("Seu sal�rio de "+salario+" teve aumento de 10%, totalizando: "+(novoSal=salario+(aumento*0.10)));
		}
		else if (+salario>1500) {
			System.out.println("Seu sal�rio de "+salario+" teve um aumento de 5%, totalizando: "+(novoSal=salario+(aumento*0.05)));
		}
		else {
			System.out.println("O valor inserido est� em formato inv�lido.");
		}
	}
}
