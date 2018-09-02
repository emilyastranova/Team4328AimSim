import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class ImagePanel extends JPanel {

	BufferedImage image;

	public ImagePanel() {

		try {
			image = ImageIO.read(new File("resources/HorizontalLogoTrans.png"));
		} catch (IOException ex) {
			System.err.println(ex.getMessage());
		}

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 70, 0, 300, 78, this); // see javadoc for more info on the parameters
	}

}