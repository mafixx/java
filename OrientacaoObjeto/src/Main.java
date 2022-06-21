import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =  new Scanner(System.in);
		
		Prisma forma = new Prisma();
		
		System.out.println("Bem vindo ao programa do prisma:");
	
		System.out.println("1 - Area da Base");	
		System.out.println("2 - Area da Face");
		int op = scan.nextInt();
		
		if(op==1) {
			forma.calculaAreaBase();
		}else if(op==2){
			forma.calculaAreaFace();
		}
		
		
		
		
		
		

	}

}
