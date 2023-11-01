package funcionamiento;

import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import interfaces.*;

public class DispositivoControl implements IControlDevice{
	private IHomeDevice homeDevice;

    public DispositivoControl() {
        this.homeDevice = homeDevice;
    }

    @Override
    public void powerOn() {
    	JOptionPane.showMessageDialog(null, "Prendiendo el dispositivo");
    }

    @Override
    public void powerOff() {
    	JOptionPane.showMessageDialog(null, "Apagando el dispositivo");
    }

    @Override
    public void setVolume(int volume) {
    	JOptionPane.showMessageDialog(null, "Se ha establecido el volumen");
    }

    @Override
    public void displayImage(String imagenRuta) {
    	JFrame frame = new JFrame("Image Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        try {
            // Ruta de la imagen que deseas abrir
            String imagePath = imagenRuta;
            File file = new File(imagePath);
            Image image = ImageIO.read(file);

            JLabel label = new JLabel(new ImageIcon(image));
            frame.add(label);

        } catch (IOException e) {
            e.printStackTrace();
        }

        frame.setVisible(true);
    }

	@Override
	public void Ajustar(int ajuste) {
		JOptionPane.showMessageDialog(null, "Se ha ajustado de forma predeterminada");
	}
}
