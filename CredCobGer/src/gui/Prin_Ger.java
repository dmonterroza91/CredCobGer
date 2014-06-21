package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class Prin_Ger extends JFrame {

	private JPanel contentPane;
	JFrame prin = this;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					Prin_Ger frame = new Prin_Ger();
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
	public Prin_Ger() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Prin_Ger.class.getResource("/recursos/account_balances.png")));
		
		setTitle("CredCobGer - Sistema de Informaci\u00F3n Gerencial");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 536, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 528, 21);
		contentPane.add(menuBar);
		
		JMenu mnArchivo = new JMenu("gergener");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmGestinDeCuenta = new JMenuItem("Gesti\u00F3n de Cuenta");
		mnArchivo.add(mntmGestinDeCuenta);
		
		JMenuItem mntmCerrarSesin = new JMenuItem("Cerrar Sesi\u00F3n");
		mnArchivo.add(mntmCerrarSesin);
		
		JMenu mnGestin = new JMenu("Informes");
		menuBar.add(mnGestin);
		
		JMenu mnSeguimientoAlPlan = new JMenu("Seguimiento al Plan Empresarial");
		mnGestin.add(mnSeguimientoAlPlan);
		
		JMenuItem mntmMetaMensual = new JMenuItem("Meta Mensual");
		mnSeguimientoAlPlan.add(mntmMetaMensual);
		
		JMenuItem mntmProyeccinAnual = new JMenuItem("Proyecci\u00F3n Anual");
		mnSeguimientoAlPlan.add(mntmProyeccinAnual);
		
		JMenuItem mntmCrditosDirectivosY = new JMenuItem("Cr\u00E9ditos Directivos y Empleados");
		mnGestin.add(mntmCrditosDirectivosY);
		
		JMenuItem mntmCrditosOtorgados = new JMenuItem("Cr\u00E9ditos Otorgados");
		mnGestin.add(mntmCrditosOtorgados);
		
		JMenuItem mntmPrstamosOtorgadosVs = new JMenuItem("Pr\u00E9stamos Otorgados vs. Mora");
		mnGestin.add(mntmPrstamosOtorgadosVs);
		
		JMenu mnAdministracin = new JMenu("Administraci\u00F3n");
		menuBar.add(mnAdministracin);
		
		JMenuItem mntmUsuarios = new JMenuItem("Usuarios");
		mnAdministracin.add(mntmUsuarios);
		
		JMenuItem mntmRefrescarBaseDe = new JMenuItem("Refrescar Base de Datos");
		mnAdministracin.add(mntmRefrescarBaseDe);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(80, 32, 369, 311);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Prin_Ger.class.getResource("/recursos/aclogo_med_trans_369x387.png")));
		contentPane.add(lblNewLabel);
	}
}
