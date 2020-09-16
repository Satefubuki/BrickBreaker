package View;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import Control.MyControl;
import Game.Game;

public class FrameStart {
	public static JFrame fr2 = new JFrame();
	JMenuBar menuBar2 = new JMenuBar();

	public static JMenuItem back = new JMenuItem("Back");

	Game newgame = new Game();
	MyView fh = new MyView();

	public FrameStart() {
		menuBar2.add(back);
		fr2.setJMenuBar(menuBar2);
		fr2.add(newgame);

		fr2.setBounds(10, 10, 700, 650);
		fr2.setBackground(Color.white);
		fr2.setTitle("Brick Breaker");
		fr2.setDefaultCloseOperation(fr2.EXIT_ON_CLOSE);
		fr2.setResizable(false);
		// Place frame in the middle of the screen
		fr2.setLocationRelativeTo(null);
		fr2.setVisible(true);

	}

	public static void exit() {
		fr2.dispose();
	}

}
