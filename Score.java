package tennisgame;

public abstract class Score {
	protected int currentScore;
	
	public Score() {
		currentScore = 0;
	}
	
	public abstract String getScore();

	public int getIntScore() {
		return this.currentScore;
	}
	
	public void increase() {
		currentScore++;
	}
	
	public void decrease() {
		currentScore--;
	}
	
}
