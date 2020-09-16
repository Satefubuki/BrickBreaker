package Model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyListener;

public class BluePaddle implements PaddleStrategy{
//	private static int x = 240;
//	static int y = 430;
//	private static int PaddleX;
//	private static int PaddleY;
//	private int xSpeed;
	static Image paddleImage = Toolkit.getDefaultToolkit().createImage("image/paddle.png");
//	public Paddle(int x, int y, int paddleX, int paddleY, Color color) {
//		super();
//
//		PaddleX = paddleX;
//		PaddleY = paddleY;
//		
//	}

	public void drawPaddle(Graphics g, int playerX) {
//		g.setColor(color.BLUE);
//		g.fillRect(playerX, 550, 100, 10);
		g.drawImage(paddleImage, playerX, playerY,width, height,null);
		
	}

}
