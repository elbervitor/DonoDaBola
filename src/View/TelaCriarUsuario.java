package View;


import java.awt.TextField;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;

public class TelaCriarUsuario extends JInternalFrame{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	TextField tfNome = new TextField();
	TextField tfEmail = new TextField();
	TextField tfTelefone = new TextField();
	
	JLabel jlNome = new  JLabel();
	JLabel jlEmail = new  JLabel();
	JLabel jlTelefone = new  JLabel();
	
	public TelaCriarUsuario() {
		
		this.setTitle("Cadastro de Perfil");
		this.setBounds(0,0,300,300);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		jlNome.setText("Nome");
		jlNome.setBounds(10,10,50,20);
		tfNome.setBounds(65, 10, 200, 20);
		
		jlEmail.setText("E-mail");
		jlEmail.setBounds(10,30,50,20);
		tfEmail.setBounds(65,30,200,20);
		
		jlTelefone.setText("Telefone");
		jlTelefone.setBounds(10,50,50,20);
		tfTelefone.setBounds(65,50,200,20);
		
		this.getContentPane().setLayout(null);
		
		this.getContentPane().add(jlNome);
		this.getContentPane().add(tfNome);

		
		this.getContentPane().add(jlEmail);
		this.getContentPane().add(tfEmail);

		this.getContentPane().add(jlTelefone);
		this.getContentPane().add(tfTelefone);

		this.setVisible(true);
		
	}

}
