package Builder;

public class FigurasDirector {
	
	private FigurasBuilder builder;
	
	
	public FigurasDirector(FigurasBuilder builder) {
		this.builder = builder;
	}
	
	public void constructCombo() {
		
		builder.buildCorDeFrente();
		builder.buildCorDeFundo();
		builder.buildTipoDeLinha();
		builder.buildNomeDoCriador();
	}
	
	public Figuras getCombo() {
		return builder.getFiguras();
	}
	
	


}
