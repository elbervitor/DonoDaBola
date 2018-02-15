package Model;

public class Goleiro extends Usuario {
	private double idade;
	private double preco = 10;
	private double qtdPartidas = 0;

	public Goleiro (String nome, String email, String telefone, double idade) {
		super(nome, email, telefone);
		this.idade = idade;
	}

	public void avaliar (double nota) {
		super.avaliar(nota);
	}
	
	
	
	// Gets and Sets...
	public double getIdade() {
		return idade;
	}

	public void setIdade(double idade) {
		this.idade = idade;
	}

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
