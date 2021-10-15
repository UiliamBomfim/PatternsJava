package Builder;

public abstract class FigurasBuilder {
	
	protected Figuras poligono;
	
	public FigurasBuilder() {
		
		poligono = new Figuras();
	}
	
	public Figuras getFiguras() {
		return poligono;
	}
	
	public abstract void buildCorDeFrente();
	public abstract void buildCorDeFundo();
	public abstract void buildTipoDeLinha();
	public abstract void buildNomeDoCriador();
	


}
