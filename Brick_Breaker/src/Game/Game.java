package Game;

//import Item;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.awt.image.ImageObserver;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.xml.ws.handler.MessageContext.Scope;

import Control.KeyHandling;
import Model.BallStrategy;
import Model.Brick;
import Model.MyModel;
import Model.PaddleStrategy;
import Model.Score;
import Model.Sound;
import View.FrameStart;
import View.Option;

public class Game extends JPanel{

	public static KeyHandling key = new KeyHandling();
	public static final int MAX_LIVES = 3;
	public static final int MIN_LIVES = 0;
	public int TotalBrick;
	public int xSpeed;
	private PaddleStrategy paddle = MyModel.paddle;
	private BallStrategy ball = MyModel.ball;
	public static boolean play = false;
	public Timer timer;
	public static int playerX = 310;
	public int ballposX = ball.ballposX;
	public int ballposY = ball.ballposY;
	public int ballXdir = -1;
	public int ballYdir = -1;
	private Brick brick = MyModel.brick;
	private int lives = MAX_LIVES;
	public static int level = 1;

	// private AtomicBoolean isPaused = new AtomicBoolean(true);
	private int score = 0;
	Image img = Toolkit.getDefaultToolkit().createImage("image/background.gif");
	Image img1 = Toolkit.getDefaultToolkit().createImage("image/snow.png");
	public Game() {
		addKeyListener(key);
		repaint();
		brick = new Brick(2, 2);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		timer = new Timer(3, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				running();
			}
		});
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if (e.getKeyCode() == KeyEvent.VK_SPACE) {
					if (timer.isRunning()) {
						timer.stop();
					} else {
						timer.start();
					}

				}
			}
		});
		timer.start();

	}

	public void paint(Graphics g) {

		// g.setColor(Color.BLACK);
		g.fillRect(1, 1, 700, 700);
		g.drawImage(img, 0, 0, 700, 700, null);

		// make a brick
		brick.draw((Graphics2D) g);
		// borders
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 3, 600);
		g.fillRect(0, 0, 693, 3);
		g.fillRect(691, 0, 30, 600);

		//

		// score
		g.setColor(Color.BLUE);
		// g.drawString("Score: " + score, 10, getHeight()
		g.drawString("Lives: " + lives, 10, 560);
		g.drawString("Score: " + score, 10, 540);
		g.drawString("Level: " + level, 10, 520);
		g.drawString("Player: " + Score.getPlayerName(), 10, 500);
		g.drawString("Press Space Bar to pause/resume", 10, 580);
		// paddle.drawPanddle(g, playerX);

		if (PaddleStrategy.createPaddle().equals("blue")) {
			paddle.BLUE_PADDLE.drawPaddle(g, playerX);
		}
		if (PaddleStrategy.createPaddle().equals("white")) {
			paddle.WHITE_PADDLE.drawPaddle(g, playerX);
		}
		if (PaddleStrategy.createPaddle().equals("pink")) {
			paddle.PINK_PADDLE.drawPaddle(g, playerX);
		}
		// the ball

		if (BallStrategy.createBall().equals("electric")) {
			ball.ELECTRIC_BALL.drawBall(g, ballposX, ballposY);
		}
		if (BallStrategy.createBall().equals("color")) {
			ball.COLOR_BALL.drawBall(g, ballposX, ballposY);
		}
		if (BallStrategy.createBall().equals("dark")) {
			ball.DARK_BALL.drawBall(g, ballposX, ballposY);
		}
		if (BallStrategy.createBall().equals("soccer")) {
			ball.SOCCER_BALL.drawBall(g, ballposX, ballposY);
		}

		if (score == 20) {
			play = true;
			ballposX = 350;
			ballposY = 350;
			ballSpeed();
			playerX = 310;

			brick = new Brick(3, 3);
			level++;
			timer.stop();
			score += 100;
			repaint();
			// brickLeft = MAX_BRICK;

		}
		// level 3
		if (score == 165) {
			play = true;
			ballposX = 350;
			ballposY = 350;
			ballSpeed();
			playerX = 310;
			// brickLeft = MAX_BRICK;
			brick = new Brick(4, 4);
			level++;
			timer.stop();
			score += 100;
			repaint();

		}
		if (score == 345) {
			play = true;
			ballposX = 350;
			ballposY = 350;
			ballSpeed();
			playerX = 310;
			// brickLeft = MAX_BRICK;
			brick = new Brick(5, 5);
			level++;
			timer.stop();
			score += 100;
			repaint();

		}
		if (score == 570) {
			play = true;
			ballposX = 350;
			ballposY = 350;
			ballSpeed();
			playerX = 310;
			// brickLeft = MAX_BRICK;
			brick = new Brick(6, 6);
			level++;
			timer.stop();
			score += 100;
			repaint();

		}
		if (score == 850) {
			play = true;
			ballposX = 350;
			ballposY = 350;
			ballSpeed();
			playerX = 310;
			// brickLeft = MAX_BRICK;
			brick = new Brick(7, 7);
			level++;
			timer.stop();
			score += 100;
			repaint();
			JOptionPane.showMessageDialog(null, "You Win");
			play = false;
			timer.stop();

			g.setColor(Color.BLACK);

			g.fillRect(0, 0, getWidth(), getHeight());
			g.setColor(Color.WHITE);
			g.drawString("Name: " + Score.getPlayerName() + ", Score: " + score + ", Level: " + level, getWidth() / 5,
					20);
			// g.drawString(
			// "Game Over! Did you make it onto the high score table?",
			// getWidth() / 5, 50);
			try {
				printScores(g);
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
			// g.drawString("Press the ESC to play again.", getWidth() / 5,
			// getHeight() - 20);

		}

		if (ballposY > 570) {
			if (lives > 0) {
				play = true;
				ballSpeed();
				ballposX = 350;
				ballposY = 350;
				lives--;
				timer.stop();

			} else if (lives == 0) {
				play = false;
				timer.stop();

				repaint();
				//g.fillRect(0, 0, getWidth(), getHeight());
				g.drawImage(img1, 0, 0, 700, 700, null);
				g.setColor(Color.BLACK);
				g.drawString("Name: " + Score.getPlayerName() + ", Score: " + score + ", Level: " + level,
						getWidth() / 5, 20);

				try {
					printScores(g);
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}
				g.drawString("Press the Backspace to play again.", getWidth() / 5, getHeight() - 20);

			}
		}
		g.dispose();

	}

	public void ballSpeed() {
		// TODO Auto-generated method stub
		if (level == 1) {
			ballXdir = -1;
			ballYdir = -1;
		}
		if (level == 2) {
			ballXdir = -1;
			ballYdir = -2;
		}
		if (level == 3) {
			ballXdir = -2;
			ballYdir = -2;
		}
		if (level == 4) {
			ballXdir = -2;
			ballYdir = -3;
		}
		if (level == 5) {
			ballXdir = -3;
			ballYdir = -3;
		}
		if (level == 6) {
			ballXdir = -3;
			ballYdir = -4;
		}

	}

	public void running() {

		// timer.start();

		if (play) {

			if (new Rectangle(ballposX, ballposY, ball.ballWidth, ball.ballHeight)
					.intersects(new Rectangle(playerX, paddle.playerY, paddle.width, paddle.height))) {// 8=20
				ballYdir = -ballYdir;
			}

			A: for (int i = 0; i < brick.brick.length; i++) {
				for (int j = 0; j < brick.brick[0].length; j++) {
					if (brick.brick[i][j] > 0) {
						int brickX = j * brick.brickWidth + 80;
						int brickY = i * brick.brickHeight + 50;
						int brickWidth = brick.brickWidth;
						int brickHeight = brick.brickHeight;
						Rectangle rect = new Rectangle(brickX, brickY, brickWidth, brickHeight);
						Rectangle ballRect = new Rectangle(ballposX, ballposY, 20, 20);
						Rectangle brickRect = rect;
						if (ballRect.intersects(brickRect)) {

							brick.setBrickvalue(0, i, j);
							TotalBrick--;
							score += 5;
							if (ballposX + 19 <= brickRect.x || ballposX + 1 >= brickRect.x + brickRect.width) {
								ballXdir = -ballXdir;

							} else {
								ballYdir = -ballYdir;

							}
							if (Sound.isSound()) {
								Sound.playSound("hit_sound.wav");
							}
							if (Sound.isSound()) {
							}
							break A;
						}

					}
				}
			}
			ballposX += ballXdir;
			ballposY += ballYdir;

			if (ballposX < 0) {
				ballXdir = -ballXdir;
			}
			if (ballposY < 0) {
				ballYdir = -ballYdir;
			}
			if (ballposX > 670) {
				ballXdir = -ballXdir;
			}
		}
		repaint();

	}

