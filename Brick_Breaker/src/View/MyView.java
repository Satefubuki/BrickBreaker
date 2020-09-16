package View;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.ResourceBundle.Control;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.plaf.MenuBarUI;

import Control.MyControl;
import Game.Game;
import Model.BallStrategy;

public class MyView {
	public static JFrame fh = new JFrame();
	public static MyControl EventHandling = new MyControl();
	private int score;
	public HomePanel panel = new HomePanel(new ImageIcon("image/1234.jpg"));
//	public static JButton ng, about, struc,  high, exit, option;
	public JLabel out = new JLabel(Option.load("image/nor.png", 60, 60));
	public JLabel newGame = new JLabel(Option.load("image/newgame1.png", 300, 300));
	public JLabel structure = new JLabel(Option.load("image/structure1.png", 170, 170));
	public JLabel highScore = new JLabel(Option.load("image/highscore1.png", 170, 170));
	public JLabel about = new JLabel(Option.load("image/about1.png", 170, 170));
	public JLabel option = new JLabel(Option.load("image/option1.png", 170, 170));
	

	//public JFrame fr1 = new JFrame();
	Image img;
	
	public MyView() {
		//FrameStart.playSound("menu.wav");
		
		Game game;
		panel.setLayout(null);
		panel.setOpaque(true);
		panel.add(out);
		out.addMouseListener(EventHandling);
		out.setBounds(600, 580, 60, 60);
		panel.add(newGame);
		newGame.setBounds(240, 250, 250, 250);
		newGame.addMouseListener(EventHandling);
		panel.add(structure);
		structure.setBounds(50, 370, 170, 170);
		structure.addMouseListener(EventHandling);
		panel.add(about);
		about.setBounds(510, 370, 170, 170);
		about.addMouseListener(EventHandling);
		panel.add(highScore);
		highScore.setBounds(190, 480, 170, 170);
		highScore.addMouseListener(EventHandling);
		panel.add(option);
		option.setBounds(370, 480, 170, 170);
//		panel.add(highScore);
//		panel.add(about);
//		panel.add(ng = new JButton("New Game"));
//		ng.setBounds(220, 340, 270, 58);
//		ng.setIcon(new ImageIcon("bnewgame.gif"));
//		panel.add(struc = new JButton("Structure"));
//		struc.setIcon(new ImageIcon("bstructure.gif"));
//		struc.setBounds(220, 400, 270, 58);
//		panel.add(high = new JButton("High Score"));
//		high.setIcon(new ImageIcon("bhighscore.gif"));
//		high.setBounds(220, 460, 270, 58);
//		panel.add(about = new JButton("About"));
//		about.setIcon(new ImageIcon("babout.gif"));
//		about.setBounds(220, 580, 270, 58);
//		//panel.add(exit = new JButton("exit"));
//		//exit.setBounds(600, 580, 60, 60);
//		//exit.setIcon(new ImageIcon("bexit.gif"));
//		panel.add(option = new JButton("Option"));
//		option.setIcon(new ImageIcon("boption.gif"));
//		option.setBounds(220, 520, 270, 58);
//		
		

		 fh.add(panel);
		 fh.setBounds(10, 10, 700, 700);
		 fh.setBackground(Color.BLACK);
		 fh.setTitle("Brick Breaker");
		 fh.setDefaultCloseOperation( fh.EXIT_ON_CLOSE);
		 fh.setResizable(false);
		// Place frame in the middle of the screen
		 fh.setLocationRelativeTo(null);
		 fh.setVisible(true);
	}

	 class HomePanel extends JPanel {
		private ImageIcon mi;

		public HomePanel(ImageIcon mi) {
			this.mi = mi;

		}

		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(mi.getImage(), 0, 0, 700, 700, this);
		}
	}


	
	public static void exit() {

		//String[] exit = { "Yes", "No" };
		int question = JOptionPane.showConfirmDialog(null, "Do you want exit game?", "Exit", JOptionPane.YES_NO_OPTION);
		if (question == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}


	public static void main(String[] args) {
		new MyView();
	}
}