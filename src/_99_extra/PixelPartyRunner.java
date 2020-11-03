package _99_extra;

public class PixelPartyRunner {
public static void main(String[] args) {
	PixelParty pixel = new PixelParty();
	pixel.setColor(255, 255, 255);
	pixel.drawCircle(2,2,2);
	pixel.drawLine(1, 1, 2, 2);
	pixel.drawRectangle(10, 10, 5, 5);
	pixel.saveImage();
	pixel.displayImage();
}
}
