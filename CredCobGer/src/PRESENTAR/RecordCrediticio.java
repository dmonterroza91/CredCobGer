package PRESENTAR;

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
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RecordCrediticio extends JFrame {

	private JPanel contentPane;
	private JTable table_dir;
	private JTable table_tel;
	private JTable table_inact;
	private JTable table_act;

	private JButton btnSiguiente = new JButton("Siguiente");
	private JButton btnAnterior = new JButton("Anterior");
	
	private JPanel panel_1 = new JPanel();
	private JPanel panel_2 = new JPanel();
	private JPanel panel_3 = new JPanel();
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					RecordCrediticio frame = new RecordCrediticio();
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
	public RecordCrediticio() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(RecordCrediticio.class.getResource("/recursos/account_balances.png")));
		setTitle("CredCobGer - Record Crediticio de Asociado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 781, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnGuardarAArchivo = new JButton("Guardar...");
		btnGuardarAArchivo.setIcon(new ImageIcon(RecordCrediticio.class.getResource("/recursos/disk.png")));
		btnGuardarAArchivo.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnGuardarAArchivo.setBounds(10, 11, 97, 23);
		contentPane.add(btnGuardarAArchivo);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setIcon(new ImageIcon(RecordCrediticio.class.getResource("/recursos/printer.png")));
		btnImprimir.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnImprimir.setBounds(117, 11, 95, 23);
		contentPane.add(btnImprimir);
		
		JLabel lblNewLabel = new JLabel("");
//		lblNewLabel.setIcon(new ImageIcon(RecordCrediticio.class.getResource("/recursos/aclogo_med_trans_64x67.png")));
		lblNewLabel.setBounds(696, 0, 67, 67);
		contentPane.add(lblNewLabel);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setIcon(new ImageIcon(RecordCrediticio.class.getResource("/recursos/find.png")));
		btnBuscar.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnBuscar.setBounds(222, 11, 95, 23);
		contentPane.add(btnBuscar);
		
		JLabel lblNewLabel_1 = new JLabel("0782356, José Mauricio Pérez Mejía");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 65, 676, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblDui = new JLabel("DUI: 03745940-7   NIT: 0614-120374-121-4   Fecha de Nacimiento: 12/03/1974");
		lblDui.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblDui.setBounds(10, 105, 545, 14);
		contentPane.add(lblDui);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 65, 753, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 130, 753, 2);
		contentPane.add(separator_1);
		
		
		panel_1.setLayout(null);
		panel_1.setBounds(10, 140, 753, 215);
		contentPane.add(panel_1);
		
		JScrollPane scrollPane_dir = new JScrollPane();
		scrollPane_dir.setBounds(10, 116, 470, 88);
		panel_1.add(scrollPane_dir);
		
		table_dir = new JTable();
		table_dir.setModel(new DefaultTableModel(
			new Object[][] {
				{"Ciudad Merliot, Urbanizaci\u00F3n Jardines del Volc\u00E1n, Pasaje #8 casa # 5 pol D", "21/05/1997"},
				{"Santa Tecla, Calle Chiltiupan, Casa #34 pol\u00EDgono C", "13/12/1999"},
				{"Residencial Las Arboledas, Casa 12-C, Lourdes Col\u00F3n", "06/01/2011"},
				{"Jardines de Cuscatl\u00E1n casa N\u00B0 24-F Ciudad Merliot", "20/04/2013"},
			},
			new String[] {
				"Direcci\u00F3n", "Fecha"
			}
		));
		table_dir.getColumnModel().getColumn(0).setPreferredWidth(323);
		scrollPane_dir.setViewportView(table_dir);
		
		JScrollPane scrollPane_tel = new JScrollPane();
		scrollPane_tel.setBounds(490, 116, 253, 88);
		panel_1.add(scrollPane_tel);
		
		table_tel = new JTable();
		table_tel.setModel(new DefaultTableModel(
			new Object[][] {
				{"2278-9517", "21/05/1997"},
				{"2288-1765", "14/09/1999"},
				{"2318-3658", "10/12/2010"},
				{"2289-3645", "18/03/2013"},
			},
			new String[] {
				"Tel\u00E9fono", "Fecha"
			}
		));
		scrollPane_tel.setViewportView(table_tel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(199, 0, 360, 105);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Edad Mora Promedio", "02 cuotas", "B"},
				{"Antig\u00FCedad", "16 a\u00F1os", "A"},
				{"Pago a Cr\u00E9ditos", "59.27 %", "B"},
				{"Aportaciones vs. Deuda", "07.38 %", "C"},
				{"Raz\u00F3n de Endeudamiento", "42.91 %", "B"},
			},
			new String[] {
				"Indice", "Valor", "Clasificaci\u00F3n"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(25);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(25);
		scrollPane.setViewportView(table);
		
		
		panel_2.setLayout(null);
		panel_2.setBounds(10, 140, 753, 215);
		panel_2.setVisible(false);
		contentPane.add(panel_2);
		
		JScrollPane scrollPane_inact = new JScrollPane();
		scrollPane_inact.setBounds(10, 47, 733, 157);
		panel_2.add(scrollPane_inact);
		
		table_inact = new JTable();
		table_inact.setModel(new DefaultTableModel(
			new Object[][] {
				{"Pr\u00E9stamo con Garant\u00EDa Hipotecar\u00EDa", "07823561101", "06", "57.49", "5,000.00"},
				{"Pr\u00E9stamo Rotativo sin Fiador", "07823560201", "01", "30.01", "1,000.00"},
				{"Pr\u00E9stamo \u00DAtiles Escolares", "07823560901", "01", "90.91", "700.00"},
			},
			new String[] {
				"L\u00EDnea de Cr\u00E9dito", "N\u00BA de Cr\u00E9dito", "Edad Mora", "Pago a Cr\u00E9dito Pre-finalizaci\u00F3n (%)", "Monto ($)"
			}
		));
		table_inact.getColumnModel().getColumn(0).setPreferredWidth(171);
		table_inact.getColumnModel().getColumn(1).setPreferredWidth(22);
		table_inact.getColumnModel().getColumn(2).setPreferredWidth(20);
		table_inact.getColumnModel().getColumn(3).setPreferredWidth(120);
		table_inact.getColumnModel().getColumn(4).setPreferredWidth(28);
		scrollPane_inact.setViewportView(table_inact);
		
		JLabel lblCuentasInActivas = new JLabel("Cuentas Inactivas");
		lblCuentasInActivas.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblCuentasInActivas.setBounds(10, 7, 676, 29);
		panel_2.add(lblCuentasInActivas);
		
		
		panel_3.setLayout(null);
		panel_3.setBounds(10, 140, 753, 215);
		panel_3.setVisible(false);
		contentPane.add(panel_3);
		
		JScrollPane scrollPane_act = new JScrollPane();
		scrollPane_act.setBounds(10, 47, 733, 157);
		panel_3.add(scrollPane_act);
		
		table_act = new JTable();
		table_act.setModel(new DefaultTableModel(
			new Object[][] {
				{"Pr\u00E9stamo Rotativo", "07823560101", "01", "15.29", "500.00"},
				{"Pr\u00E9stamo Personal sin fiador", "07823560501", "01", "07.14", "4,600.00"},
			},
			new String[] {
				"L\u00EDnea de Cr\u00E9dito", "N\u00BA de Cr\u00E9dito", "Cuotas en Mora", "Capital Pagado (%)", "Monto ($)"
			}
		));
		table_act.getColumnModel().getColumn(0).setPreferredWidth(201);
		scrollPane_act.setViewportView(table_act);
		
		JLabel lblCuentasActivas = new JLabel("Cuentas Activas");
		lblCuentasActivas.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblCuentasActivas.setBounds(10, 7, 676, 29);
		panel_3.add(lblCuentasActivas);
		
		
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(panel_1.isVisible()){
					panel_1.setVisible(false);
					panel_2.setVisible(true);
					panel_3.setVisible(false);
					btnAnterior.setVisible(true);
				}else if(panel_2.isVisible()){
					panel_3.setVisible(true);
					panel_1.setVisible(false);
					panel_2.setVisible(false);
					btnSiguiente.setVisible(false);
				}
			}
		});
		btnSiguiente.setIcon(new ImageIcon(RecordCrediticio.class.getResource("/recursos/arrow_right.png")));
		btnSiguiente.setBounds(394, 359, 97, 23);
		contentPane.add(btnSiguiente);
		
		
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(panel_2.isVisible()){
					panel_2.setVisible(false);
					panel_1.setVisible(true);
					panel_3.setVisible(false);
					btnAnterior.setVisible(false);
				}else if(panel_3.isVisible()){
					panel_3.setVisible(false);
					panel_2.setVisible(true);
					panel_1.setVisible(false);
					btnSiguiente.setVisible(true);
				}
			}
		});
		btnAnterior.setIcon(new ImageIcon(RecordCrediticio.class.getResource("/recursos/arrow_left.png")));
		btnAnterior.setBounds(264, 359, 97, 23);
		btnAnterior.setVisible(false);
		contentPane.add(btnAnterior);
		
		JLabel lblClasificacinB = new JLabel("Clasificaci\u00F3n: B");
		lblClasificacinB.setHorizontalAlignment(SwingConstants.CENTER);
		lblClasificacinB.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblClasificacinB.setHorizontalTextPosition(SwingConstants.CENTER);
		lblClasificacinB.setBounds(523, 74, 220, 46);
		contentPane.add(lblClasificacinB);
	}
}
