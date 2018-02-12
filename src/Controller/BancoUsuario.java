package Controller;

import java.util.ArrayList;
import Model.Usuario;

public class BancoUsuario {

	 public static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	 
	 public static void adicionarUsuario(Usuario novo) {
		 usuarios.add(novo);
	 }
	 
	 public static void listarUsuarios() {
		 for(Usuario u: usuarios) {
			 System.out.println(u.getNome());
		 }
	 }
}
