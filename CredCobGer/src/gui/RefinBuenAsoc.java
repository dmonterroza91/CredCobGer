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
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import javax.swing.ScrollPaneConstants;

public class RefinBuenAsoc extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RefinBuenAsoc frame = new RefinBuenAsoc();
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
	public RefinBuenAsoc() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(RefinBuenAsoc.class.getResource("/recursos/account_balances.png")));
		setTitle("CredCobGer - Listado de Candidatos a REfinanciamiento por Buen Asociado");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 854, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(RefinBuenAsoc.class.getResource("/recursos/aclogo_med_trans_64x67.png")));
		lblNewLabel.setBounds(755, 11, 67, 67);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setSelectedIcon(new ImageIcon(RefinBuenAsoc.class.getResource("/recursos/disk.png")));
		btnNewButton.setIcon(new ImageIcon(RefinBuenAsoc.class.getResource("/recursos/disk.png")));
		/*btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});*/
		btnNewButton.setIcon(new ImageIcon(RefinBuenAsoc.class.getResource("/recursos/disk.png")));
		btnNewButton.setBounds(28, 21, 97, 23);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("Imprimir");
		button.setIcon(new ImageIcon(RefinBuenAsoc.class.getResource("/recursos/printer.png")));
		button.setSelectedIcon(new ImageIcon(RefinBuenAsoc.class.getResource("/recursos/printer.png")));
		button.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		button.setBounds(155, 21, 95, 23);
		contentPane.add(button);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setEnabled(false);
		scrollPane.setBounds(10, 167, 812, 181);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 11));
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
				"Linea de Cr\u00E8dito", "C\u00F2digo Asociado", "Nombre Completo", "Clasificaci\u00F2n", "Monto Otorgado ($)", "Monto Abonado ($)", "Tel\u00E8fono", "Direcci\u00F2n"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(92);
		table.getColumnModel().getColumn(1).setPreferredWidth(92);
		table.getColumnModel().getColumn(2).setPreferredWidth(175);
		table.getColumnModel().getColumn(3).setPreferredWidth(80);
		table.getColumnModel().getColumn(4).setPreferredWidth(110);
		table.getColumnModel().getColumn(5).setPreferredWidth(106);
		table.getColumnModel().getColumn(6).setPreferredWidth(57);
		table.getColumnModel().getColumn(7).setPreferredWidth(175);
		scrollPane.setViewportView(table);
		
		JLabel label = new JLabel("Sucursal:");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label.setBounds(28, 104, 46, 14);
		contentPane.add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(83, 100, 147, 20);
		contentPane.add(comboBox);
		
		JLabel label_1 = new JLabel("Desde:");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label_1.setBounds(297, 104, 46, 14);
		contentPane.add(label_1);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("dd-MM-yyyy");
		dateChooser.setBounds(336, 100, 102, 20);
		contentPane.add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setDateFormatString("dd-MM-yyyy");
		dateChooser_1.setBounds(493, 100, 102, 20);
		contentPane.add(dateChooser_1);
		
		JLabel label_2 = new JLabel("Hasta:");
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label_2.setBounds(454, 104, 46, 14);
		contentPane.add(label_2);
		
		JButton button_1 = new JButton("Filtrar");
		button_1.setSelectedIcon(new ImageIcon(RefinBuenAsoc.class.getResource("/recursos/filter.png")));
		button_1.setIcon(new ImageIcon(RefinBuenAsoc.class.getResource("/recursos/filter.png")));
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		button_1.setBounds(727, 100, 95, 23);
		contentPane.add(button_1);
	}
}
