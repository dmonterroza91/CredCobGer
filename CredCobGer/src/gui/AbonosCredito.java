package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.ScrollPane;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.UIManager;

import java.awt.Font;
import java.awt.Toolkit;

import com.toedter.calendar.JDateChooser;

import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.ScrollPaneConstants;


public class AbonosCredito extends JFrame {

	private JPanel contentPane;
	private JTable table_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					AbonosCredito frame = new AbonosCredito();
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
	public AbonosCredito() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(AbonosCredito.class.getResource("/recursos/account_balances.png")));
		setTitle("CredCobGer - Abonos de Cr\u00E8ditos");
		setBounds(100, 100, 1030, 321);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnGuardarAArchivo = new JButton("Guardar...");
		btnGuardarAArchivo.setIcon(new ImageIcon(AbonosCredito.class.getResource("/recursos/disk.png")));
		btnGuardarAArchivo.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnGuardarAArchivo.setBounds(10, 11, 97, 23);
		contentPane.add(btnGuardarAArchivo);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setIcon(new ImageIcon(AbonosCredito.class.getResource("/recursos/printer.png")));
		btnImprimir.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnImprimir.setBounds(117, 11, 95, 23);
		contentPane.add(btnImprimir);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(AbonosCredito.class.getResource("/recursos/aclogo_med_trans_64x67.png")));
		lblNewLabel.setBounds(939, 11, 67, 67);
		contentPane.add(lblNewLabel);
		
		JLabel lblSucursal = new JLabel("Sucursal:");
		lblSucursal.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblSucursal.setBounds(10, 64, 60, 14);
		contentPane.add(lblSucursal);
		
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		dateChooser.setBounds(596, 61, 87, 20);
		contentPane.add(dateChooser);
		
		JLabel lblNewLabel_1 = new JLabel("Desde:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(547, 64, 39, 14);
		contentPane.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setEnabled(false);
		scrollPane.setBounds(20, 89, 985, 184);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"C\u00F3d. Asoc.", "N\u00BA Cr\u00E9dito", "Nombre Completo", "Capital ($)", "Intereses ($)", "Seguro ($)", "Manejo ($)", "Seg. Da\u00F1os ($)", "Int. Moratorio ($)", "Int. Pendiente ($)", "Total Abonado ($)"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, true, false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(67);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(63);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(200);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(3).setPreferredWidth(64);
		table.getColumnModel().getColumn(4).setResizable(false);
		table.getColumnModel().getColumn(4).setPreferredWidth(76);
		table.getColumnModel().getColumn(5).setResizable(false);
		table.getColumnModel().getColumn(5).setPreferredWidth(64);
		table.getColumnModel().getColumn(6).setResizable(false);
		table.getColumnModel().getColumn(6).setPreferredWidth(66);
		table.getColumnModel().getColumn(7).setPreferredWidth(85);
		table.getColumnModel().getColumn(8).setResizable(false);
		table.getColumnModel().getColumn(8).setPreferredWidth(99);
		table.getColumnModel().getColumn(9).setResizable(false);
		table.getColumnModel().getColumn(9).setPreferredWidth(102);
		table.getColumnModel().getColumn(10).setResizable(false);
		table.getColumnModel().getColumn(10).setPreferredWidth(100);
		scrollPane.setViewportView(table);
		
		JLabel lblFechaFin = new JLabel("Hasta:");
		lblFechaFin.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblFechaFin.setBounds(693, 64, 39, 14);
		contentPane.add(lblFechaFin);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(732, 61, 87, 20);
		contentPane.add(dateChooser_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(65, 61, 170, 20);
		comboBox.addItem("Todo");
		comboBox.addItem("Cede San Salvador");
		comboBox.addItem("Salvador del Mundo");
		contentPane.add(comboBox);
		
		JLabel lblLineaDeCrdito = new JLabel("Linea de Cr\u00E8dito");
		lblLineaDeCrdito.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblLineaDeCrdito.setBounds(245, 64, 87, 14);
		contentPane.add(lblLineaDeCrdito);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(342, 61, 195, 20);
		comboBox_1.addItem("Todas");
		comboBox_1.addItem("Préstamo Rotativo");
		comboBox_1.addItem("Préstamo Rotativo sin Fiador");
		comboBox_1.addItem("Prestamos Rotativo empresarial");
		comboBox_1.addItem("Préstamo para Consumo");
		comboBox_1.addItem("Préstamo de Consumo Sin Fiador");
		comboBox_1.addItem("Préstamo Personal Sin Fiador");
		comboBox_1.addItem("Préstamo de mercadería");
		comboBox_1.addItem("Prestamos de Útiles Escolares");
		comboBox_1.addItem("Préstamos sobre Aportaciones");
		comboBox_1.addItem("Prestamos sobre Depósitos a plazos");
		comboBox_1.addItem("Prestamos con Garantía Hipotecaria");
		comboBox_1.addItem("Microcredito Empresarial");
		contentPane.add(comboBox_1);
		
		JButton button = new JButton("Filtrar");
		button.setIcon(new ImageIcon(AbonosCredito.class.getResource("/recursos/filter.png")));
		button.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		button.setBounds(829, 60, 95, 23);
		contentPane.add(button);
		
		
	}
}
