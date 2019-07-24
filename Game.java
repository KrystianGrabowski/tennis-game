package tennisgame;

public abstract class Game {
	protected Player firstPlayer;
	protected Player secondPlayer;

	public abstract String getGameScore();
	
	protected void resetScore() {
		firstPlayer.resetScore();
		secondPlayer.resetScore();
	}
	
	public void playerWin(int playerId) {
		if (playerId == 1) {
			firstPlayer.scoreUp();
		}
		else if (playerId == 2) {
			secondPlayer.scoreUp();
		}
		else {
			throw new IllegalArgumentException(String.format("Player %d does not exist", playerId));
		}
		
	}
}
