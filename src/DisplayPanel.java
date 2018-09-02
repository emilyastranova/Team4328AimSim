import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class DisplayPanel extends JPanel implements MouseMotionListener, ActionListener {

	Robot robot = new Robot();
	Timer loop = new Timer(10, this);
	
	MouseEvent mouse;

	int mouseX = 100;
	int mouseY = 100;

	private BufferedImage image;

	public DisplayPanel() {
		setLayout(null);
		setBounds(0, 0, 1264, 578);
		loadImages();
		addMouseMotionListener(this);
		loop.start();

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// draw Robot
		int x = (int) robot.getCoordinates().getX();
		int y = (int) robot.getCoordinates().getY();
		g.drawImage(robot.image, x, y, 100, 120, this);
	}

	public void loadImages() {
		try {
			image = ImageIO.read(new File("resources/ShootingRobot.png"));
		} catch (IOException ex) {
			System.err.println(ex.getMessage());
		}
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == loop) {
			repaint();
			robot.setCoordinates(mouseX-50, mouseY-50);
		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		mouseX = e.getX();
		mouseY = e.getY();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
