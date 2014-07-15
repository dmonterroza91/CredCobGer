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

public class OpcionesMora extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					OpcionesMora frame = new OpcionesMora();
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
	public OpcionesMora() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(OpcionesMora.class.getResource("/recursos/toolbox.png")));
		setResizable(false);
		setTitle("D\u00EDas Mora");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 225, 164);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCuentasCorrientes = new JLabel("Cuentas Corrientes");
		lblCuentasCorrientes.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblCuentasCorrientes.setBounds(10, 42, 107, 14);
		contentPane.add(lblCuentasCorrientes);
		
		JLabel lblLneasDeCrdito = new JLabel("L\u00EDneas de Cr\u00E9dito");
		lblLneasDeCrdito.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblLneasDeCrdito.setBounds(10, 17, 107, 14);
		contentPane.add(lblLneasDeCrdito);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnCancelar.setBounds(124, 98, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnAceptar.setBounds(10, 98, 89, 23);
		contentPane.add(btnAceptar);
		
		JLabel lblCuentasAportaciones = new JLabel("Cuentas Aportaciones");
		lblCuentasAportaciones.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblCuentasAportaciones.setBounds(10, 67, 107, 14);
		contentPane.add(lblCuentasAportaciones);
		
		textField = new JTextField();
		textField.setBounds(127, 14, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(127, 39, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(127, 64, 86, 20);
		contentPane.add(textField_2);
	}
}
