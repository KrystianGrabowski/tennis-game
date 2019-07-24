package tennisgame;

public class TennisPlayer extends Player {

	public TennisPlayer(String name) {
		super(name);
		score = new TennisScore();
	}

	@Override
	public void resetScore() {
		score = new TennisScore();
		
	}

}
