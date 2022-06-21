import java.util.Scanner;

public class Prisma {

	Scanner scan =  new Scanner(System.in);
	public double altura;
	public double aresta;
	double valor;
    double resultado;
	
	
	
	

	public double getAltura() {
		return altura;
	}

	public void setAltura(double bolinha) {
		this.altura = bolinha;
	}

	public double getAresta() {
		return aresta;
	}

	public void setAresta(double aresta) {
		this.aresta = aresta;
	}

	public void calculaAreaBase() {
		System.out.println("--------------");
		System.out.println("Area da base: ");
		System.out.println("Digite o valor da Aresta: ");
		valor =  scan.nextDouble();
		setAresta(valor);
		resultado = (3*(Math.pow(getAresta(), 3))*(Math.sqrt(3))  ) / 2 ;
		System.out.println("Resultado: "+resultado);
		
	}
	
	public void calculaAreaFace() {
		
		System.out.println("--------------");
		System.out.println("Area da face: ");
	
		System.out.println("Digite a altura: ");
		setAltura(scan.nextDouble());
	
		System.out.println("Digite a aresta:");
		setAresta(scan.nextDouble());
	
		resultado = getAresta()*getAltura();
				
		System.out.println("Resultado: "+resultado);;
	}
	
}
