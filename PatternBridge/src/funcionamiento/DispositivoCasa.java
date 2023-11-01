package funcionamiento;
import interfaces.*;

public class DispositivoCasa implements IHomeDevice{
	private int volume;
    private String image;

    @Override
    public void displayImage(String image) {
        this.image = image;
        System.out.println("Displaying image on Smart TV: " + image);
    }

    @Override
    public void adjustDisplaySize() {
        System.out.println("Adjusting display size on Smart TV");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Setting volume on Smart TV: " + volume);
    }
}
