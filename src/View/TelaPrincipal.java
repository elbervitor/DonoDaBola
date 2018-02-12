package View;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;

public class TelaPrincipal extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JDesktopPane desktop = new JDesktopPane();
	
	public TelaPrincipal() {
		setSize(700,600);
		setLocationRelativeTo(null);
		setTitle("Dono Da Bola");
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
		
		getContentPane().setLayout(null);
		getContentPane().add(new TelaCadastroUsuario());
		
		setVisible(true);
	}
}
