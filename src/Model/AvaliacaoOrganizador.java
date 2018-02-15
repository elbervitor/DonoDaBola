package Model;

public class AvaliacaoOrganizador {
	private double qtdAvaliacao = 0;						//Quantidade de avaliações Redebidas
	private double qtdPositivas=0;
	private double avaliacaoGeral = 0;						//Nota Final

	public void avaliar (boolean avaliacao) {
		if (avaliacao)qtdPositivas++;	
		qtdAvaliacao++;
		avaliacaoGeral = (qtdAvaliacao/100)*qtdPositivas;
		
	}

	// Gets and Sets...
	public double getQtdAvaliacao() {
		return qtdAvaliacao;
	}

	public void setQtdAvaliacao(double qtdAvaliacao) {
		this.qtdAvaliacao = qtdAvaliacao;
	}

	public double getQtdPositivas() {
		return qtdPositivas;
	}

	public void setQtdPositivas(double qtdPositivas) {
		this.qtdPositivas = qtdPositivas;
	}

	public double getAvaliacaoGeral() {
		return avaliacaoGeral;
	}

	public void setAvaliacaoGeral(double avaliacaoGeral) {
		this.avaliacaoGeral = avaliacaoGeral;
	}

	
	
}
