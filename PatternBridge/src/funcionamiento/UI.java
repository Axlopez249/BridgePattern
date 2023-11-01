package funcionamiento;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UI extends JFrame{
	private DispositivoCasa smartTV;
    private DispositivoControl smartphone;
    private DeviceBridge puente;
    private UiSalida uiSalida;
    
    public UI() {
		
		
		setTitle("Bridge Pattern");
        setSize(500, 600); // Set the desired size
        setResizable(false); // Disable frame resizing
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocation(50, 60);
        
        
        
        
        
        JLabel label_titulo = new JLabel("Dispositivos de control");

        
        label_titulo.setFont(new Font("Arial", Font.BOLD, 11)); // Set font and size
        label_titulo.setForeground(Color.BLACK); // Set text color
        label_titulo.setBounds(150, 10, 350, 40);

        
        //Objeto Calendario

        // Add label to the frame's content pane
        JButton aceptar = new JButton("aceptar");
        aceptar.setBounds(120, 100, 180, 20);


        
        String[] opciones = {"SmartPhone", "Alexa", "Firestick", "Google Home"};
        // Crear un JComboBox y agregar las opciones
        JComboBox<String> ControlDevice = new JComboBox<>(opciones);
        ControlDevice.setBounds(120, 70, 180, 20);
        getContentPane().add(ControlDevice);

        // Set null layout
        getContentPane().setLayout(null);
        
        
        aceptar.addActionListener(e -> ConectarController(ControlDevice));
        getContentPane().add(aceptar);

	}
	
	private void ConectarController(JComboBox<String> eleccion) {
        uiSalida = new UiSalida(eleccion.getSelectedItem().toString());
        uiSalida.setVisible(true);
    }
}
