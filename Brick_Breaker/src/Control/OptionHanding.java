package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.BallStrategy;
import Model.MyModel;
import Model.PaddleStrategy;
import Model.Sound;
import View.Option;

public class OptionHanding implements ActionListener{
	public OptionHanding(){
		solve();
	}
	public void solve() {
		Option.dark.addActionListener(this);
		Option.electric.addActionListener(this);
		Option.color.addActionListener(this);
		Option.soccer.addActionListener(this);
		Option.blue.addActionListener(this);
		Option.white.addActionListener(this);
		Option.pink.addActionListener(this);
		Option.ok.addActionListener(this);
		Option.off.addActionListener(this);
		Option.on.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==Option.electric){
			Option.ball =1;
			MyModel.createBall();
			}
		if(e.getSource()==Option.color){
			Option.ball =2;
			MyModel.createBall();
		}
	
		if(e.getSource()==Option.dark){
			Option.ball =3;
			MyModel.createBall();
		}
	
		if(e.getSource()==Option.soccer){
			Option.ball =4;
			MyModel.createBall();
		}
		
		if(e.getSource()==Option.blue){
			Option.paddle =1;
			MyModel.createPaddle();
		}
		if(e.getSource()==Option.white){
			Option.paddle =2;
			MyModel.createPaddle();
		}
		if(e.getSource()==Option.pink){
			MyModel.createPaddle();
			PaddleStrategy.update();
		}
		if(e.getSource()== Option.off){
			MyModel.soundOff();
		}
		if(e.getSource()==Option.on){
			MyModel.soundOn();
		}
	}
}
