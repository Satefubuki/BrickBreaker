package Model;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Random;

public class Brick {
	
	public int brick[][];
	public int brickWidth;
	public int brickHeight;
	static Image brickImage = Toolkit.getDefaultToolkit().createImage("image/freezebrick.gif");

	public Brick(int row, int col) {
		brick = new int[row][col];
		for (int i = 0; i < brick.length; i++) {
			for (int j = 0; j < brick[0].length; j++) {
				brick[i][j] = 1;

			}
		}
		brickWidth = 540 / col;
		brickHeight = 150 / row;

	}

	public void draw(Graphics2D g) {
		for (int i = 0; i < brick.length; i++) {
			for (int j = 0; j < brick[0].length; j++) {
				
				if (brick[i][j] > 0) {
					//g.setColor(color);
					//g.setColor(Color.blue);
					
					g.fillRect(j * brickWidth + 80, i * brickHeight + 50,
							brickWidth, brickHeight);
					g.drawImage(brickImage, j * brickWidth+80, i * brickHeight+50, brickWidth, brickHeight, null);
					g.setStroke(new BasicStroke(3));
					
					g.setColor(Color.WHITE);
					g.drawRect(j * brickWidth + 80, i * brickHeight + 50,
							brickWidth, brickHeight);
				}

			}

		}
	}

	public void setBrickvalue(int value, int row, int col) {
		brick[row][col] = value;
	}
}
