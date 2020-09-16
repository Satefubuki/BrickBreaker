package View;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class HighScore extends JFrame {
	private static Dimension dim;
	public static JFrame fr3 = new JFrame();
	High hs = new High();

	JMenuBar menuBar3 = new JMenuBar();

	public static JMenuItem back = new JMenuItem("back");

	public HighScore() {

		menuBar3.add(back);
		fr3.setJMenuBar(menuBar3);

		fr3.add(hs);

		fr3.setBounds(10, 10, 700, 700);
		fr3.setBackground(Color.white);
		fr3.setTitle("Brick Breaker");
		fr3.setDefaultCloseOperation(EXIT_ON_CLOSE);
		fr3.setResizable(false);
		// Place frame in the middle of the screen
		dim = Toolkit.getDefaultToolkit().getScreenSize();
		fr3.setLocation(dim.width / 2 - fr3.getSize().width / 2, dim.height / 2 - fr3.getSize().height / 2);
		fr3.setVisible(true);

		

	}

	
}
