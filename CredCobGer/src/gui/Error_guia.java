package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class Error_guia extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane = new JScrollPane();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					Error_guia frame = new Error_guia();
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
	public Error_guia() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Error_guia.class.getResource("/recursos/Stop-Error-32.png")));
		setTitle("\u00A1Error!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 238);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(342, 170, 89, 23);
		contentPane.add(btnAceptar);
		
		
		scrollPane.setFont(new Font("Times New Roman", Font.PLAIN, 12)); 
		scrollPane.setBounds(10, 11, 421, 151);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		textArea.setBackground((Color) null);
		scrollPane.setViewportView(textArea);
		scrollPane.getViewport().setViewPosition(new java.awt.Point(0, 0));
		
		textArea.setText("\n\n\n\n\n\n\n\n\n\n\n\n\n\nhola"); // Aquí colocan listados todos los errores...
	}
}
