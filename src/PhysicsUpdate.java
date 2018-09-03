import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class PhysicsUpdate implements ActionListener {

	Timer loop = new Timer(10,this);
	double angle = 0;
	double speed = 1;
	
	public PhysicsUpdate() {
		new Thread() {
			public void run() {
				loop.start();
				
			}
		}.start();;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == loop)
		updateBalls();
	}
	
	public void updateBalls() {
		for(int x = 0; x < GlobalVals.getBalls().size(); x++) {
			Ball tempBall = GlobalVals.getBalls().get(x);
			double tempX = tempBall.getX();
			double tempY = tempBall.getY();
			tempBall.setX(tempX+Math.cos(Math.toRadians(angle))*speed);
			tempBall.setY(tempY-Math.sin(Math.toRadians(angle))*speed);
		}
	}
	
}
