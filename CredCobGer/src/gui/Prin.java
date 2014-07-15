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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Prin extends JFrame {

	private JPanel contentPane;
	JFrame prin = this;
	
	JMenuBar menuBar = new JMenuBar();
	JMenu mnArchivo = new JMenu("[nombreUsuario]");
	JMenu mnGestin = new JMenu("Informes");	
	JMenu mnAdministracin = new JMenu("Administraci\u00F3n");
	
	JMenuItem mntmGestinDeCuenta = new JMenuItem("Gesti\u00F3n de Cuenta");	
	JMenuItem mntmCerrarSesin = new JMenuItem("Cerrar Sesi\u00F3n");
	
	JMenuItem mntmAbonosACrditos = new JMenuItem("Abonos a Cr\u00E9ditos");	
	JMenuItem mntmCrditosPorSucursal = new JMenuItem("Cr\u00E9ditos por Sucursal");	
	JMenu mnCandidatosARefinanciamiento = new JMenu("Candidatos a Refinanciamiento");	
	JMenuItem mntmBuenAsociado = new JMenuItem("Buen Asociado");	
	JMenuItem mntmProblemasEnMora = new JMenuItem("Problemas en Mora");	
	JMenuItem mntmCarteraAsegurable = new JMenuItem("Cartera Asegurable");	
	JMenuItem mntmRecordCrediticio = new JMenuItem("Record Crediticio");
	
	JMenu mnSeguimientoAlPlan = new JMenu("Seguimiento al Plan Empresarial");	
	JMenuItem mntmMetaMensual = new JMenuItem("Meta Mensual");
	JMenuItem mntmProyeccinAnual = new JMenuItem("Proyecci\u00F3n Anual");	
	JMenuItem mntmCrditosDirectivosY = new JMenuItem("Cr\u00E9ditos Directivos y Empleados");	
	JMenuItem mntmCrditosOtorgados = new JMenuItem("Cr\u00E9ditos Otorgados");	
	JMenuItem mntmPrstamosOtorgadosVs = new JMenuItem("Pr\u00E9stamos Otorgados vs. Mora");	
		
	JMenuItem mntmUsuarios = new JMenuItem("Usuarios");
	JMenuItem mntmRefrescarBaseDe = new JMenuItem("Refrescar Base de Datos");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					Prin frame = new Prin();
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
	public Prin() {
		
		setTitle("CredCobGer - Sistema de Informaci\u00F3n Gerencial");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 536, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		menuBar.setBounds(0, 0, 528, 21);
		contentPane.add(menuBar);
		
		
		menuBar.add(mnArchivo);
		mnArchivo.add(mntmGestinDeCuenta);
		mntmCerrarSesin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InicioSesion ini = new InicioSesion();
				ini.setLocationRelativeTo(null);
				ini.setVisible(true);
				prin.dispose();
			}
		});
		mnArchivo.add(mntmCerrarSesin);
		menuBar.add(mnGestin);
		mntmAbonosACrditos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AbonosCredito vent = new AbonosCredito();
				vent.setLocationRelativeTo(null);
				vent.setVisible(true);
			}
		});
		mnGestin.add(mntmAbonosACrditos);
		mntmCrditosPorSucursal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CreditosSucursal vent = new CreditosSucursal();
				vent.setLocationRelativeTo(null);
				vent.setVisible(true);
			}
		});
		mnGestin.add(mntmCrditosPorSucursal);
		
		mnGestin.add(mnCandidatosARefinanciamiento);
		mntmBuenAsociado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RefinBuenAsoc vent = new RefinBuenAsoc();
				vent.setLocationRelativeTo(null);
				vent.setVisible(true);
			}
		});
		mnCandidatosARefinanciamiento.add(mntmBuenAsociado);
		mntmProblemasEnMora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RefinMora vent = new RefinMora();
				vent.setLocationRelativeTo(null);
				vent.setVisible(true);
			}
		});
		mnCandidatosARefinanciamiento.add(mntmProblemasEnMora);
		mntmCarteraAsegurable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CarteraAsegurable vent = new CarteraAsegurable();
				vent.setLocationRelativeTo(null);
				vent.setVisible(true);
			}
		});
		mnGestin.add(mntmCarteraAsegurable);
		mntmRecordCrediticio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RecordCrediticio vent = new RecordCrediticio();
				vent.setLocationRelativeTo(null);
				vent.setVisible(true);
			}
		});
		mnGestin.add(mntmRecordCrediticio);
		mnGestin.add(mnSeguimientoAlPlan);
		mntmMetaMensual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SeguimientoAlPlanEmplesarialMensual vent = new SeguimientoAlPlanEmplesarialMensual();
				vent.setLocationRelativeTo(null);
				vent.setVisible(true);
			}
		});
		mnSeguimientoAlPlan.add(mntmMetaMensual);
		mntmProyeccinAnual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DetalleProyeccionAnual vent = new DetalleProyeccionAnual();
				vent.setLocationRelativeTo(null);
				vent.setVisible(true);
			}
		});
		mnSeguimientoAlPlan.add(mntmProyeccinAnual);
		mntmCrditosDirectivosY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PrestamosDirectivosEmpleados vent = new PrestamosDirectivosEmpleados();
				vent.setLocationRelativeTo(null);
				vent.setVisible(true);
			}
		});
		mnGestin.add(mntmCrditosDirectivosY);
		mnSeguimientoAlPlan.add(mntmProyeccinAnual);
		mntmCrditosOtorgados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CreditosOtorgados vent = new CreditosOtorgados();
				vent.setLocationRelativeTo(null);
				vent.setVisible(true);
			}
		});
		mnGestin.add(mntmCrditosOtorgados);
		mntmPrstamosOtorgadosVs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PrestamosOtorgadosVRMora vent = new PrestamosOtorgadosVRMora();
				vent.setLocationRelativeTo(null);
				vent.setVisible(true);
			}
		});
		mnGestin.add(mntmPrstamosOtorgadosVs);
		menuBar.add(mnAdministracin);
		mnAdministracin.add(mntmUsuarios);
		mnAdministracin.add(mntmRefrescarBaseDe);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(80, 32, 369, 311);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Prin.class.getResource("/recursos/aclogo_med_trans_369x387.png")));
		contentPane.add(lblNewLabel);
	}
}
