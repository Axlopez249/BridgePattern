package funcionamiento;

import interfaces.*;


public class DeviceBridge {
	private DispositivoControl controlDevice;
    private IHomeDevice homeDevice;

    public DeviceBridge(DispositivoControl controlDevice) {
        this.controlDevice = controlDevice;
        
    }

    public void powerOn() {
        controlDevice.powerOn();
    }

    public void powerOff() {
        controlDevice.powerOff();
    }

    public void setVolume(int volume) {
        controlDevice.setVolume(volume);
    }

    public void displayImage(String image) {
        controlDevice.displayImage(image);
    
    }
    public void ajustar() {
    	controlDevice.Ajustar(3);
    }
}
