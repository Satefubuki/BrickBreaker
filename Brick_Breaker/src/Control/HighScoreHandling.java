package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.HighScore;
import View.MyView;

public class HighScoreHandling implements ActionListener {
	public HighScoreHandling() {
		// TODO Auto-generated constructor stub
		HighScore.back.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==HighScore.back){
			MyView.fh.show();
			HighScore.fr3.dispose();
		}
	}

}
