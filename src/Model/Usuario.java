package Model;

public abstract class Usuario {

	private String nome;
	private String email;
	private String telefone;
	private Avaliacao notaGeral;
	
	public Usuario(String nome, String email, String telefone) {
		setNome(nome);
		setEmail(email);
		setTelefone(telefone);
	}
	
	public void avaliar(double nota) {
		notaGeral.avaliar(nota);
	}
	
	// METODOS ACESSORES

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
