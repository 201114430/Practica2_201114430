package torreHanoi;

import java.awt.Container;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaInstruccion extends JFrame {

	public VentanaInstruccion() {
		initfondo();
		configuracionVentana();
		instruccion();
	}
	public void configuracionVentana(){
		setSize(685, 690);
		setTitle("Instrucciones Torres de Hanoi");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setVisible(true);
	}
	private void instruccion() {
		setLayout(null);
		Container container = getContentPane();
		JButton instruccion = new JButton();
		container.add(instruccion);
		instruccion.setBorderPainted(false);
		instruccion.setContentAreaFilled(false);
		instruccion.setBounds(0,130,680,540);
	    setLayout(null);
		/*Imagen torre*/
		String urlImagenTorre = "/Imagen/I1.png";
	    ImageIcon icon = new ImageIcon(getClass().getResource(urlImagenTorre));
	    Image img = icon.getImage();
	    Image otraimg = img.getScaledInstance(680,535,java.awt.Image.SCALE_SMOOTH);
	    ImageIcon otroicon = new ImageIcon(otraimg);
	    instruccion.setIcon(otroicon);
	}
 	private void initfondo(){//fondo animado de la ventana
		JLabel fondo = new JLabel();
		//String nombre = "/home/juandelcid/Documentos/Dropbox/Proyecto de IPC1/Eclipse/InterfazGrafica/src/Imagen/TH4.gif";//ubuntu
		String nombre = "C:\\Users\\Juan JP\\OneDrive\\Dropbox\\Proyecto de IPC1\\Eclipse\\InterfazGrafica\\bin\\Imagen\\TH4.gif";//ventana
		fondo.setIcon(new javax.swing.ImageIcon(nombre));
		getContentPane().add(fondo);
		fondo.setBounds(183, 0, 320, 125);		
	}
}
