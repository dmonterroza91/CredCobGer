package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JSeparator;
import javax.swing.JScrollPane;

import java.awt.FlowLayout;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;

public class CreditosSucursal extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					CreditosSucursal frame = new CreditosSucursal();
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
	public CreditosSucursal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CreditosSucursal.class.getResource("/recursos/account_balances.png")));
		setTitle("CredCobGer - Cr\u00E9ditos por Sucursal");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 740, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnGuardarAArchivo = new JButton("Guardar...");
		btnGuardarAArchivo.setIcon(new ImageIcon(CreditosSucursal.class.getResource("/recursos/disk.png")));
		btnGuardarAArchivo.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnGuardarAArchivo.setBounds(10, 11, 97, 23);
		contentPane.add(btnGuardarAArchivo);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setIcon(new ImageIcon(CreditosSucursal.class.getResource("/recursos/printer.png")));
		btnImprimir.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnImprimir.setBounds(117, 11, 95, 23);
		contentPane.add(btnImprimir);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(CreditosSucursal.class.getResource("/recursos/aclogo_med_trans_64x67.png")));
		lblNewLabel.setBounds(655, 0, 67, 67);
		contentPane.add(lblNewLabel);
		
		JButton btnOpciones = new JButton("Opciones");
		btnOpciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				OpcionesMora opc = new OpcionesMora();
				opc.setLocationRelativeTo(null);
				opc.setVisible(true);
			}
		});
		btnOpciones.setIcon(new ImageIcon(CreditosSucursal.class.getResource("/recursos/toolbox.png")));
		btnOpciones.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnOpciones.setBounds(222, 11, 95, 23);
		contentPane.add(btnOpciones);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 70, 712, 2);
		contentPane.add(separator);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 78, 712, 236);
		contentPane.add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("L\u00EDnea de Cr\u00E9dito:");
		label.setBounds(10, 11, 105, 19);
		label.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		panel.add(label);
		
		JLabel label_1 = new JLabel("Xxxxxxxxxxxxxxxxxxxx");
		label_1.setBounds(120, 11, 163, 19);
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panel.add(label_1);
		
		JLabel lblTotalLnea = new JLabel("Total L\u00EDnea");
		lblTotalLnea.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblTotalLnea.setBounds(530, 11, 68, 19);
		panel.add(lblTotalLnea);
		
		JLabel label_3 = new JLabel("$9,999,999.99");
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_3.setBounds(608, 11, 92, 19);
		panel.add(label_3);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 41, 690, 181);
		panel.add(scrollPane_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"C\u00F3digo", "Nombre Completo", "\u00DAltima Fecha de Pago", "D\u00EDas Mora", "Capital ($)"
			}
		));
		scrollPane_1.setViewportView(table);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 325, 712, 2);
		contentPane.add(separator_1);
		
		JLabel label_2 = new JLabel("$9,999,999.99");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_2.setBounds(630, 338, 92, 19);
		contentPane.add(label_2);
		
		JLabel lblTotalCartera = new JLabel("Total Sucursal:");
		lblTotalCartera.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblTotalCartera.setBounds(523, 338, 97, 19);
		contentPane.add(lblTotalCartera);
		
		JButton btnFiltrar = new JButton("Filtrar");
		btnFiltrar.setIcon(new ImageIcon(CreditosSucursal.class.getResource("/recursos/filter.png")));
		btnFiltrar.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnFiltrar.setBounds(550, 41, 95, 23);
		contentPane.add(btnFiltrar);
		
		JButton btnNewButton = new JButton("Siguiente L\u00EDnea");
		btnNewButton.setIcon(new ImageIcon(CreditosSucursal.class.getResource("/recursos/arrow_right.png")));
		btnNewButton.setBounds(581, 373, 141, 23);
		contentPane.add(btnNewButton);
		
		JButton btnLneaAnterior = new JButton("L\u00EDnea Anterior");
		btnLneaAnterior.setIcon(new ImageIcon(CreditosSucursal.class.getResource("/recursos/arrow_left.png")));
		btnLneaAnterior.setBounds(10, 373, 141, 23);
		contentPane.add(btnLneaAnterior);
		
		JLabel lblSucursal = new JLabel("Sucursal:");
		lblSucursal.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblSucursal.setBounds(10, 45, 46, 14);
		contentPane.add(lblSucursal);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("Todas...");
		comboBox.addItem("Sede San Salvador");
		comboBox.addItem("Salvador del Mundo");
		comboBox.setBounds(65, 41, 147, 20);
		contentPane.add(comboBox);
		
		JLabel lblDesde = new JLabel("Desde:");
		lblDesde.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblDesde.setBounds(242, 45, 46, 14);
		contentPane.add(lblDesde);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("dd-MM-yyyy");
		dateChooser.setBounds(281, 41, 102, 20);
		contentPane.add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setDateFormatString("dd-MM-yyyy");
		dateChooser_1.setBounds(438, 41, 102, 20);
		contentPane.add(dateChooser_1);
		
		JLabel lblHasta = new JLabel("Hasta:");
		lblHasta.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblHasta.setBounds(399, 45, 46, 14);
		contentPane.add(lblHasta);
		
		JLabel lblTotalDeCrditos = new JLabel("Total de Cr\u00E9ditos Otorgados:");
		lblTotalDeCrditos.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblTotalDeCrditos.setBounds(10, 338, 191, 19);
		contentPane.add(lblTotalDeCrditos);
		
		JLabel label_5 = new JLabel("$9,999,999,999.99");
		label_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_5.setBounds(194, 338, 141, 19);
		contentPane.add(label_5);
	}
}
