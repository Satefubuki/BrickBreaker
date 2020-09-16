package Control;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import Game.Game;
import Model.BallStrategy;
import Model.MyModel;
import Model.Score;
import Model.Sound;
import View.MyView;
import View.FrameStart;
import View.HighScore;
import View.Option;
import View.Structure;

public class MyControl implements MouseListener {
	MyView home = new MyView();
	OptionHanding oh;
	FrameStartHandling fh;
	HighScoreHandling hh;

	public MyControl() {
		oh = new OptionHanding();
		fh = new FrameStartHandling();
		hh = new HighScoreHandling();
		home.newGame.addMouseListener(this);
		home.option.addMouseListener(this);
		home.highScore.addMouseListener(this);
		home.structure.addMouseListener(this);
		home.about.addMouseListener(this);
		home.out.addMouseListener(this);

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		// out.setIcon(Option.load("nor.png", 60, 60));
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == home.out) {
			home.out.setIcon(Option.load("image/press.png", 60, 60));
			home.exit();
		}
		if (e.getSource() == home.newGame) {
			// home.newGame.setIcon(Option.load("newgame2.png", 250, 250));
			new FrameStart();
			home.fh.hide();
			MyModel.getInfor();
		}
		if (e.getSource() == home.structure) {
			// home.structure.setIcon(Option.load("structure2.png", 170, 170));
			Structure structure;
			Structure.createStructure();
		}
		if (e.getSource() == home.option) {
			// home.option.setIcon(Option.load("option2.png", 170, 170));
			Option.createOption();
		}
		if (e.getSource() == home.highScore) {
			// home.highScore.setIcon(Option.load("highscore2.png", 170, 170));
			new HighScore();
			home.fh.dispose();
		}
		if (e.getSource() == home.about) {
			// home.about.setIcon(Option.load("about2.png", 170, 170));
			JOptionPane.showMessageDialog(null, "OOD-01\nGV:Tran Thi Thanh Nga");
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == home.out) {
			home.out.setIcon(Option.load("image/nor.png", 60, 60));
		}
		if (e.getSource() == home.newGame) {
			home.newGame.setIcon(Option.load("image/newgame1.png", 250, 250));
		}
		if (e.getSource() == home.structure) {
			home.structure.setIcon(Option.load("image/structure1.png", 170, 170));
		}
		if (e.getSource() == home.option) {
			home.option.setIcon(Option.load("image/option1.png", 170, 170));
		}
		if (e.getSource() == home.highScore) {
			home.highScore.setIcon(Option.load("image/highscore1.png", 170, 170));
		}
		if (e.getSource() == home.about) {
			home.about.setIcon(Option.load("image/about1.png", 170, 170));
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == home.out) {
			home.out.setIcon(Option.load("image/move.png", 60, 60));
		}
		if (e.getSource() == home.newGame) {
			home.newGame.setIcon(Option.load("image/newgame2.png", 250, 250));
		}
		if (e.getSource() == home.structure) {
			home.structure.setIcon(Option.load("image/structure2.png", 170, 170));
		}
		if (e.getSource() == home.option) {
			home.option.setIcon(Option.load("image/option2.png", 170, 170));

		}
		if (e.getSource() == home.highScore) {
			home.highScore.setIcon(Option.load("image/highscore2.png", 170, 170));
		}
		if (e.getSource() == home.about) {
			home.about.setIcon(Option.load("image/about2.png", 170, 170));
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}
}