import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class PhysicsUpdate implements ActionListener {

	Timer loop = new Timer(10,this);
	
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
			int tempX = tempBall.getX();
			int tempY = tempBall.getY();
			tempBall.setX(tempX+10);
			tempBall.setY(tempY-5);
		}
	}
	
}
