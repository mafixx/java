
public class MainCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carro carro1 =  new Carro();
		Carro carro2 =  new Carro();
		
		
		carro1.setModelo("Ônix");
		carro1.setAno(2015);
		carro1.setMarca("Chevrolet");
		carro1.setCor("Branco");
		
		carro2.setModelo("Uno de Firma (Com escada em cima)");
		carro2.setAno(2012);
		carro2.setMarca("Fiat");
		carro2.setCor("Vermelho");
		
		System.out.println("Modelo: "+carro1.getModelo());
		System.out.println("Ano: "+carro1.getAno());
		System.out.println("Marca: "+carro1.getMarca());
		System.out.println("Cor: "+carro1.getCor());
		System.out.println("-------------------");
		System.out.println("Modelo: "+carro2.getModelo());
		System.out.println("Ano: "+carro2.getAno());
		System.out.println("Marca: "+carro2.getMarca());
		System.out.println("Cor: "+carro2.getCor());
		
		
		
	}

}
