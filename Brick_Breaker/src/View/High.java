package View;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import Game.Game;

public class High extends JPanel {
	Image img = Toolkit.getDefaultToolkit().createImage("image/giphy.gif");
	public static Game board = new Game();
	
	public void paint(Graphics g) {
		
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(Color.WHITE);
		
		try {
			printHighScores(g);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		repaint();
	}
	
	public void printHighScores(Graphics g) throws IOException {
		
		g.drawImage(img, 0, 0, 700, 700, this);
		repaint();
		try {
			g.setColor(Color.BLACK);
			g.drawString("TOP 10 PLAYERS RANKING", 275, 25);
			board.printScores(g);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		repaint();
	}
	
}
