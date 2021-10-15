package Builder;

public class TrianguloBuilder extends FigurasBuilder {

	@Override
	public void buildCorDeFrente() {
		poligono.setCorDeFrente("verde");
		
	}

	@Override
	public void buildCorDeFundo() {
		// opcional
		
	}

	@Override
	public void buildTipoDeLinha() {
		poligono.setTipoDeLinha("continua");
		
	}

	@Override
	public void buildNomeDoCriador() {
		poligono.setNomeDoCriador("TrianguloBuilder");
		
	}
	
	@Override
	public String toString() {
		String s ="";
		
		s += "valor"+ poligono.getCorDeFrente();

		return s;
	}

}
