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
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;


public class VentanaUsuario extends JFrame implements MouseListener {

	public javax.swing.JButton guardar,buscar,eliminar,records;
	public javax.swing.JComboBox selecDiscRecord;
	public JTextField cajanombre;
	public String nombre;
	public javax.swing.JTable tabla;
	public String[] lista0 = {"Nombre", "Disco", "Movimientos", "Tiempo"};
	public String[] lista1,lista2,lista3,lista4,lista5,lista6,lista7,lista8,lista9,lista10;
	public String[][] dato = {lista0,lista1,lista2,lista3,lista4,lista5,lista6,lista7,lista8,lista9,lista10};

 	public VentanaUsuario() {
 		llenaLista();
 		configuracionVentana();
		iniciaComponente();
	}
	public void configuracionVentana(){
		setLayout(null);
		//setVisible(false); //comentar cuando se integre con la ventanaprincipal
		setSize(650, 400);
		setTitle("Jugador");
		setResizable(true);
		//setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); //activa cuando se integre con la ventana principal
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// desactiva cuando se integre con la ventana principal
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
	public void llenaLista(){
		/*String[] lista1 = null;
		for(int i=0; i<4;i++){
			lista1[i] = "asdf";
			System.out.println("lista 1 "+ lista1[i]);
		}*/
		



	}
	public void generaRecord(String[] lista1,String[] lista2,String[] lista3,String[] lista4,String[] lista5,String[] lista6,String[] lista7,String[] lista8,String[] lista9,String[] lista10){
	
		String[][] dato = {lista0,lista1,lista2,lista3,lista4,lista5,lista6,lista7,lista8,lista9,lista10};
		//////////////////crea JTable/////////////
		tabla = new JTable(dato,lista0);
		tabla.setBounds(90,150,450,180);
		add(tabla);	
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
	public static void main(String[] args){
		VentanaUsuario ventanausuario = new VentanaUsuario();
		//ventanausuario.pack();
		ventanausuario.setVisible(true);
	
	}	
}
