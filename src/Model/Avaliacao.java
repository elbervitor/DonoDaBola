package Model;

public class Avaliacao {
	private double qtdAvaliacao = 0;						//Quantidade de avaliações Recebidas
	private double avaliacaoGeral = 0;						//Nota Final
	
	public void avaliar (double nota) {
		if (0 <= nota && nota <= 5) {						//A nota deve ser entre 0 e 5
			qtdAvaliacao++;		
			if (qtdAvaliacao == 0) avaliacaoGeral = nota;	//Caso seja a primeira avaliação
			else {
				avaliacaoGeral += nota/qtdAvaliacao;		//A nota final é a media aritmetica
			}												// de todas as notas recebidas
		}
	}
	

	// Gets and Sets...

	public double getQtdAvaliacao() {
		return qtdAvaliacao;
	}

	public void setQtdAvaliacao(double qtdAvaliacao) {
		this.qtdAvaliacao = qtdAvaliacao;
	}

	public double getAvaliacaoGeral() {
		return avaliacaoGeral;
	}

	public void setAvaliacaoGeral(double avaliacaoGeral) {
		this.avaliacaoGeral = avaliacaoGeral;
	}
	
}
