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

public class VerificarCredencial extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					VerificarCredencial frame = new VerificarCredencial();
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
	public VerificarCredencial() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VerificarCredencial.class.getResource("/recursos/key.png")));
		setResizable(false);
		setTitle("CredCobGer - Verificar Usuario");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 296, 132);
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
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnCancelar.setBounds(191, 66, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnAceptar.setBounds(92, 66, 89, 23);
		contentPane.add(btnAceptar);
		
		JLabel lblXxxxxxxxxxxxxxxxx = new JLabel("Xxxxxxxxxxxxxxxxx");
		lblXxxxxxxxxxxxxxxxx.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblXxxxxxxxxxxxxxxxx.setBounds(117, 14, 109, 14);
		contentPane.add(lblXxxxxxxxxxxxxxxxx);
	}
}
