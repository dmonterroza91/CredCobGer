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

public class Prin_CC extends JFrame {

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
					Prin_CC frame = new Prin_CC();
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
	public Prin_CC() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Prin_CC.class.getResource("/recursos/account_balances.png")));
		
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
		
		JMenu mnArchivo = new JMenu("credicob");
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
		
		JMenu mnAdministracin = new JMenu("Administraci\u00F3n");
		menuBar.add(mnAdministracin);
		
		JMenuItem mntmRefrescarBaseDe = new JMenuItem("Refrescar Base de Datos");
		mnAdministracin.add(mntmRefrescarBaseDe);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(80, 32, 369, 311);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Prin_CC.class.getResource("/recursos/aclogo_med_trans_369x387.png")));
		contentPane.add(lblNewLabel);
	}
}
