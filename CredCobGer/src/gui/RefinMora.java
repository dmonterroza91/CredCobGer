package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JComboBox;

import com.toedter.calendar.JDateChooser;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RefinMora extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RefinMora frame = new RefinMora();
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
	public RefinMora() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(RefinBuenAsoc.class.getResource("/recursos/account_balances.png")));
		setTitle("CredCobGer - Listado de Refinanciamiento por Mora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 859, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(RefinMora.class.getResource("/recursos/aclogo_med_trans_64x67.png")));
		label.setBounds(755, 11, 67, 67);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Sucursal:");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label_1.setBounds(28, 104, 46, 14);
		contentPane.add(label_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(83, 100, 147, 20);
		contentPane.add(comboBox);
		
		JLabel label_2 = new JLabel("Desde:");
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label_2.setBounds(297, 104, 46, 14);
		contentPane.add(label_2);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("dd-MM-yyyy");
		dateChooser.setBounds(336, 100, 102, 20);
		contentPane.add(dateChooser);
		
		JLabel label_3 = new JLabel("Hasta:");
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label_3.setBounds(454, 104, 46, 14);
		contentPane.add(label_3);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setDateFormatString("dd-MM-yyyy");
		dateChooser_1.setBounds(493, 100, 102, 20);
		contentPane.add(dateChooser_1);
		
		JButton button_1 = new JButton("Filtrar");
		button_1.setSelectedIcon(new ImageIcon(RefinBuenAsoc.class.getResource("/recursos/filter.png")));
		button_1.setIcon(new ImageIcon(RefinBuenAsoc.class.getResource("/recursos/filter.png")));
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		button_1.setBounds(727, 100, 95, 23);
		contentPane.add(button_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setEnabled(false);
		scrollPane.setBounds(10, 155, 831, 181);
		contentPane.add(scrollPane);
		
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
			},
			new String[] {
				"L\u00ECnea de Cr\u00E8dito", "C\u00F2digo Asociado", "Nombre Completo", "D\u00ECas Mora", "Clasificaci\u00F2n", "Monto Otorgado", "Monto Abonado", "Telefono", "Direcci\u00F2n"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(91);
		table.getColumnModel().getColumn(1).setPreferredWidth(92);
		table.getColumnModel().getColumn(2).setPreferredWidth(175);
		table.getColumnModel().getColumn(3).setPreferredWidth(60);
		table.getColumnModel().getColumn(4).setPreferredWidth(71);
		table.getColumnModel().getColumn(5).setPreferredWidth(92);
		table.getColumnModel().getColumn(6).setPreferredWidth(89);
		table.getColumnModel().getColumn(7).setPreferredWidth(56);
		table.getColumnModel().getColumn(8).setPreferredWidth(175);
		scrollPane.setViewportView(table);
		
		
	}
}
