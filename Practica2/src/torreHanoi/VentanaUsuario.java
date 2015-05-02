package torreHanoi;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class VentanaUsuario extends JFrame implements MouseListener {
	
	public javax.swing.JButton guardar,buscar,eliminar,records;
	@SuppressWarnings("rawtypes")
	public javax.swing.JComboBox selecDiscRecord;
	public JTextField cajanombre;
	public String nombre;
	public String[] encabezado = {"Nombre","Discos","Movimientos","Tiempo"};
	private String[][] datos = {{"Nombre","Discos","Movimientos","Tiempo"},
								{"","","",""},
								{"","","",""},
								{"","","",""},
								{"","","",""},
								{"","","",""},
								{"","","",""},
								{"","","",""},
								{"","","",""},
								{"","","",""}};
	private JTable tabla;

 	public VentanaUsuario() {
		configuracionVentana();
		iniciaComponente();
		generaRecord();
	}
	public void configuracionVentana(){
		setLayout(null);
		//setVisible(false); //comentar cuando se integre con la ventanaprincipal
		setSize(650, 400);
		setTitle("Jugador");
		setResizable(false);
		//setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		getContentPane().setLayout(null);
	}
	public void iniciaComponente(){
		setLayout(null);
		Container container = getContentPane();
		///////////////////Boton Jugar////////////////////////
		guardar = new JButton("Guardar y Jugar");
		guardar.setBounds(100, 75, 150, 30);
		container.add(guardar);
		guardar.addMouseListener(this);
		/////////////////Boton ver Records/////////////////////
		records = new JButton("Ver Records");
		records.setBounds(430, 40, 120, 30);
		container.add(records);
		records.addMouseListener(this);
		////////////////Selector de disco//////////////////////
		selecDiscRecord = new JComboBox();
		selecDiscRecord.setEditable(true);
        selecDiscRecord.setBounds(380, 45, 35, 20);
        for(int f=3;f<=8;f++) {
        	selecDiscRecord.addItem(String.valueOf(f));
        }
        container.add(selecDiscRecord);
		////////////////Caja de texto Nombre////////////////////////////////
		cajanombre = new JTextField();
		cajanombre.setBounds(50,35,250,30);
		cajanombre.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
		container.add(cajanombre);
		
		//////// Numero de Discos////////
			JLabel nombreEtiqueta = new JLabel();
			nombreEtiqueta.setBounds(70, 10, 230, 20);
			nombreEtiqueta.setFont(new java.awt.Font("Tr2n", 1,20));
			nombreEtiqueta.setForeground( Color.black );
			nombreEtiqueta.setText("Ingrese Nombre");
			add(nombreEtiqueta);
			setVisible(true);
		//////// Numero de Discos////////
		JLabel numDisco = new JLabel();
		numDisco.setBounds(350, 10, 230, 20);
		numDisco.setFont(new java.awt.Font("Tr2n", 1,20));
		numDisco.setForeground( Color.black );
		numDisco.setText("Seleccione Disco");
		add(numDisco);
		setVisible(true);
		
	}
	
	public void generaRecord(){
		tabla = new JTable(datos,encabezado);
		tabla.setBounds(90,150,450,165);
		add(tabla);// por aqui voy

	}
	
	@Override
	public void mousePressed(MouseEvent even) {
		if (even.getSource()==guardar) {
			nombre = cajanombre.getText();
			setVisible(false);
		}
	}
	@Override
	public void mouseClicked(MouseEvent even) {
		if (even.getSource()==guardar) {
			System.out.println("Nombre jugador guardado "+nombre);
		}
	}
	@Override
	public void mouseEntered(MouseEvent even) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent even) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent even) {
		// TODO Auto-generated method stub
		
	}
	/*public static void main(String[] args){
		VentanaUsuario ventanausuario = new VentanaUsuario();
	
	}*/

	
}
