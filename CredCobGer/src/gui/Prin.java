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

public class Prin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					Prin frame = new Prin();
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
	public Prin() {
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
		
		JMenu mnArchivo = new JMenu("[nombreUsuario]");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmGestinDeCuenta = new JMenuItem("Gesti\u00F3n de Cuenta");
		mnArchivo.add(mntmGestinDeCuenta);
		
		JMenuItem mntmCerrarSesin = new JMenuItem("Cerrar Sesi\u00F3n");
		mnArchivo.add(mntmCerrarSesin);
		
		JMenu mnGestin = new JMenu("Informes");
		menuBar.add(mnGestin);
		
		JMenuItem mntmAbonosACrditos = new JMenuItem("Abonos a Cr\u00E9ditos");
		mnGestin.add(mntmAbonosACrditos);
		
		JMenuItem mntmCrditosPorSucursal = new JMenuItem("Cr\u00E9ditos por Sucursal");
		mnGestin.add(mntmCrditosPorSucursal);
		
		JMenu mnCandidatosARefinanciamiento = new JMenu("Candidatos a Refinanciamiento");
		mnGestin.add(mnCandidatosARefinanciamiento);
		
		JMenuItem mntmBuenAsociado = new JMenuItem("Buen Asociado");
		mnCandidatosARefinanciamiento.add(mntmBuenAsociado);
		
		JMenuItem mntmProblemasEnMora = new JMenuItem("Problemas en Mora");
		mnCandidatosARefinanciamiento.add(mntmProblemasEnMora);
		
		JMenuItem mntmCarteraAsegurable = new JMenuItem("Cartera Asegurable");
		mnGestin.add(mntmCarteraAsegurable);
		
		JMenuItem mntmRecordCrediticio = new JMenuItem("Record Crediticio");
		mnGestin.add(mntmRecordCrediticio);
		
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
		lblNewLabel.setIcon(new ImageIcon(Prin.class.getResource("/recursos/aclogo_med_trans_369x387.png")));
		contentPane.add(lblNewLabel);
	}
}