//	@Override
//	public void keyPressed(KeyEvent e) {
		// if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
		// if (playerX >= 600) {
		// playerX = 600;
		// } else {
		// moveRight();
		//
		// }
		// }
		// if (e.getKeyCode() == KeyEvent.VK_ENTER) {
		// if (!play) {
		// play = true;
		// ballposX = 350;
		// ballposY = 350;
		// ballXdir = -1;
		// ballYdir = -2;
		// playerX = 350;
		// if (level == 1) {
		// score = 0;
		// brick = new Brick(2, 2);
		// }
		// if (level == 2) {
		// score = 120;
		// brick = new Brick(2, 4);
		// }
		// if (level == 3) {
		// score = 260;
		// brick = new Brick(4, 4);
		// }
		// if (lives == 0) {
		// play = true;
		// ballposX = 350;
		// ballposY = 350;
		// ballXdir = -1;
		// ballYdir = -2;
		// playerX = 350;
		// brick = new Brick(2, 2);
		// // score=0;
		//
		// }

		// repaint();
		//
		// }
		//
		// }

		// if (e.getKeyCode() == KeyEvent.VK_LEFT) {
		// if (playerX < 10) {
		// playerX = 10;
		// } else {
		// moveLeft();
		// }

		// }
		// pause game
		
		// if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
		// Game game = new Game();
		// FrameStart fr = new FrameStart();
		// fr.add(game).setVisible(true);
		// Score.addPlayerName();
		// }

