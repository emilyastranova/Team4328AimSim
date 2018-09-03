import java.awt.Color;
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

	public DisplayPanel() {
		setLayout(null);
		setBounds(0, 0, 1264, 578);
		setBackground(Color.DARK_GRAY);
		addMouseMotionListener(this);
		loop.start();
		Main.vals.setRobotPosX(mouseX);
		Main.vals.setRobotPosY(mouseY);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// draw grid
		g.setColor(Color.GRAY);
		for (int x = 0; x < 1280; x+=100) {
			g.drawLine(x, 0, x, 720);
		}
		for (int y = 0; y < 720; y+=100) {
			g.drawLine(0, y, 1280, y);
		}

		// draw Robot
		int x = (int) robot.getCoordinates().getX();
		int y = (int) robot.getCoordinates().getY();
		g.drawImage(robot.image, x, y, 100, 120, this);
		
		//draw target
		g.setColor(Color.RED);
		g.fillOval(995, 95, 10, 10);
		g.drawString("TARGET", 981, 120);

		// draw balls
		for (int i = 0; i < GlobalVals.getBalls().size(); i++) {
			g.setColor(GlobalVals.getBalls().get(i).c);
			g.fillOval(GlobalVals.getBalls().get(i).getX(), GlobalVals.getBalls().get(i).getY(), 20, 20);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == loop) {
			repaint();
			robot.setCoordinates(mouseX - 50, mouseY - 50);
		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		mouseX = e.getX();
		mouseY = e.getY();

		Main.vals.setRobotPosX(mouseX);
		Main.vals.setRobotPosY(mouseY);

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
