package Control;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;

import javax.swing.JOptionPane;
import javax.swing.Timer;

import Game.Game;
import Model.PaddleStrategy;
import Model.Score;
import View.MyView;
import View.FrameStart;
	
public class KeyHandling implements KeyListener{	
	Game game;
	
public KeyHandling() {
		game = new Game();
	}

//	public KeyHandling() {
//		// TODO Auto-generated constructor stub
//		game = new Game();
	//	game.addKeyListener(this);
//	}
	@Override
	public void keyPressed(KeyEvent e) {
		
				int key = e.getKeyCode();
				switch (key) {
				case KeyEvent.VK_LEFT:
					game.moveLeft();
					
					if (game.playerX < 10) {
						game.playerX = 10;
					} 
					break;
				case KeyEvent.VK_RIGHT:
					if (game.playerX >= 580) {
						game.playerX = 580;
					} else {
						game.moveRight();
					}
					break;
				case KeyEvent.VK_BACK_SPACE:
					MyView.fh.show();
					break;
				case KeyEvent.VK_SPACE:
					if (game.timer.isRunning()) {
						game.timer.stop();
					} else {
						game.timer.start();
					}
						
				default:
					
					break;
				}
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	

}
