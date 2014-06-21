package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;

public class SeguimientoAlPlanEmplesarialMensual extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeguimientoAlPlanEmplesarialMensual frame = new SeguimientoAlPlanEmplesarialMensual();
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
	public SeguimientoAlPlanEmplesarialMensual() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SeguimientoAlPlanEmplesarialMensual.class.getResource("/recursos/account_balances.png")));
		setTitle("CredCobGer - Seguimiento al Plan Empresarial Mensual");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 952, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 88, 781, 236);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Rubro", "Realizado al 31-12-08", "Realizado al 31-12-09", "Realizado al 31-12-10", "Realizado al 31-12-11", "Realizado al 31-12-12", "Realizado al 31-12-13", "Realizado al 31-[#Mes]-[#A\u00F1oActual]", "Logro (%)"
			}
		));
		scrollPane.setViewportView(table);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(801, 88, 125, 236);
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Crecim. ($)", "Crecim (%)"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setIcon(new ImageIcon(SeguimientoAlPlanEmplesarialMensual.class.getResource("/recursos/disk.png")));
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnNewButton.setBounds(10, 11, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setIcon(new ImageIcon(SeguimientoAlPlanEmplesarialMensual.class.getResource("/recursos/printer.png")));
		btnImprimir.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnImprimir.setBounds(109, 11, 104, 23);
		contentPane.add(btnImprimir);
		
		JLabel lblSucursal = new JLabel("Sucursal");
		lblSucursal.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblSucursal.setBounds(53, 48, 46, 14);
		contentPane.add(lblSucursal);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"San Salvador", "Salvador del Mundo"}));
		comboBox.setBounds(109, 45, 104, 20);
		contentPane.add(comboBox);
		
		JLabel lblMes = new JLabel("Mes");
		lblMes.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblMes.setBounds(253, 48, 46, 14);
		contentPane.add(lblMes);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));
		comboBox_1.setBounds(292, 45, 109, 20);
		contentPane.add(comboBox_1);
		
		JButton btnFiltrar = new JButton("Filtrar");
		btnFiltrar.setIcon(new ImageIcon(SeguimientoAlPlanEmplesarialMensual.class.getResource("/recursos/filter.png")));
		btnFiltrar.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnFiltrar.setBounds(427, 44, 89, 23);
		contentPane.add(btnFiltrar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(SeguimientoAlPlanEmplesarialMensual.class.getResource("/recursos/aclogo_med_trans_64x67.png")));
		label.setBounds(862, 0, 64, 62);
		contentPane.add(label);
	}
}
