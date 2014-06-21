package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDateChooser;

public class PrestamosOtorgadosVRMora extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrestamosOtorgadosVRMora frame = new PrestamosOtorgadosVRMora();
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
	public PrestamosOtorgadosVRMora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 97, 549, 185);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Organismo que aprob\u00F3", "No. de Cr\u00E9ditos", "Monto ($)", "Saldo ($)"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(10, 11, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setBounds(109, 11, 89, 23);
		contentPane.add(btnImprimir);
		
		JLabel lblSucursal = new JLabel("Sucursal");
		lblSucursal.setBounds(20, 45, 46, 14);
		contentPane.add(lblSucursal);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Seleccione una...", "San Salvador", "Salvador del Mundo"}));
		comboBox.setBounds(76, 39, 102, 20);
		contentPane.add(comboBox);
		
		JLabel lblLineaDeCrdito = new JLabel("Linea de Cr\u00E9dito");
		lblLineaDeCrdito.setBounds(10, 70, 83, 14);
		contentPane.add(lblLineaDeCrdito);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(110, 67, 68, 20);
		contentPane.add(comboBox_1);
		
		JLabel lblDesde = new JLabel("Desde:");
		lblDesde.setBounds(235, 45, 46, 14);
		contentPane.add(lblDesde);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(274, 39, 87, 20);
		contentPane.add(dateChooser);
		
		JLabel lblHasta = new JLabel("Hasta:");
		lblHasta.setBounds(371, 45, 46, 14);
		contentPane.add(lblHasta);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(410, 39, 87, 20);
		contentPane.add(dateChooser_1);
		
		JLabel lblCondicion = new JLabel("Condicion");
		lblCondicion.setBounds(235, 70, 46, 14);
		contentPane.add(lblCondicion);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Aprobado", "Pagando Bi\u00E9n", "Con Problemas"}));
		comboBox_2.setBounds(284, 66, 133, 20);
		contentPane.add(comboBox_2);
	}
}
