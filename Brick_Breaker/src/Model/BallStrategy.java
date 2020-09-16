package Model;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import View.Option;

public interface BallStrategy {
	public int ballWidth = 25;
	public int ballHeight = 25;
	public int ballposX = 350;
	public int ballposY = 350;
	public static final BallStrategy ELECTRIC_BALL = new ElectricBall();
	public static final BallStrategy COLOR_BALL = new ColorBall();
	public static final BallStrategy DARK_BALL = new DarkBall();
	public static final BallStrategy SOCCER_BALL= new SoccerBall();
	
	abstract public void drawBall(Graphics g, int ballposX, int ballposY);
	
	public static void update(){
		 createBall();

	}
	
	public static String createBall() {
		int number = Option.ball;
		String res = null;
		if(number==1){
			res = "electric";
		}
		if (number==2) {
			res = "color";
		}
		if (number ==3 ) {
			res = "dark";
		}
		if (number==4) {
			res = "soccer";
		}
		return res;
		// TODO Auto-generated method stub
		
	}

	

}
