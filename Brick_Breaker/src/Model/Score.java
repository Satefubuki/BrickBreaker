package Model;


import javax.swing.JOptionPane;

public class Score {
	private static String playerName;
	private static int score = 0;

	public static String getPlayerName() {
		return playerName;
	}

	public static int getScore() {
		return score;
	}

	// get player name
	public static void addPlayerName() {
		playerName = JOptionPane.showInputDialog(null,
				"Please enter your name:", "Brick Breaker_Group01-2018",
				JOptionPane.QUESTION_MESSAGE);
		if (playerName == null) {
			System.exit(0);
		}
		if (playerName.toUpperCase().equals("TY")
				|| playerName.toUpperCase().equals("TYKELLEY")
				|| playerName.toUpperCase().equals("TYLUCAS")
				|| playerName.toUpperCase().equals("TYLUCASKELLEY")
				|| playerName.toUpperCase().equals("TY-LUCAS")
				|| playerName.toUpperCase().equals("TY-LUCAS KELLEY")
				|| playerName.toUpperCase().equals("TY KELLEY")) {
			score += 1000;
			JOptionPane
					.showMessageDialog(
							null,
							"You unlocked the secret 1,000 point bonus! Nice name choice by the way.",
							"1,000 Points", JOptionPane.INFORMATION_MESSAGE);
		}

	}
}
