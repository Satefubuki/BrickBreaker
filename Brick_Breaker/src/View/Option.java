package View;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import Control.OptionHanding;
import Model.BallStrategy;

public class Option{
	public static JFrame optionFrame = new JFrame();
	private static Option option;
	public static JRadioButton dark = new JRadioButton();
	public static JRadioButton color  = new JRadioButton();
	public static JRadioButton electric = new JRadioButton();
	public static JRadioButton soccer  = new JRadioButton();
	public static JRadioButton blue = new JRadioButton();
	public static JRadioButton white = new JRadioButton();
	public static JRadioButton pink = new JRadioButton();
	public static JRadioButton on = new JRadioButton();
	public static JRadioButton off = new JRadioButton();
	ButtonGroup bg = new ButtonGroup();
	ButtonGroup bg1 = new ButtonGroup();
	ButtonGroup bg2 = new ButtonGroup();
	JPanel ballPanel = new JPanel();
	JPanel paddlePanel = new JPanel();
	JPanel musicPanel = new JPanel();
	JPanel panel = new JPanel();
	JLabel el = new JLabel();
	JLabel cl = new JLabel();
	JLabel sl = new JLabel();
	JLabel dl = new JLabel();
	JLabel b = new JLabel();
	JLabel r = new JLabel();
	JLabel p = new JLabel();
	JLabel op = new JLabel();
	JLabel of = new JLabel();
	public static JButton ok = new JButton("OK");
	public static int paddle = 1;
	public static int ball = 1;
	
	public Option(){
		optionFrame.setLayout(new GridLayout(3,1));
		optionFrame.setTitle("Option");
		bg.add(color);
		bg.add(dark);
		bg.add(electric);
		bg.add(soccer);
		electric.setSelected(true);
		ballPanel.add(electric);
		el.setIcon(load("image/ball.gif", 20, 20));
		ballPanel.add(el);
		ballPanel.add(color);
		cl.setIcon(load("image/ball1.gif", 20, 20));
		ballPanel.add(cl);
		ballPanel.add(dark);
		dl.setIcon(load("image/ball2.gif", 20, 20));
		ballPanel.add(dl);
		ballPanel.add(soccer);
		sl.setIcon(load("image/ball3.gif", 20, 20));
		ballPanel.add(sl);
		ballPanel.setLayout(new GridLayout());
		ballPanel.setBorder(BorderFactory.createTitledBorder("Ball"));
		optionFrame.add(ballPanel);
		bg1.add(blue);
		bg1.add(white);
		bg1.add(pink);
		blue.setSelected(true);
		paddlePanel.add(blue);
		b.setIcon(load("image/paddle.png", 75, 25));
		paddlePanel.add(b);
		paddlePanel.add(white);
		r.setIcon(load("image/paddle1.png", 75, 25));
		paddlePanel.add(r);
		paddlePanel.add(pink);
		p.setIcon(load("image/paddle2.png", 75, 25));
		paddlePanel.add(p);
		paddlePanel.setLayout(new GridLayout());
		paddlePanel.setBorder(BorderFactory.createTitledBorder("Paddle"));
		optionFrame.add(paddlePanel);
		bg2.add(on);
		bg2.add(off);
		off.setSelected(true);
		musicPanel.add(off);
		musicPanel.add(of);
		of.setIcon(load("image/off.png", 40, 40));
		musicPanel.add(on);
		musicPanel.add(op);
		op.setIcon(load("image/on.png", 40, 40));
		musicPanel.setLayout(new GridLayout());
		musicPanel.setBorder(BorderFactory.createTitledBorder("Music"));
		optionFrame.add(musicPanel);
		
		optionFrame.setSize(500, 500);
		optionFrame.setLocationRelativeTo(null);
		optionFrame.setResizable(false);
		optionFrame.setVisible(true);
		optionFrame.setDefaultCloseOperation(optionFrame.HIDE_ON_CLOSE);
	}
	public static Icon load(String linkImage, int k, int m) {/*linkImage là tên icon, k kích thước chiều rộng mình muốn,m chiều dài và hàm này trả về giá trị là 1 icon.*/
	    try {
	        BufferedImage image = ImageIO.read(new File(linkImage));
	 
	        int x = k;
	        int y = m;
	        int ix = image.getWidth();
	        int iy = image.getHeight();
	        int dx = 0, dy = 0;
	 
	        if (x / y > ix / iy) {
	            dy = y;
	            dx = dy * ix / iy;
	        } else {
	            dx = x;
	            dy = dx * iy / ix;
	        }
	 
	        return new ImageIcon(image.getScaledInstance(dx, dy,
	                image.SCALE_SMOOTH));
	 
	    } catch (IOException e) {
	 
	        e.printStackTrace();
	    }
	    return null;
	}
	
	public static Option createOption() {
		if(option == null){
			option = new Option();
	}
		option.optionFrame.show();
		option.optionFrame.setLocationRelativeTo(null);
		return option;
		
	
	}
	
}
