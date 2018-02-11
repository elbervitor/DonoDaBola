package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TelaPrincipal extends JFrame implements ItemListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public TelaPrincipal() {
		
		setTitle("Nome do programa!");
		setBounds(0,0,1000,700);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setJMenuBar(menuPrincipal());
		
		JButton bt = new JButton();
		bt.setBounds(50,50,10,50);
		bt.setText("teste");
		
		getContentPane().add(bt);
			
		setVisible(true);
	}
	
	private JMenuBar menuPrincipal() {
		
		JMenuBar menu = new JMenuBar();
		
		JMenuItem cadastrar = new JMenuItem("Cadastrar");
		JMenu usuario = new JMenu("Usuário");
		usuario.add(cadastrar);
		usuario.addItemListener(this);
		
		menu.add(usuario);
		return menu;
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		System.out.println("Funcionou!!!");
		
	}

}
