package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.UIManager;

public class InicioSesion extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					InicioSesion frame = new InicioSesion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InicioSesion() {
		setResizable(false);
		setTitle("CredCobGer - Iniciar Sesi\u00F3n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 281, 205);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(123, 107, 86, 20);
		contentPane.add(passwordField);
		
		JLabel label = new JLabel("Contrase\u00F1a:");
		label.setBounds(53, 110, 60, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Usuario:");
		label_1.setBounds(67, 85, 46, 14);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(123, 82, 86, 20);
		contentPane.add(textField);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(174, 138, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(75, 138, 89, 23);
		contentPane.add(btnAceptar);
	}
}
