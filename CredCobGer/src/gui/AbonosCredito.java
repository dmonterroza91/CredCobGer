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
		setIconImage(Toolkit.getDefaultToolkit().getImage(AbonosCredito.class.getResource("/recursos/account_balances.png")));
		setTitle("CredCobGer - Abonos de Cr\u00E8ditos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 832, 427);
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
		lblNewLabel.setBounds(716, 11, 67, 67);
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
		dateChooser.setBounds(92, 124, 87, 20);
		contentPane.add(dateChooser);
		
		JLabel lblNewLabel_1 = new JLabel("Desde:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 130, 75, 14);
		contentPane.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setEnabled(false);
		scrollPane.setBounds(21, 183, 758, 184);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"C\u00F2digo Asociado", "N\u00BA Cr\u00E8dito", "Nombre Completo", "Capital ($)", "Intereses ($)", "Seguro ($)", "Manejo ($)", "Total Abonado ($)"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(92);
		table.getColumnModel().getColumn(1).setPreferredWidth(63);
		table.getColumnModel().getColumn(2).setPreferredWidth(200);
		table.getColumnModel().getColumn(3).setPreferredWidth(64);
		table.getColumnModel().getColumn(4).setPreferredWidth(76);
		table.getColumnModel().getColumn(5).setPreferredWidth(64);
		table.getColumnModel().getColumn(6).setPreferredWidth(66);
		table.getColumnModel().getColumn(7).setPreferredWidth(100);
		scrollPane.setViewportView(table);
		
		JLabel lblFechaFin = new JLabel("Hasta:");
		lblFechaFin.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblFechaFin.setBounds(272, 130, 75, 14);
		contentPane.add(lblFechaFin);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(390, 124, 87, 20);
		contentPane.add(dateChooser_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(92, 61, 120, 20);
		contentPane.add(comboBox);
		
		JLabel lblLineaDeCrdito = new JLabel("Linea de Cr\u00E8dito");
		lblLineaDeCrdito.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblLineaDeCrdito.setBounds(272, 64, 87, 14);
		contentPane.add(lblLineaDeCrdito);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(390, 58, 120, 20);
		contentPane.add(comboBox_1);
		
		JButton button = new JButton("Filtrar");
		button.setIcon(new ImageIcon(AbonosCredito.class.getResource("/recursos/filter.png")));
		button.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		button.setBounds(688, 121, 95, 23);
		contentPane.add(button);
		
		
	}
}
