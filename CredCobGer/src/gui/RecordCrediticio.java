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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		lblNewLabel.setIcon(new ImageIcon(RecordCrediticio.class.getResource("/recursos/aclogo_med_trans_64x67.png")));
		lblNewLabel.setBounds(696, 0, 67, 67);
		contentPane.add(lblNewLabel);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setIcon(new ImageIcon(RecordCrediticio.class.getResource("/recursos/find.png")));
		btnBuscar.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnBuscar.setBounds(222, 11, 95, 23);
		contentPane.add(btnBuscar);
		
		JLabel lblNewLabel_1 = new JLabel("9999999, Xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 65, 676, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblDui = new JLabel("DUI: 99999999-9   NIT: 9999-999999-999-9   Fecha de Nacimiento: 99/99/9999");
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
		scrollPane_dir.setBounds(10, 11, 470, 88);
		panel_1.add(scrollPane_dir);
		
		table_dir = new JTable();
		table_dir.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Direcci\u00F3n", "Fecha"
			}
		));
		table_dir.getColumnModel().getColumn(0).setPreferredWidth(323);
		scrollPane_dir.setViewportView(table_dir);
		
		JScrollPane scrollPane_tel = new JScrollPane();
		scrollPane_tel.setBounds(490, 11, 253, 88);
		panel_1.add(scrollPane_tel);
		
		table_tel = new JTable();
		table_tel.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Tel\u00E9fono", "Fecha"
			}
		));
		scrollPane_tel.setViewportView(table_tel);
		
		JLabel lblEdadMoraPromedio = new JLabel("Edad Mora Promedio");
		lblEdadMoraPromedio.setBounds(10, 119, 133, 14);
		panel_1.add(lblEdadMoraPromedio);
		lblEdadMoraPromedio.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		JLabel lblCuotas = new JLabel("999 cuotas");
		lblCuotas.setBounds(153, 119, 82, 14);
		panel_1.add(lblCuotas);
		lblCuotas.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JLabel label = new JLabel("999.99 %");
		label.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label.setBounds(431, 152, 82, 23);
		panel_1.add(label);
		
		JLabel lblPagoACrditos = new JLabel("Pago a Cr\u00E9ditos Pre-finalizaci\u00F3n");
		lblPagoACrditos.setVerticalAlignment(SwingConstants.TOP);
		lblPagoACrditos.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblPagoACrditos.setBounds(223, 154, 208, 25);
		panel_1.add(lblPagoACrditos);
		
		JLabel lblAos = new JLabel("99 A\u00F1os");
		lblAos.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblAos.setBounds(153, 184, 82, 14);
		panel_1.add(lblAos);
		
		JLabel lblAntigedad = new JLabel("Antig\u00FCedad");
		lblAntigedad.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblAntigedad.setBounds(10, 179, 82, 25);
		panel_1.add(lblAntigedad);
		
		JLabel label_4 = new JLabel("999.99 %");
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_4.setBounds(661, 119, 82, 14);
		panel_1.add(label_4);
		
		JLabel lblAportacionesVsDeuda = new JLabel("Aportaciones vs. Deuda");
		lblAportacionesVsDeuda.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblAportacionesVsDeuda.setBounds(490, 119, 161, 14);
		panel_1.add(lblAportacionesVsDeuda);
		
		JLabel label_6 = new JLabel("999.99 %");
		label_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_6.setBounds(661, 190, 82, 14);
		panel_1.add(label_6);
		
		JLabel lblRaznDeEndeudamiento = new JLabel("Raz\u00F3n de Endeudamiento");
		lblRaznDeEndeudamiento.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblRaznDeEndeudamiento.setBounds(490, 190, 161, 14);
		panel_1.add(lblRaznDeEndeudamiento);
		
		
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
				{null, null, null, null, ""},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
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
	}
}
