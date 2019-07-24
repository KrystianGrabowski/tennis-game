package tennisgame;

public class TennisScore extends Score {
	private static String[] scores = {"0", "15", "30", "40", "A"};
	public TennisScore() {
		super();
	}
	@Override
	public String getScore() {
		return scores[super.currentScore];
	}
	

}
