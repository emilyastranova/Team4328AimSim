import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class DisplayPanel extends JPanel {

	/**
	 * Create the panel.
	 */

	private BufferedImage image;

	public DisplayPanel() {
		setLayout(null);
		setBounds(0, 0, 1264, 597);
		loadImages();
		
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		//draw Robot
		g.drawImage(image, 0, 0, 100, 120, this); // see javadoc for more info on the parameters
	}
	
	public void loadImages() {
		try {
			image = ImageIO.read(new File("resources/ShootingRobot.png"));
		} catch (IOException ex) {
			System.err.println(ex.getMessage());
		}
	}
	
}
