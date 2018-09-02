import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Robot {

	public BufferedImage image;
	int x = 0;
	int y = 0;
	
	public Robot() {
		   try {                
		          image = ImageIO.read(new File("resources/ShootingRobot.png"));
		       } catch (IOException ex) {
		           System.err.println(ex.getMessage());
		       }
	}
	
	public Point getCoordinates() {
		return new Point(x,y);
	}
	
	public void setCoordinates(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}
