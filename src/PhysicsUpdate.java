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
			GlobalVals.getBalls().get(x).setX(GlobalVals.getBalls().get(x).getX()+10);
		}
	}
	
}
