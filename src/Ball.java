import java.awt.Color;

public class Ball {

	int x = 0;
	int y = 0;
	Color c = null;
	
	public Ball(int x, int y, Color c) {
		this.x = x;
		this.y = y;
		this.c = c;
		
		System.out.println("Ball created at: " + x +", " + y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}
