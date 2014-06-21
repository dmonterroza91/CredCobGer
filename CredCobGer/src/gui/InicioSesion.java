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
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InicioSesion extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;
	JFrame iS = this;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					InicioSesion frame = new InicioSesion();
					frame.setLocationRelativeTo(null);
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
		setIconImage(Toolkit.getDefaultToolkit().getImage(InicioSesion.class.getResource("/recursos/key.png")));
		setResizable(false);
		setTitle("CredCobGer - Iniciar Sesi\u00F3n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 281, 132);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		passwordField.setBounds(117, 36, 109, 20);
		contentPane.add(passwordField);
		
		JLabel label = new JLabel("Contrase\u00F1a:");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label.setBounds(47, 39, 60, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Usuario:");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label_1.setBounds(61, 14, 46, 14);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField.setColumns(10);
		textField.setBounds(117, 11, 109, 20);
		contentPane.add(textField);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnCancelar.setBounds(176, 67, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iS.dispose();
				Prin principal = new Prin();
				principal.setLocationRelativeTo(null);
				principal.setVisible(true);
			}
		});
		btnAceptar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnAceptar.setBounds(77, 67, 89, 23);
		contentPane.add(btnAceptar);
	}
}
