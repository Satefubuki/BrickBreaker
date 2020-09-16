package Model;

import java.awt.Graphics;

public class MyModel {
	public static BallStrategy ball;
	public static PaddleStrategy paddle;
	public static Sound sound;
	public static Score score;
	public static Brick brick;
	
	
	public static void soundOn() {
		sound.on();
	}
	public static void soundOff() {
		sound.off();
	}
	public static void createBall() {
		BallStrategy.update();
	}
	public static void createPaddle() {
		PaddleStrategy.update();
	}
	public static void getInfor() {
		score.addPlayerName();
	}
}
