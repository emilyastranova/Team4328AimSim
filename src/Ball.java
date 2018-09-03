import java.awt.Color;

public class Ball {

	double x = 0;
	double y = 0;
	Color c = null;
	
	public Ball(int x, int y, Color c) {
		this.x = x;
		this.y = y;
		this.c = c;
		
		System.out.println("Ball created at: " + x +", " + y);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
}
