package Model;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class PinkPaddle implements PaddleStrategy{
	static Image image = Toolkit.getDefaultToolkit().createImage("image/paddle2.png");
	@Override
	public void drawPaddle(Graphics g, int playerX) {
		// TODO Auto-generated method stub
		g.drawImage(image, playerX, playerY,width, height,null);
	}

}
