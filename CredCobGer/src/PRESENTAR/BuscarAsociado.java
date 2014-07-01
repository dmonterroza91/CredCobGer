package PRESENTAR;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class BuscarAsociado extends JFrame {

	private JPanel contentPane;
	private JTextField txtDosTresConco;
	private JTextField textField_1;
	private JTextField txtMauricio;
	private JTextField textField_3;
	private JTextField txtPrez;
	private JTextField textField_5;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
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
		setIconImage(Toolkit.getDefaultToolkit().getImage(BuscarAsociado.class.getResource("/recursos/find.png")));
		setTitle("Buscar Asociado...");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtDosTresConco = new JTextField();
		txtDosTresConco.setText("dos tres cinco");
		txtDosTresConco.setBounds(99, 8, 161, 20);
		contentPane.add(txtDosTresConco);
		txtDosTresConco.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("1234-1234-9");
		textField_1.setColumns(10);
		textField_1.setBounds(367, 8, 161, 20);
		contentPane.add(textField_1);
		
		txtMauricio = new JTextField();
		txtMauricio.setText("123");
		txtMauricio.setColumns(10);
		txtMauricio.setBounds(99, 39, 161, 20);
		contentPane.add(txtMauricio);
		
		textField_3 = new JTextField();
		textField_3.setText("{}+|\u00B0");
		textField_3.setColumns(10);
		textField_3.setBounds(99, 70, 161, 20);
		contentPane.add(textField_3);
		
		txtPrez = new JTextField();
		txtPrez.setText("M0ntan0");
		txtPrez.setColumns(10);
		txtPrez.setBounds(367, 39, 161, 20);
		contentPane.add(txtPrez);
		
		textField_5 = new JTextField();
		textField_5.setText(":{?\\");
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
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnNewButton.setBounds(553, 113, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnBorrarCasillas = new JButton("Borrar Campos");
		btnBorrarCasillas.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnBorrarCasillas.setBounds(440, 113, 103, 23);
		contentPane.add(btnBorrarCasillas);
		
		JButton btnSeleccionar = new JButton("Seleccionar");
		btnSeleccionar.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnSeleccionar.setBounds(553, 255, 89, 23);
		contentPane.add(btnSeleccionar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnCancelar.setBounds(454, 255, 89, 23);
		contentPane.add(btnCancelar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		scrollPane.setBounds(10, 141, 632, 103);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		table.setModel(new DefaultTableModel(
			new Object[][] {
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
		
		JLabel label_img = new JLabel("");
//		label_img.setIcon(new ImageIcon(PRESENTAR.class.getResource("/recursos/aclogo_med_trans_64x67.png")));
		label_img.setBounds(575, 11, 67, 67);
		contentPane.add(label_img);
	}
}
