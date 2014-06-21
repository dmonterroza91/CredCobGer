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
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(PrestamosOtorgadosVRMora.class.getResource("/recursos/account_balances.png")));
		setTitle("CredCobGer - Prestamos Otorgados VS Mora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 613, 351);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 141, 577, 136);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
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
		btnGuardar.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnGuardar.setIcon(new ImageIcon(PrestamosOtorgadosVRMora.class.getResource("/recursos/disk.png")));
		btnGuardar.setBounds(10, 11, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setIcon(new ImageIcon(PrestamosOtorgadosVRMora.class.getResource("/recursos/printer.png")));
		btnImprimir.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnImprimir.setBounds(109, 11, 102, 23);
		contentPane.add(btnImprimir);
		
		JLabel lblSucursal = new JLabel("Sucursal");
		lblSucursal.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblSucursal.setBounds(10, 57, 46, 14);
		contentPane.add(lblSucursal);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Seleccione una...", "San Salvador", "Salvador del Mundo"}));
		comboBox.setBounds(109, 54, 102, 20);
		contentPane.add(comboBox);
		
		JLabel lblLineaDeCrdito = new JLabel("Linea de Cr\u00E9dito");
		lblLineaDeCrdito.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblLineaDeCrdito.setBounds(10, 91, 83, 14);
		contentPane.add(lblLineaDeCrdito);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Rotativo", "Personal", "Sin Fiador", "Hipotecario", "Navide\u00F1o", "Mercader\u00EDa", "Sin Fiador", "Sobre Aportaciones", "Microcr\u00E9dito"}));
		comboBox_1.setBounds(109, 88, 101, 20);
		contentPane.add(comboBox_1);
		
		JLabel lblDesde = new JLabel("Desde:");
		lblDesde.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblDesde.setBounds(245, 91, 46, 14);
		contentPane.add(lblDesde);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(301, 85, 87, 20);
		contentPane.add(dateChooser);
		
		JLabel lblHasta = new JLabel("Hasta:");
		lblHasta.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblHasta.setBounds(400, 91, 46, 14);
		contentPane.add(lblHasta);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(456, 88, 87, 20);
		contentPane.add(dateChooser_1);
		
		JLabel lblCondicion = new JLabel("Condicion");
		lblCondicion.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblCondicion.setBounds(235, 57, 56, 14);
		contentPane.add(lblCondicion);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Aprobado", "Pagando Bi\u00E9n", "Con Problemas"}));
		comboBox_2.setBounds(301, 54, 89, 20);
		contentPane.add(comboBox_2);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(PrestamosOtorgadosVRMora.class.getResource("/recursos/aclogo_med_trans_64x67.png")));
		label.setBounds(539, 0, 58, 60);
		contentPane.add(label);
		
		JButton btnFiltrar = new JButton("Filtrar");
		btnFiltrar.setIcon(new ImageIcon(PrestamosOtorgadosVRMora.class.getResource("/recursos/filter.png")));
		btnFiltrar.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnFiltrar.setBounds(454, 53, 89, 23);
		contentPane.add(btnFiltrar);
		
		JLabel lblNewLabel = new JLabel("Totales");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(88, 288, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel label_1 = new JLabel("$ 999,999.00");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_1.setBounds(205, 288, 76, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("$ 999,999.00");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_2.setBounds(355, 288, 76, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("$ 999,999.00");
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_3.setBounds(494, 288, 76, 14);
		contentPane.add(label_3);
	}
}
