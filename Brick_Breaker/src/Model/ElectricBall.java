package Model;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;


public class ElectricBall implements BallStrategy {
//	private int x;
//	private int y;
	static Image ballImage = Toolkit.getDefaultToolkit().createImage("image/ball.gif");
	
	
	


//	public int getX() {
//		return x;
//	}
//
//
//	public int getY() {
//		return y;
//	}


	public void drawBall(Graphics g,  int ballposX, int ballposY) {
		//Image ballImage = Toolkit.getDefaultToolkit().createImage("ball2.gif");
//		g.setColor(Color.WHITE);
//		g.fillOval(ballposX, ballposY, 20, 20);
		g.drawImage(ballImage, ballposX, ballposY, ballWidth, ballHeight,null);
		

	}




	
}