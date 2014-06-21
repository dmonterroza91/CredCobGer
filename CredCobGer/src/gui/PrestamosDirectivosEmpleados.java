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
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;

public class PrestamosDirectivosEmpleados extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrestamosDirectivosEmpleados frame = new PrestamosDirectivosEmpleados();
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
	public PrestamosDirectivosEmpleados() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(PrestamosDirectivosEmpleados.class.getResource("/recursos/account_balances.png")));
		setTitle("CredCobGer - Prestamos de Directivos y Empleados");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 99, 584, 209);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"C\u00F3digo", "Nombre", "Monto ($)", "Saldo ($)", "Mora ($)", "Ahorro ($)", "Dep\u00F3sito ($)"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setIcon(new ImageIcon(PrestamosDirectivosEmpleados.class.getResource("/recursos/disk.png")));
		btnGuardar.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnGuardar.setBounds(10, 11, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblSucursal = new JLabel("Sucursal");
		lblSucursal.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblSucursal.setBounds(10, 65, 46, 14);
		contentPane.add(lblSucursal);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"San Salvador", "Salvador del Mundo"}));
		comboBox.setBounds(66, 62, 113, 20);
		contentPane.add(comboBox);
		
		JLabel lblDesde = new JLabel("Desde:");
		lblDesde.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblDesde.setBounds(218, 65, 46, 14);
		contentPane.add(lblDesde);
		
		JLabel lblHasta = new JLabel("Hasta:");
		lblHasta.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblHasta.setBounds(353, 65, 46, 14);
		contentPane.add(lblHasta);
		
		JButton btnFiltrar = new JButton("Filtrar");
		btnFiltrar.setIcon(new ImageIcon(PrestamosDirectivosEmpleados.class.getResource("/recursos/filter.png")));
		btnFiltrar.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnFiltrar.setBounds(503, 61, 89, 23);
		contentPane.add(btnFiltrar);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setIcon(new ImageIcon(PrestamosDirectivosEmpleados.class.getResource("/recursos/printer.png")));
		btnImprimir.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnImprimir.setBounds(109, 11, 95, 23);
		contentPane.add(btnImprimir);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(256, 62, 87, 20);
		contentPane.add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(391, 62, 87, 20);
		contentPane.add(dateChooser_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(PrestamosDirectivosEmpleados.class.getResource("/recursos/aclogo_med_trans_64x67.png")));
		label.setBounds(533, 0, 61, 58);
		contentPane.add(label);
	}
}
