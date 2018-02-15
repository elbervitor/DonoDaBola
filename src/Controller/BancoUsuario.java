package Controller;
import Model.*;

import java.util.ArrayList;


public class BancoUsuario {
	private ArrayList<Usuario> clcUsuario;

	public BancoUsuario () {
		clcUsuario = new ArrayList<Usuario>();
	}
	
	// Criacao de usuarios
	public Goleiro criarGoleiro (String nome, String email, String telefone, double idade) {
		Goleiro novo = new Goleiro(nome, email, telefone, idade);
		clcUsuario.add(novo);
		return novo;
	}
	
	public Arbitro criarArbitro (String nome, String email, String telefone) {
		Arbitro novo = new Arbitro(nome, email, telefone);
		clcUsuario.add(novo);
		return novo;
	}
	
	public Organizador criarOrganizador (String nome, String email, String telefone) {
		Organizador novo = new Organizador(nome, email, telefone);
		clcUsuario.add(novo);
		return novo;
	}
	
	
	//Pesquisa de Usuarios por Classe (Arbitro, Goleiro e )
	public ArrayList<Usuario> searchGoleiro () {
		//ArrayList<Goleiro> clcGoleiro = new ArrayList<Goleiro>();
		ArrayList<Usuario> clcGoleiro = new ArrayList<Usuario>();
		
		for (int i=0; i<clcUsuario.size(); i++) {
			if (clcUsuario.get(i) instanceof Goleiro) {
				Usuario novo = clcUsuario.get(i);
				clcGoleiro.add(novo);
			}
		}
		return clcGoleiro;
	}
	
	public ArrayList<Usuario> searchArbitro () {
		//ArrayList<Goleiro> clcGoleiro = new ArrayList<Goleiro>();
		ArrayList<Usuario> clcArbitro = new ArrayList<Usuario>();
		
		for (int i=0; i<clcUsuario.size(); i++) {
			if (clcUsuario.get(i) instanceof Arbitro) {
				Usuario novo = clcUsuario.get(i);
				clcArbitro.add(novo);
			}
		}
		return clcArbitro;
	}
	
	public ArrayList<Usuario> searchOrganizador () {
		//ArrayList<Goleiro> clcGoleiro = new ArrayList<Goleiro>();
		ArrayList<Usuario> clcOrganizador = new ArrayList<Usuario>();
		
		for (int i=0; i<clcUsuario.size(); i++) {
			if (clcUsuario.get(i) instanceof Organizador) {
				Usuario novo = clcUsuario.get(i);
				clcOrganizador.add(novo);
			}
		}
		return clcOrganizador;
	}
	
	//Pesquisa por nome
	public Goleiro searchGoleiro (String nome) {
		Goleiro novo = new Goleiro("vazio", "vazio","vazio", 0);
		for (int i=0; i<clcUsuario.size(); i++) {
			if (clcUsuario.get(i).getNome() == nome) {
				if(clcUsuario.get(i) instanceof Goleiro) novo = (Goleiro) clcUsuario.get(i);
			}
		}return novo; 
	}
	
	public Arbitro searchArbitro (String nome) {
		Arbitro novo = new Arbitro("vazio", "vazio","vazio");
		for (int i=0; i<clcUsuario.size(); i++) {
			if (clcUsuario.get(i).getNome() == nome) {
				if(clcUsuario.get(i) instanceof Arbitro) novo = (Arbitro) clcUsuario.get(i);
			}
		}return novo; 
	}
	
	public Organizador searchOrganizador (String nome) {
		Organizador novo = new Organizador("vazio", "vazio","vazio");
		for (int i=0; i<clcUsuario.size(); i++) {
			if (clcUsuario.get(i).getNome() == nome) {
				if(clcUsuario.get(i) instanceof Organizador) novo = (Organizador) clcUsuario.get(i);
			}
		}return novo; 
	}
}
