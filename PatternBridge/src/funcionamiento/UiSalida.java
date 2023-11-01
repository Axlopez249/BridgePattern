package funcionamiento;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import interfaces.IHomeDevice;

public class UiSalida extends JFrame{
	public UiSalida(String device) {
		
		
		setTitle("Bridge Pattern");
        setSize(500, 600); // Set the desired size
        setResizable(false); // Disable frame resizing
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocation(50, 60);
        
        
        JLabel label_titulo = new JLabel("Dispositivos de control");

        label_titulo.setFont(new Font("Arial", Font.BOLD, 11)); // Set font and size
        label_titulo.setForeground(Color.BLACK); // Set text color
        label_titulo.setBounds(150, 10, 350, 40);

        
        
        String[] opciones = {"SmartTV", "Portatil", "Proyector"};
        // Crear un JComboBox y agregar las opciones
        JComboBox<String> Casas = new JComboBox<>(opciones);
        Casas.setBounds(120, 70, 180, 20);
        getContentPane().add(Casas);


        
        
        JButton vol = new JButton("Subir Volumen");
        JButton img = new JButton("Mostrar imagen");
        JButton tamano = new JButton("Ajustar tamaño");

        vol.setBounds(40, 120, 100, 20);
        img.setBounds(40, 160, 100, 20);
        tamano.setBounds(40, 200, 100, 20);


        // Add buttons to the frame's content pane
        getContentPane().add(vol);
        getContentPane().add(img);
        getContentPane().add(tamano);


        // Set null layout
        getContentPane().setLayout(null);
        
        
        vol.addActionListener(e -> SubirVolumen());
        img.addActionListener(e -> MostrarImagen());
        tamano.addActionListener(e -> Ajustar());


	}
	
	private void SubirVolumen() {
		IHomeDevice ihome = null;
		DispositivoControl control = new DispositivoControl();
		DeviceBridge puente = new DeviceBridge(control);
		puente.setVolume(5);
  
	}
	private void MostrarImagen() {
		IHomeDevice ihome = null;
		DispositivoControl control = new DispositivoControl();
		DeviceBridge puente = new DeviceBridge(control);
		puente.displayImage("C:/Users/Axel/Pictures/Screenshots/atest.png");
	}
	private void Ajustar() {
		IHomeDevice ihome = null;
		DispositivoControl control = new DispositivoControl();
		DeviceBridge puente = new DeviceBridge(control);
		puente.ajustar();
	}
}
