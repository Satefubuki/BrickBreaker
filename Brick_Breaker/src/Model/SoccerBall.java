package Model;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class SoccerBall implements BallStrategy{
	static Image ballImage = Toolkit.getDefaultToolkit().createImage("image/ball3.gif");
	@Override
	public void drawBall(Graphics g,  int ballposX, int ballposY) {
		// TODO Auto-generated method stub
		g.drawImage(ballImage, ballposX, ballposY,ballWidth, ballHeight, null);
	}

}
