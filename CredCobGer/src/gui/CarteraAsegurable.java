package gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;

public class CarteraAsegurable extends JFrame {

	private JPanel contentPane;
	private JTable table;

	JButton btnGuardarAArchivo = new JButton("Guardar...");
	JButton btnImprimir = new JButton("Imprimir");
	JButton btnOpciones = new JButton("Opciones");
	
	JSeparator separator = new JSeparator();
	JScrollPane scrollPane = new JScrollPane();
	JPanel panel = new JPanel();
	
	JLabel lblNewLabel = new JLabel("");
	JLabel label = new JLabel("L\u00EDnea de Cr\u00E9dito:");
	JLabel label_1 = new JLabel("Xxxxxxxxxxxxxxxxxxxx");
	
	JLabel lblTotalLnea = new JLabel("Total L\u00EDnea");
	JLabel label_3 = new JLabel("$9,999,999.99");
	JScrollPane scrollPane_1 = new JScrollPane();
	JSeparator separator_1 = new JSeparator();
	JLabel label_2 = new JLabel("$9,999,999.99");
	JLabel lblTotalCartera = new JLabel("Total Cartera");
	JButton btnFiltrar = new JButton("Filtrar");
	JButton btnNewButton = new JButton("Siguiente L\u00EDnea");
	JButton btnLneaAnterior = new JButton("L\u00EDnea Anterior");
	JRadioButton rdbtnTodo = new JRadioButton("Todo");
	JRadioButton rdbtnActivas = new JRadioButton("Activas");
	JRadioButton rdbtnInactivas = new JRadioButton("Inactivas");
	ButtonGroup bg1 = new ButtonGroup();
	JLabel lblMostrar = new JLabel("Mostrar:");
	JRadioButton rdbtnLneaDeCrdito = new JRadioButton("L\u00EDnea de Cr\u00E9dito");
	JRadioButton rdbtnAportaciones = new JRadioButton("Aportaciones");
	JLabel lblRubro = new JLabel("Rubro:");
	JRadioButton rdbtnTodo_1 = new JRadioButton("Todo");
	ButtonGroup bg2 = new ButtonGroup();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					CarteraAsegurable frame = new CarteraAsegurable();
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
	public CarteraAsegurable() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(CarteraAsegurable.class.getResource("/recursos/account_balances.png")));
		setTitle("CredCobGer - Cartera Asegurable");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 740, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		btnGuardarAArchivo.setIcon(new ImageIcon(CarteraAsegurable.class.getResource("/recursos/disk.png")));
		btnGuardarAArchivo.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnGuardarAArchivo.setBounds(10, 11, 97, 23);
		contentPane.add(btnGuardarAArchivo);
		
		
		btnImprimir.setIcon(new ImageIcon(CarteraAsegurable.class.getResource("/recursos/printer.png")));
		btnImprimir.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnImprimir.setBounds(117, 11, 95, 23);
		contentPane.add(btnImprimir);
		
		
		lblNewLabel.setIcon(new ImageIcon(CarteraAsegurable.class.getResource("/recursos/aclogo_med_trans_64x67.png")));
		lblNewLabel.setBounds(655, 0, 67, 67);
		contentPane.add(lblNewLabel);
		
		
		btnOpciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				OpcionesMora opc = new OpcionesMora();
				opc.setLocationRelativeTo(null);
				opc.setVisible(true);
			}
		});
		btnOpciones.setIcon(new ImageIcon(CarteraAsegurable.class.getResource("/recursos/toolbox.png")));
		btnOpciones.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnOpciones.setBounds(222, 11, 95, 23);
		contentPane.add(btnOpciones);
		
		
		separator.setBounds(10, 100, 712, 2);
		contentPane.add(separator);
		
		
		scrollPane.setBounds(10, 113, 712, 236);
		contentPane.add(scrollPane);
		
		
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		
		label.setBounds(10, 11, 105, 19);
		label.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		panel.add(label);
		
		
		label_1.setBounds(120, 11, 163, 19);
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panel.add(label_1);
		
		
		lblTotalLnea.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblTotalLnea.setBounds(530, 11, 68, 19);
		panel.add(lblTotalLnea);
		
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_3.setBounds(608, 11, 92, 19);
		panel.add(label_3);
		
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
		
		separator_1.setBounds(10, 360, 712, 2);
		contentPane.add(separator_1);
		
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_2.setBounds(622, 373, 92, 19);
		contentPane.add(label_2);
		
		lblTotalCartera.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblTotalCartera.setBounds(515, 373, 97, 19);
		contentPane.add(lblTotalCartera);
		
		btnFiltrar.setIcon(new ImageIcon(CarteraAsegurable.class.getResource("/recursos/filter.png")));
		btnFiltrar.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnFiltrar.setBounds(550, 11, 95, 23);
		contentPane.add(btnFiltrar);
		
		btnNewButton.setIcon(new ImageIcon(CarteraAsegurable.class.getResource("/recursos/arrow_right.png")));
		btnNewButton.setBounds(581, 403, 141, 23);
		contentPane.add(btnNewButton);
		
		btnLneaAnterior.setIcon(new ImageIcon(CarteraAsegurable.class.getResource("/recursos/arrow_left.png")));
		btnLneaAnterior.setBounds(10, 403, 141, 23);
		contentPane.add(btnLneaAnterior);
		
		rdbtnTodo.setBounds(515, 70, 56, 23);
		contentPane.add(rdbtnTodo);
		
		rdbtnActivas.setBounds(573, 70, 67, 23);
		contentPane.add(rdbtnActivas);
		
		rdbtnInactivas.setBounds(642, 70, 76, 23);
		contentPane.add(rdbtnInactivas);
		
		bg1.add(rdbtnInactivas);
		bg1.add(rdbtnActivas);
		bg1.add(rdbtnTodo);
		
		lblMostrar.setBounds(463, 74, 46, 14);
		contentPane.add(lblMostrar);
		
		rdbtnLneaDeCrdito.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (!rdbtnLneaDeCrdito.isSelected()){
					label.setText("Línea de Crédito:");
					label_1.setText("Xxxxxxxxxxxxxxxxxxxx");
				}				
			}
		});
		rdbtnLneaDeCrdito.setBounds(62, 70, 109, 23);
		contentPane.add(rdbtnLneaDeCrdito);
		
		rdbtnAportaciones.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (!rdbtnAportaciones.isSelected()){
					label.setText("Aportaciones");
					label_1.setText(null);
				}				
			}
		});
		rdbtnAportaciones.setBounds(170, 70, 95, 23);
		contentPane.add(rdbtnAportaciones);
		
		rdbtnTodo_1.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (!rdbtnTodo_1.isSelected()){
					//Hacer que en la tabla se agregue una columna "Rubro"
				}				
			}
		});
		rdbtnTodo_1.setBounds(263, 70, 109, 23);
		contentPane.add(rdbtnTodo_1);
		
		lblRubro.setBounds(10, 74, 46, 14);
		contentPane.add(lblRubro);
		
		bg2.add(rdbtnLneaDeCrdito);
		bg2.add(rdbtnAportaciones);
		bg2.add(rdbtnTodo_1);
		
		
	}
}
