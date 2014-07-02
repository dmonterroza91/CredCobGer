package PRESENTAR;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import javax.swing.ListSelectionModel;

import java.awt.Scrollbar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ComparativoProyeccionAnual extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComparativoProyeccionAnual frame = new ComparativoProyeccionAnual();
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
	public ComparativoProyeccionAnual() {
	
	setIconImage(Toolkit.getDefaultToolkit().getImage(ComparativoProyeccionAnual.class.getResource("/recursos/account_balances.png")));
	setTitle("CredCobGer - [Proyección Anual]");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 904, 451);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(48, 95, 810, 194);
	contentPane.add(scrollPane);
	
	JLabel lblDesde = new JLabel("Desde:");
	lblDesde.setBounds(10, 51, 46, 14);
	contentPane.add(lblDesde);
	
	JDateChooser dateChooser = new JDateChooser();
	dateChooser.setBounds(48, 45, 105, 20);
	contentPane.add(dateChooser);
	
	JLabel lblHasta = new JLabel("Hasta:");
	lblHasta.setBounds(161, 51, 46, 14);
	contentPane.add(lblHasta);
	
	JDateChooser dateChooser_1 = new JDateChooser();
	dateChooser.setDateFormatString("dd-mm-yyyy");
	dateChooser_1.setBounds(199, 45, 105, 20);
	contentPane.add(dateChooser_1);
			
	table = new JTable();
	table.setCellSelectionEnabled(true);
	table.setFont(new Font("Times New Roman", Font.PLAIN, 12));
	table.setModel(new DefaultTableModel(
		new Object[][] {
			{"CRECIM. ACTIVO TOTAL", "2576,377", "2749,078", "2934,917", "3322,329", "3746,599", "4308,596", "4115,574", "95.5%", "368,975", "9.85"},
			{"DEPOSITOS DE AHORRO", "832,210", "934,762", "1056,607", "1259,516", "1395,339", "1544,140", "1558,687", "100.9%", "163,348",	"11.71"},
			{"CARTERA DE PRESTAMOS", "2163,154", "1850,507", "1913,650", "2326,364", "2734,342", "3417,946", "3144,092", "92.0%", "409,750", "14.99"},
			{"MOROSIDAD", "369,326", "385,048", "405,692", "446,061", "460,252", "476,972", "462,540", "97.0%", "2,288", "0.50"},
			{"% DE MOROSIDAD", "13.14", "15.45", "15.9", "14.79", "12.9", "11.4", "11.3", "99.1%", "-1.60",	"-12.40"},
			{"INGRESOS FINANCIEROS", "444,761", "403,013", "395,623", "501,770", "592,220", "621,833", "700,169", "112.6%", "107,949", "18.23"},
			{"GASTOS OPERACIONALES", "232,823", "231,116", "245,277", "284,335", "298,801", "342,931", "365,691", "106.6%", "66,890", "22.39"},
			{"COSTOS FINANCIEROS", "52,345", "46,832", "56,935", "60,302", "59,399", "71,587", "67,906", "94.9%", "8,507", "14.32"},
			{"APORTACIONES", "1246,100", "1274,909", "1374,060", "1526,043", "1745,450", "1920,007", "1890,844", "98.5%", "145,394", "8.33"},
			{"EXCEDENTES DEL EJERCICIO", "63,026", "69,895", "43,762", "63,213", "97,261", "102,126", "105,732", "103.5%", "8,471",	"8.71"},
			{"% DE DISTRIBUCION", "5.06", "5.48", "3.19", "4.14", "5.57", "5.85", "5.59", "95.6%", "0.02", "0.3"},
		},
		new String[] {
			"Rubro", "Realizado al 31/12/2008", "Realizado al 31/12/2009", "Realizado al 31/12/2010", "Realizado al 31/12/2011", "Realizado al 31/12/2012", "Proyecci\u00F3n AL 31-12-13", "Realizado al 31/12/2013", "Logro %", "Crecimiento a Diciembre 2013", "% Crecimiento"
		}
		
	));
	scrollPane.setViewportView(table);
	
	JButton btnGuardarAArchivo = new JButton("Guardar...");
	btnGuardarAArchivo.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent arg0) {
			JOptionPane.showMessageDialog(null, "La fecha de inicio es mayor a la fecha de fin", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
	});
	btnGuardarAArchivo.setIcon(new ImageIcon(ComparativoProyeccionAnual.class.getResource("/recursos/disk.png")));
	btnGuardarAArchivo.setFont(new Font("Times New Roman", Font.PLAIN, 11));
	btnGuardarAArchivo.setBounds(10, 11, 97, 23);
	contentPane.add(btnGuardarAArchivo);
	
	JButton btnImprimir = new JButton("Imprimir");
	btnImprimir.setIcon(new ImageIcon(ComparativoProyeccionAnual.class.getResource("/recursos/printer.png")));
	btnImprimir.setFont(new Font("Times New Roman", Font.PLAIN, 11));
	btnImprimir.setBounds(117, 11, 95, 23);
	contentPane.add(btnImprimir);
	
	JButton btnDetalle = new JButton("Detalle");
	btnDetalle.setIcon(new ImageIcon(ComparativoProyeccionAnual.class.getResource("/recursos/resumen.png")));
	btnDetalle.setFont(new Font("Times New Roman", Font.PLAIN, 11));
	btnDetalle.setBounds(223, 11, 95, 23);
	contentPane.add(btnDetalle);
	
	Scrollbar scrollbar = new Scrollbar();
	scrollbar.setBounds(48, 287, 795, 20);
	contentPane.add(scrollbar);
	scrollbar.setOrientation(Scrollbar.HORIZONTAL);
}
}
