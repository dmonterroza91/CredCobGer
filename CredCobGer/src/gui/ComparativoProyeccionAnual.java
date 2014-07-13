package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

public class ComparativoProyeccionAnual extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComparativoProyeccionAnual frame = new ComparativoProyeccionAnual();
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
	public ComparativoProyeccionAnual() {
	
	setIconImage(Toolkit.getDefaultToolkit().getImage(Guia.class.getResource("/recursos/account_balances.png")));
	setTitle("CredCobGer - [Proyección Anual]");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 590, 427);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(10, 93, 562, 185);
	contentPane.add(scrollPane);
	
	JLabel lblDesde = new JLabel("Desde:");
	lblDesde.setBounds(105, 51, 46, 14);
	contentPane.add(lblDesde);
	
	JDateChooser dateChooser = new JDateChooser();
	dateChooser.setBounds(150, 45, 97, 20);
	contentPane.add(dateChooser);
	
	JLabel lblHasta = new JLabel("Hasta:");
	lblHasta.setBounds(257, 51, 46, 14);
	contentPane.add(lblHasta);
	
	JDateChooser dateChooser_1 = new JDateChooser();
	dateChooser_1.setBounds(296, 45, 97, 20);
	contentPane.add(dateChooser_1);
			
	table = new JTable();
	table.setModel(new DefaultTableModel(
		new Object[][] {
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null},
		},
		new String[] {
			"Rubro", "Realizado al 31/12/2008", "Realizado al 31/12/2009", "Realizado al 31/12/2010", "Realizado al 31/12/2011", "Realizado al 31/12/2012", "Realizado al 31/12/2013", "Logro %", "Crecimiento a Diciembre 2013"
		}
	));
	scrollPane.setViewportView(table);
	
	JButton btnGuardarAArchivo = new JButton("Guardar...");
	btnGuardarAArchivo.setIcon(new ImageIcon(Guia.class.getResource("/recursos/disk.png")));
	btnGuardarAArchivo.setFont(new Font("Times New Roman", Font.PLAIN, 11));
	btnGuardarAArchivo.setBounds(10, 11, 97, 23);
	contentPane.add(btnGuardarAArchivo);
	
	JButton btnImprimir = new JButton("Imprimir");
	btnImprimir.setIcon(new ImageIcon(Guia.class.getResource("/recursos/printer.png")));
	btnImprimir.setFont(new Font("Times New Roman", Font.PLAIN, 11));
	btnImprimir.setBounds(117, 11, 95, 23);
	contentPane.add(btnImprimir);
	
	JButton Detalle = new JButton("Detalle");
	Detalle.setFont(new Font("Times New Roman", Font.PLAIN, 11));
	Detalle.setBounds(223, 11, 95, 23);
	contentPane.add(Detalle);
	
	JButton button = new JButton("Filtrar");
	button.setIcon(new ImageIcon(ComparativoProyeccionAnual.class.getResource("/recursos/filter.png")));
	button.setFont(new Font("Times New Roman", Font.PLAIN, 11));
	button.setBounds(403, 45, 95, 23);
	contentPane.add(button);
	
	JLabel label = new JLabel("");
	label.setIcon(new ImageIcon(ComparativoProyeccionAnual.class.getResource("/recursos/aclogo_med_trans_64x67.png")));
	label.setBounds(505, 0, 67, 67);
	contentPane.add(label);
}
}
