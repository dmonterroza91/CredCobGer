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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 83, 584, 225);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
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
		btnGuardar.setBounds(10, 27, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblSucursal = new JLabel("Sucursal");
		lblSucursal.setBounds(10, 58, 46, 14);
		contentPane.add(lblSucursal);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"San Salvador", "Salvador del Mundo"}));
		comboBox.setBounds(66, 55, 113, 20);
		contentPane.add(comboBox);
		
		JLabel lblDesde = new JLabel("Desde:");
		lblDesde.setBounds(233, 58, 46, 14);
		contentPane.add(lblDesde);
		
		JLabel lblHasta = new JLabel("Hasta:");
		lblHasta.setBounds(368, 58, 46, 14);
		contentPane.add(lblHasta);
		
		JButton btnFiltrar = new JButton("Filtrar");
		btnFiltrar.setBounds(503, 54, 89, 23);
		contentPane.add(btnFiltrar);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setBounds(114, 27, 89, 23);
		contentPane.add(btnImprimir);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(271, 55, 87, 20);
		contentPane.add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(406, 55, 87, 20);
		contentPane.add(dateChooser_1);
	}
}
