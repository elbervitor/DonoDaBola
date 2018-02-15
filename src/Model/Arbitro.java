package Model;

public class Arbitro extends Usuario{
	private double preco = 15;
	private double qtdPartidas = 0;
	
	public Arbitro (String nome, String email, String telefone) {
		super(nome, email, telefone);
	}
	
	public void avaliar (double nota) {
		super.avaliar(nota);
	}

	
	
	// Gets and Sets...
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getQtdPartidas() {
		return qtdPartidas;
	}

	public void setQtdPartidas(double qtdPartidas) {
		this.qtdPartidas = qtdPartidas;
	}	
}
