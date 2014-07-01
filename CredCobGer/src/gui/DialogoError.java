package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class DialogoError extends JDialog {

	private final JPanel contentPanel = new JPanel();
	DialogoError dial = this;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			String nada = "No puede establecerse una conexi�n con la Base de Datos.";
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			DialogoError dialog = new DialogoError(nada,new JFrame());
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoError(String error, final JFrame pantalla) {
		dial.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
		dial.setLocationRelativeTo(null);
		setTitle("\u00A1Error!");
		setIconImage(Toolkit.getDefaultToolkit().getImage(DialogoError.class.getResource("/recursos/Stop-Error-32.png")));
		setBounds(100, 100, 450, 153);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setToolTipText("holi");
		scrollPane.setBounds(0, 0, 442, 86);
		contentPanel.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		textArea.setBackground(null);
		scrollPane.setViewportView(textArea);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Aceptar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dial.dispose();
						pantalla.setEnabled(true);
					}
				});
				okButton.setActionCommand("Aceptar");
				
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
		
		textArea.setText(error);
		pantalla.setEnabled(false);
		dial.setVisible(true);
		
	}
}
