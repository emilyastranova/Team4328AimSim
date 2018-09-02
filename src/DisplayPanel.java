import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class DisplayPanel extends JPanel {

	//make invisible cursor
	BufferedImage cursorImg = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);
	Cursor blankCursor = Toolkit.getDefaultToolkit().createCustomCursor(cursorImg, new Point(0, 0), "blank cursor");
	int x = 0;
	int y = 0;
	
	private BufferedImage image;

	public DisplayPanel() {
		setLayout(null);
		setBounds(0, 0, 1264, 597);
		//use invisible cursor
		setCursor(blankCursor);
		loadImages();
		
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		//draw Robot
		g.drawImage(image, x - 50, y - 60, 100, 120, this);
	}
	
	public void loadImages() {
		try {
			image = ImageIO.read(new File("resources/ShootingRobot.png"));
		} catch (IOException ex) {
			System.err.println(ex.getMessage());
		}
	}
	
	public void mouseMoved(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		repaint();
	}
	
}
