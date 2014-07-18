package gui;

import java.awt.BorderLayout;
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
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Rubros extends JFrame {

	private JPanel contentPane;
	private JTable table;
	JFrame rub = this;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rubros frame = new Rubros();
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
	public Rubros() {
			
	setIconImage(Toolkit.getDefaultToolkit().getImage(Guia.class.getResource("/recursos/account_balances.png")));
	setTitle("CredCobGer - Rubros");
	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	setBounds(100, 100, 590, 427);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(10, 97, 549, 185);
	contentPane.add(scrollPane);
	
	JLabel lblDesde = new JLabel("Fecha:");
	lblDesde.setBounds(10, 51, 46, 14);
	contentPane.add(lblDesde);
	
	JDateChooser dateChooser = new JDateChooser();
	dateChooser.setBounds(66, 45, 87, 20);
	contentPane.add(dateChooser);
		
	table = new JTable();
	table.setModel(new DefaultTableModel(
		new Object[][] {
			{null, null},
			{null, null},
			{null, null},
			{null, null},
			{null, null},
			{null, null},
			{null, null},
		},
		new String[] {
			"Rubro", "$"
		}
	));
	scrollPane.setViewportView(table);
	
	JButton btnGuardarAArchivo = new JButton("Guardar...");
	btnGuardarAArchivo.setIcon(new ImageIcon(Guia.class.getResource("/recursos/disk.png")));
	btnGuardarAArchivo.setFont(new Font("Times New Roman", Font.PLAIN, 11));
	btnGuardarAArchivo.setBounds(10, 11, 97, 23);
	contentPane.add(btnGuardarAArchivo);
	
	JButton btnModificar = new JButton("Modificar");
	//btnModificar.setIcon(new ImageIcon(Guia.class.getResource("/recursos/printer.png")));
	btnModificar.setFont(new Font("Times New Roman", Font.PLAIN, 11));
	btnModificar.setBounds(117, 11, 95, 23);
	contentPane.add(btnModificar);
	
	JButton btnVerResumen = new JButton("Ver Resumen");
	btnVerResumen.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			ComparativoProyeccionAnual cmpA= new ComparativoProyeccionAnual();
			cmpA.setVisible(true);
			rub.dispose();
		}
	});
	/*
	btnVerResumen.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent arg0) {
			ComparativoProyeccionAnual cmpA= new ComparativoProyeccionAnual();
		}
	});
	*/
	btnVerResumen.setFont(new Font("Times New Roman", Font.PLAIN, 11));
	btnVerResumen.setBounds(223, 11, 95, 23);
	contentPane.add(btnVerResumen);
	
	JLabel label = new JLabel("");
	label.setIcon(new ImageIcon(Rubros.class.getResource("/recursos/aclogo_med_trans_64x67.png")));
	label.setBounds(505, 0, 67, 67);
	contentPane.add(label);
}
}
