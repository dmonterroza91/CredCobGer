package gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import com.sun.xml.internal.ws.Closeable;

import PRESENTAR.Prin_Ger;

public class InicioSesion extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;
	private DialogoError error;
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
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnCancelar.setBounds(176, 67, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prin principal = new Prin();
				principal.setLocationRelativeTo(null);
				if(textField.getText().equals("admin")){
					principal.mntmAbonosACrditos.setVisible(false);
					principal.mntmCrditosPorSucursal.setVisible(false);
					principal.mnCandidatosARefinanciamiento.setVisible(false);
					principal.mntmBuenAsociado.setVisible(false);
					principal.mntmProblemasEnMora.setVisible(false);
					principal.mntmCarteraAsegurable.setVisible(false);
					principal.mntmRecordCrediticio.setVisible(false);
					principal.mnArchivo.setText("Admin");
				iS.dispose();
				principal.setVisible(true);}
				else if(textField.getText().equals("CredCob")){
					principal.mnSeguimientoAlPlan.setVisible(false);
					principal.mntmMetaMensual.setVisible(false);
					principal.mntmProyeccinAnual.setVisible(false);
					principal.mntmCrditosDirectivosY.setVisible(false);
					principal.mntmCrditosOtorgados.setVisible(false);
					principal.mntmPrstamosOtorgadosVs.setVisible(false);
					principal.mnAdministracin.setVisible(false);
					principal.mnArchivo.setText("CredCob");	
					iS.dispose();
					principal.setVisible(true);				
				}
				else{
					String err = "Usuario o Contraseña Incorrecto(s)";
					error = new DialogoError(err, iS);
					error.setLocationRelativeTo(null);
				}
			}
		});
		btnAceptar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnAceptar.setBounds(77, 67, 89, 23);
		contentPane.add(btnAceptar);
	}
}
