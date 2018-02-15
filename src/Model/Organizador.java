package Model;

public class Organizador extends Usuario{
	private double qtdContratos = 0;
	private double porcentoRecomenda = 0;
	//@override
	private AvaliacaoOrganizador notaGeral;
	
	public Organizador (String nome, String email, String telefone) {
		super(nome, email, telefone);
	}
	
	//@override
	public void avaliar (boolean nota) {
		notaGeral.avaliar(nota);
	}

	// Gets and Sets...
	public double getQtdContratos() {
		return qtdContratos;
	}

	public void setQtdContratos(double qtdContratos) {
		this.qtdContratos = qtdContratos;
	}

	public double getPorcentoRecomenda() {
		return porcentoRecomenda;
	}

	public void setPorcentoRecomenda(double porcentoRecomenda) {
		this.porcentoRecomenda = porcentoRecomenda;
	}

	public AvaliacaoOrganizador getNotaGeral() {
		return notaGeral;
	}

	public void setNotaGeral(AvaliacaoOrganizador notaGeral) {
		this.notaGeral = notaGeral;
	}
	
	
}
