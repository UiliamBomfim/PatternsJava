package Builder;

public class Client {
	
	public static void order(String name, FigurasBuilder builder) {
		System.out.println("ordenando um"+ name);
		FigurasDirector diretor = new FigurasDirector(builder);
		diretor.constructCombo();
		System.out.println(diretor.getCombo());
	}
	
	public static void main(String[] args) {
		order("Triangulo", new TrianguloBuilder());
	}

}
