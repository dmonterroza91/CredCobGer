package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Font;

public class BuscarAsociado extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuscarAsociado frame = new BuscarAsociado();
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
	public BuscarAsociado() {
		setTitle("Buscar Asociado...");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 384);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(99, 8, 161, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(367, 8, 161, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(99, 39, 161, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(99, 70, 161, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(367, 39, 161, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(367, 70, 161, 20);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel = new JLabel("C\u00F3digo");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel.setBounds(10, 11, 33, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNombre.setBounds(10, 42, 37, 14);
		contentPane.add(lblNombre);
		
		JLabel lblDirDeTrabajo = new JLabel("Dir. de Trabajo");
		lblDirDeTrabajo.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblDirDeTrabajo.setBounds(10, 73, 72, 14);
		contentPane.add(lblDirDeTrabajo);
		
		JLabel lblDui = new JLabel("DUI");
		lblDui.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblDui.setBounds(270, 11, 46, 14);
		contentPane.add(lblDui);
		
		JLabel lblLugarDeTrabajo = new JLabel("Lugar de Trabajo");
		lblLugarDeTrabajo.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblLugarDeTrabajo.setBounds(270, 73, 78, 14);
		contentPane.add(lblLugarDeTrabajo);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblApellidos.setBounds(270, 42, 46, 14);
		contentPane.add(lblApellidos);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnNewButton.setBounds(553, 113, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("New button");
		button.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		button.setBounds(454, 115, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		button_1.setBounds(553, 316, 89, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("New button");
		button_2.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		button_2.setBounds(454, 316, 89, 23);
		contentPane.add(button_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		scrollPane.setBounds(10, 141, 632, 164);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.PLAIN, 11));
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
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"C\u00F3digo", "Nombre Completo", "DUI", "Lugar de Trabajo", "Direcci\u00F3n de Trabajo"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(188);
		table.getColumnModel().getColumn(2).setPreferredWidth(58);
		table.getColumnModel().getColumn(3).setPreferredWidth(99);
		table.getColumnModel().getColumn(4).setPreferredWidth(145);
		scrollPane.setViewportView(table);
	}
}
