package Builder;

public class Figuras {
	
	private String corDeFrente = "preto";
	private String corDeFundo = "branco";
	private String tipoDeLinha = "continua";
	private String nomeDoCriador;
	
	public String getCorDeFrente() {
		return corDeFrente;
	}
	public void setCorDeFrente(String corDeFrente) {
		this.corDeFrente = corDeFrente;
	}
	public String getCorDeFundo() {
		return corDeFundo;
	}
	public void setCorDeFundo(String corDeFundo) {
		this.corDeFundo = corDeFundo;
	}
	public String getTipoDeLinha() {
		return tipoDeLinha;
	}
	public void setTipoDeLinha(String tipoDeLinha) {
		this.tipoDeLinha = tipoDeLinha;
	}
	public String getNomeDoCriador() {
		return nomeDoCriador;
	}
	public void setNomeDoCriador(String nomeDoCriador) {
		this.nomeDoCriador = nomeDoCriador;
	}
	
	
	@Override
	public String toString() {
		String s ="";
		
		s += "Cor de Frente: "+ this.getCorDeFrente()+"\n";
		s += "Cor de Fundo: "+ this.getCorDeFundo()+"\n";
		s += "Tipo de Linha: "+ this.getTipoDeLinha()+"\n";
		s += "Nome do Criador: "+ this.getNomeDoCriador();

		return s;
	}
	

}
