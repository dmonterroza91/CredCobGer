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

public class CarteraAsegurable extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					CarteraAsegurable frame = new CarteraAsegurable();
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
	public CarteraAsegurable() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CarteraAsegurable.class.getResource("/recursos/account_balances.png")));
		setTitle("CredCobGer - Cartera Asegurable");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnGuardarAArchivo = new JButton("Guardar...");
		btnGuardarAArchivo.setIcon(new ImageIcon(CarteraAsegurable.class.getResource("/recursos/disk.png")));
		btnGuardarAArchivo.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnGuardarAArchivo.setBounds(10, 11, 97, 23);
		contentPane.add(btnGuardarAArchivo);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setIcon(new ImageIcon(CarteraAsegurable.class.getResource("/recursos/printer.png")));
		btnImprimir.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnImprimir.setBounds(117, 11, 95, 23);
		contentPane.add(btnImprimir);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(CarteraAsegurable.class.getResource("/recursos/aclogo_med_trans_64x67.png")));
		lblNewLabel.setBounds(655, 0, 67, 67);
		contentPane.add(lblNewLabel);
		
		JButton btnOpciones = new JButton("Opciones");
		btnOpciones.setIcon(new ImageIcon(CarteraAsegurable.class.getResource("/recursos/toolbox.png")));
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
		
		JLabel lblTotalCartera = new JLabel("Total Cartera");
		lblTotalCartera.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblTotalCartera.setBounds(523, 338, 97, 19);
		contentPane.add(lblTotalCartera);
		
		JCheckBox chckbxActivas = new JCheckBox("Activas");
		chckbxActivas.setBounds(394, 11, 67, 23);
		contentPane.add(chckbxActivas);
		
		JCheckBox chckbxInactivas = new JCheckBox("Inactivas");
		chckbxInactivas.setBounds(463, 11, 82, 23);
		contentPane.add(chckbxInactivas);
		
		JButton btnFiltrar = new JButton("Filtrar");
		btnFiltrar.setIcon(new ImageIcon(CarteraAsegurable.class.getResource("/recursos/filter.png")));
		btnFiltrar.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnFiltrar.setBounds(550, 11, 95, 23);
		contentPane.add(btnFiltrar);
		
		JButton btnNewButton = new JButton("Siguiente L\u00EDnea");
		btnNewButton.setIcon(new ImageIcon(CarteraAsegurable.class.getResource("/recursos/arrow_right.png")));
		btnNewButton.setBounds(581, 373, 141, 23);
		contentPane.add(btnNewButton);
		
		JButton btnLneaAnterior = new JButton("L\u00EDnea Anterior");
		btnLneaAnterior.setIcon(new ImageIcon(CarteraAsegurable.class.getResource("/recursos/arrow_left.png")));
		btnLneaAnterior.setBounds(10, 373, 141, 23);
		contentPane.add(btnLneaAnterior);
	}
}
