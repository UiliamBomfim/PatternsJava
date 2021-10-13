package Factory;

public class App {

	public static void main(String[] args) {
		
		PoligonoFactory teste = new PoligonoFactory();
		
		teste.poligonos.put("Triangulo", new Triangulo());
		teste.poligonos.put("Quadrado", new Quadrado());
		teste.poligonos.put("Circulo", new Circulo());
		
		PoligonosIF poligono = PoligonoFactory.createPoligono("Circulo") ;
		System.out.println(poligono.descritor() ); 
	}

}
