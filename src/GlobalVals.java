import java.util.ArrayList;

public class GlobalVals {

	int robotPosX = 0;
	int robotPosY = 0;
	
	static ArrayList<Ball> balls = new ArrayList<Ball>();
	
	public GlobalVals() {
		
	}
	
	public int getRobotPosX() {
		return robotPosX;
	}

	public void setRobotPosX(int robotPosX) {
		this.robotPosX = robotPosX;
	}
	
	public int getRobotPosY() {
		return robotPosY;
	}

	public void setRobotPosY(int robotPosy) {
		this.robotPosY = robotPosy;
	}

	public static ArrayList<Ball> getBalls() {
		return balls;
	}
	
	public static void addBall(Ball b) {
		balls.add(b);
	}

	
}
