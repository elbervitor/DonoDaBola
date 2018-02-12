package View;

import java.awt.LayoutManager;

import javax.management.modelmbean.DescriptorSupport;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;

public class TelaCadastroUsuario extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public TelaCadastroUsuario() {
		setTitle("Novo usuário");
		setBounds(0,0,400,300);
		setClosable(true);
			
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel jlNome = new JLabel("Nome:");
		jlNome.setBounds(10,10,100,20);
		
		JLabel jlTelefone = new JLabel("Telefone:");
		jlTelefone.setBounds(10,40,100,20);
		
		JLabel jlEmail = new JLabel("E-mail:");
		jlEmail.setBounds(10,70,100,20);
		
		JTextField tfNome = new JTextField();
		tfNome.setBounds(65,10,200,20);
		
		JTextField tfTelefone =  new JTextField();
		tfTelefone.setBounds(65,40,200,20);
		
		JTextField tfEmail = new JTextField();
		tfEmail.setBounds(65,70,200,20);
		
		
		getContentPane().setLayout(null);
		getContentPane().add(jlNome);
		getContentPane().add(jlTelefone);
		getContentPane().add(jlEmail);
		getContentPane().add(tfNome);
		getContentPane().add(tfTelefone);
		getContentPane().add(tfEmail);
		
		setVisible(true);
	}
	
}
