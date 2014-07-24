package gui;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Tabla extends JScrollPane {
	public JTable tabla = new JTable();
	int columnas, filas;
	int[] anchos;
	String[][] celdas;
	String nomColumnas[] = {};
	DefaultTableModel modelo;

	public Tabla(int filas, int columnas, String[] nomColumnas, int[] anchos) {
		this.filas = filas;
		this.columnas = columnas;
		this.anchos = anchos;
		this.nomColumnas = nomColumnas;
		this.celdas = new String[filas][columnas];
		
		for(int i =0; i<filas; i++){
			for(int j =0; j<columnas; j++){
				celdas[i][j] = null;
			}
		}
		
		this.modelo = new DefaultTableModel(celdas, nomColumnas);
		defecto();
	}
	
	public Tabla(String[][] celdas, String[] nomColumnas, int[] anchos){
		this.celdas = celdas;
		this.nomColumnas = nomColumnas;
		this.anchos = anchos;
		this.filas = this.celdas.length;
		this.columnas = this.celdas[0].length;
		
		this.modelo = new DefaultTableModel(celdas, nomColumnas);
		defecto();
	}
	
	public void defecto(){
		tabla.setModel(modelo);
		this.setViewportView(tabla);
		this.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		for(int i = 0; i<anchos.length; i++)
		tabla.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
		((DefaultTableCellRenderer)tabla.getTableHeader().getDefaultRenderer())
	    .setHorizontalAlignment(JLabel.CENTER);
		
	}
}
