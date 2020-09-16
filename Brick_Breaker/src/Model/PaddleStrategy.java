package Model;

import java.awt.Graphics;

import Game.Game;
import View.Option;

public interface PaddleStrategy {
	public int playerY = 550;
	public int width = 120;
	public int height = 20;
	public static final PaddleStrategy PINK_PADDLE = new PinkPaddle();
	public static final PaddleStrategy BLUE_PADDLE = new BluePaddle();
	public static final PaddleStrategy WHITE_PADDLE = new WhitePaddle();

	public abstract void drawPaddle(Graphics g, int playerX);

	

	public static void update() {
		// TODO Auto-generated method stub
		createPaddle();
		
	}

	public static String createPaddle() {
		// TODO Auto-generated method stub
		int number = Option.paddle;
		String res = null;
		if(number==1){
			res = "blue";
		}
		if (number==2) {
			res = "white";
		}
		if (number ==3 ) {
			res = "pink";
		}
		return res;
	}

}
