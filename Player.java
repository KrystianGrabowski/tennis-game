package tennisgame;

public abstract class Player {
	protected String name;
	protected Score score;
	
	public Player(String name) {
		this.name = name;
	}
	
	public abstract void resetScore();
	
	public String getName() {
		return name;
	}
	
	public void setName(String value) {
		name = value;
	}
	
	public String getScore() {
		return score.getScore();
	}
	
	public int getScoreAsInt() {
		return score.getIntScore();
	}
	
	public void scoreUp() {
		score.increase();
	}
	
	public void scoreDown() {
		score.decrease();
	}
	
}
