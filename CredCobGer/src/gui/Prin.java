package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

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
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmGestinDeCuenta = new JMenuItem("Gesti\u00F3n de Cuenta");
		mnArchivo.add(mntmGestinDeCuenta);
		
		JMenuItem mntmCerrarSesin = new JMenuItem("Cerrar Sesi\u00F3n");
		mnArchivo.add(mntmCerrarSesin);
		
		JMenu mnGestin = new JMenu("Informes");
		menuBar.add(mnGestin);
		
		JMenuItem mntmRecordCrediticio = new JMenuItem("Record Crediticio");
		mnGestin.add(mntmRecordCrediticio);
		
		JMenuItem mntmCarteraAsegurable = new JMenuItem("Cartera Asegurable");
		mnGestin.add(mntmCarteraAsegurable);
		
		JMenuItem mntmCrditosPorSucursal = new JMenuItem("Cr\u00E9ditos por Sucursal");
		mnGestin.add(mntmCrditosPorSucursal);
		
		JMenuItem mntmAbonosACrditos = new JMenuItem("Abonos a Cr\u00E9ditos");
		mnGestin.add(mntmAbonosACrditos);
		
		JMenuItem mntmCandidatosARefinanciamiento = new JMenuItem("Candidatos a Refinanciamiento");
		mnGestin.add(mntmCandidatosARefinanciamiento);
		
		JMenuItem menuItem_5 = new JMenuItem("New menu item");
		mnGestin.add(menuItem_5);
		
		JMenuItem menuItem_6 = new JMenuItem("New menu item");
		mnGestin.add(menuItem_6);
		
		JMenuItem menuItem_7 = new JMenuItem("New menu item");
		mnGestin.add(menuItem_7);
	}
}
