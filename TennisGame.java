package tennisgame;

public class TennisGame extends Game {
	
	public TennisGame(String name1, String name2) {
		firstPlayer = new TennisPlayer(name1);
		secondPlayer = new TennisPlayer(name2);
	}
	
	public String getGameScore() {
		int firstPlayerScore = firstPlayer.getScoreAsInt();
		int secondPlayerScore = secondPlayer.getScoreAsInt();
		int diff = firstPlayerScore - secondPlayerScore;
		if (firstPlayerScore > 3 || secondPlayerScore > 3) {
			if (diff > 1) {
				resetScore();
				return firstPlayer.getName() + " wins";
			}
			else if (diff < -1) {
				resetScore();
				return secondPlayer.getName() + " wins";
			}
		}
		if (firstPlayerScore == 4 && diff == 0) {
			firstPlayer.scoreDown();
			secondPlayer.scoreDown();
		}
		return firstPlayer.getScore() + ":" + secondPlayer.getScore();
	}
}
