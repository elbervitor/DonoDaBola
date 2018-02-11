package Main;

import javax.swing.JFrame;

import View.TelaPrincipal;

public class TesteScount {
	private static JFrame telaPrincipal;

	public static void main(String [] args) {
		setTelaPrincipal(new TelaPrincipal());
	}

	public static JFrame getTelaPrincipal() {
		return telaPrincipal;
	}

	public static void setTelaPrincipal(JFrame telaPrincipal) {
		TesteScount.telaPrincipal = telaPrincipal;
	}
}
