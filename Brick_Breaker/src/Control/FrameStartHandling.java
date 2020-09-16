package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.MyModel;
import View.FrameStart;
import View.MyView;

public class FrameStartHandling implements ActionListener{
	public FrameStartHandling() {
		// TODO Auto-generated constructor stub
		FrameStart.back.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== FrameStart.back){
			MyView.fh.show();
			FrameStart.fr2.dispose();
		}
	}

}