//	}

	// starts the thread
	// public void start() {
	// game.resume();
	// isPaused.set(false);
	// }

	// stops the thread
	// public void stop() {
	// game.suspend();
	// }
	//
	// // ends the thread
	// public void destroy() {
	// game.resume();
	// isPaused.set(false);
	// game.stop();
	// isPaused.set(true);
	// }

	public static void moveRight() {
		play = true;
		if (level <= 2) {
			playerX += 20;
		}
		if (level > 2 && level <= 4) {
			playerX += 35;
		}
		if (level > 4) {
			playerX += 50;
		}
	}

	public static void moveLeft() {
		play = true;
		if (level <= 2) {
			playerX -= 20;
		}
		if (level > 2 && level <= 4) {
			playerX -= 35;
		}
		if (level > 4) {
			playerX -= 50;
		}
	}

	// fills the board

	// Makes sure the HighScores.txt file exists
	public void makeTable() throws IOException {
		String filename = "HighScores";
		File f = new File(filename + ".txt");
		if (f.createNewFile()) {
			try {
				writeFakeScores();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		} else {
			// do nothing
		}
	}

	// if there was no previous high score table, this one inputs 10 fake
	// players and scores to fill it????
	public void writeFakeScores() throws IOException {
		Random rand = new Random();

		int numLines = 10;
		File f = new File("HighScores.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(f.getAbsoluteFile()));
		for (int i = 1; i <= numLines; i++) {
			int score = rand.nextInt(2000);
			if (numLines - i >= 1) {
				bw.write("Name: " + "Player" + i + ", " + "Score: " + score + "\n");
			} else {
				bw.write("Name: " + "Player" + i + ", " + "Score: " + score + "\n");
			}
		}
		bw.close();
		try {
			sortTable();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	// Returns the player's name and score formatted correctly
	public String playerInfo() {
		return "Name: " + MyModel.score.getPlayerName() + ", Score: " + score;
	}

	// returns the number of lines in the high score file
	public int linesInFile(File f) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(f.getAbsoluteFile()));
		int lines = 0;
		while (br.readLine() != null) {
			lines++;
		}
		br.close();
		return lines;
	}

	// Add game to high score file by appending it and getting line number from
	// previous method
	public void saveGame() throws IOException {
		File f = new File("HighScores.txt");
		FileWriter fw = new FileWriter(f.getAbsoluteFile(), true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.append("\n" + playerInfo());
		bw.close();
	}

	// sorts the high score table high to low using maps and other fun things
	public void sortTable() throws IOException {
		File f = new File("HighScores.txt");
		File temp = new File("temp.txt");
		TreeMap<Integer, ArrayList<String>> topTen = new TreeMap<Integer, ArrayList<String>>();
		BufferedReader br = new BufferedReader(new FileReader(f.getAbsoluteFile()));
		BufferedWriter bw = new BufferedWriter(new FileWriter(temp.getAbsoluteFile()));

		String line = null;
		while ((line = br.readLine()) != null) {
			if (line.isEmpty()) {
				continue;
			}
			String[] scores = line.split("Score: ");
			Integer score = Integer.valueOf(scores[1]);
			ArrayList<String> players = null;

			// make sure two players with same score are dealt with
			if ((players = topTen.get(score)) == null) {
				players = new ArrayList<String>(1);
				players.add(scores[0]);
				topTen.put(Integer.valueOf(scores[1]), players);
			} else {
				players.add(scores[0]);
			}

		}

		for (Integer score : topTen.descendingKeySet()) {
			for (String player : topTen.get(score)) {
				try {
					bw.append(player + "Score: " + score + "\n");
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}
			}
		}
		br.close();
		bw.close();
		try {
			makeNewScoreTable();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	// save the sorted table to the high score file
	public void makeNewScoreTable() throws IOException {
		File f = new File("HighScores.txt");
		File g = new File("temp.txt");
		f.delete();
		g.renameTo(f);
	}

	// Print the top 10 scores, but first excecutes all other file-related
	// methods
	public void printScores(Graphics g) throws IOException {
		try {
			makeTable();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		try {
			saveGame();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		try {
			sortTable();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		int h = 50;// 100
		File fileToRead = new File("HighScores.txt");
		LineNumberReader lnr = new LineNumberReader(new FileReader(fileToRead));
		String line = lnr.readLine();
		while (line != null && lnr.getLineNumber() <= 10) {
			int rank = lnr.getLineNumber();
			g.drawString(rank + ". " + line, getWidth() / 5, h);
			h += 50;
			line = lnr.readLine();
		}
		lnr.close();
	}

//	@Override
//	public void keyReleased(KeyEvent arg0) {
//
//	}
//
//	@Override
//	public void keyTyped(KeyEvent arg0) {
//		// TODO Auto-generated method stub
//
//	}
	// public static void transfer() {
	// if (playerX < 10) {
	// playerX = 10;
	// } else {
	// moveLeft();
	// }
	// }

	
}
