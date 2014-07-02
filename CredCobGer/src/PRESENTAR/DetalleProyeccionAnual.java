package PRESENTAR;

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

import javax.swing.JTextPane;

public class DetalleProyeccionAnual extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DetalleProyeccionAnual frame = new DetalleProyeccionAnual();
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
	public DetalleProyeccionAnual() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DetalleProyeccionAnual.class.getResource("/recursos/account_balances.png")));
		setTitle("CredCobGer - [Detalle de Proyección Anual]");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
				{"ENE",	"3793", "482",	"3773", "476"},
				{"FEB",	"3840", "315",	"3807", "722"},
				{"MAR",	"3887", "148",	"3839", "169"},
				{"ABR",	"3933",	"981",	"3824",	"879"},
				{"MAY",	"3980",	"814",	"3888",	"162"},
				{"JUN",	"4027",	"648",	"3937",	"731"},
			},
			new String[] {
				"Meses", "Proyectado", "Realizado", "Cumplimiento (%)", "Crecimiento"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnGuardarAArchivo = new JButton("Guardar...");
		btnGuardarAArchivo.setIcon(new ImageIcon(DetalleProyeccionAnual.class.getResource("/recursos/disk.png")));
		btnGuardarAArchivo.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnGuardarAArchivo.setBounds(10, 11, 97, 23);
		contentPane.add(btnGuardarAArchivo);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setIcon(new ImageIcon(DetalleProyeccionAnual.class.getResource("/recursos/printer.png")));
		btnImprimir.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnImprimir.setBounds(117, 11, 95, 23);
		contentPane.add(btnImprimir);
		
		JLabel lblRubro = new JLabel("Rubro");
		lblRubro.setBounds(248, 51, 46, 14);
		contentPane.add(lblRubro);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(283, 45, 194, 23);
		contentPane.add(textPane);
	
	}
}
