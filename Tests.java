package tennisgame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Tests {

	TennisGame myGame;
	@BeforeEach
	void initializeGame() {
		myGame = new TennisGame("Server", "Receiver");
	}
	
	@Test
	void scoreIsAlwaysEqualZeroWhenGameStarts() {
		String result = myGame.getGameScore();
		assertEquals("0:0", result);
	}
	
	@Test
	void serverWinsFirstTime() {
		myGame.playerWin(1);
		String result = myGame.getGameScore();
		assertEquals("15:0", result);
	}
	
	@Test
	void receiverWinsFirstTime() {
		myGame.playerWin(2);
		String result = myGame.getGameScore();
		assertEquals("0:15", result);
	}
	
	@Test
	void receiverWinsFirstTimeDraw() {
		myGame.playerWin(1);
		myGame.playerWin(2);
		String result = myGame.getGameScore();
		assertEquals("15:15", result);
	}
	
	@Test
	void serverWinsFirstTimeDraw() {
		myGame.playerWin(2);
		myGame.playerWin(1);
		String result = myGame.getGameScore();
		assertEquals("15:15", result);
	}
	
	@Test
	void serverWinsScoreIsFifteenFifteen() {
		myGame.playerWin(2);
		myGame.playerWin(1);		
		myGame.playerWin(1);
		String result = myGame.getGameScore();
		assertEquals("30:15", result);
	}
	
	@Test
	void receiverWinsScoreIsFifteenFifteen() {
		myGame.playerWin(2);
		myGame.playerWin(1);
		
		myGame.playerWin(2);
		String result = myGame.getGameScore();
		assertEquals("15:30", result);
	}
	
	@Test
	void receiverWinsScoreIsThirtyThirty() {
		myGame.playerWin(2);
		myGame.playerWin(1);
		myGame.playerWin(2);
		myGame.playerWin(1);
		
		myGame.playerWin(2);
		String result = myGame.getGameScore();
		assertEquals("30:40", result);
	}
	
	@Test
	void serverWinsScoreIsFortyThirty() {
		for (int i=0; i<2; i++) {
			myGame.playerWin(2);
			myGame.playerWin(1);			
		}
		
		myGame.playerWin(1);
		myGame.playerWin(1);
		String result = myGame.getGameScore();
		assertEquals("Server wins", result);
	}
	
	@Test
	void receiverWinsScoreIsFortyA() {
		for (int i=0; i<3; i++) {
			myGame.playerWin(2);
			myGame.playerWin(1);			
		}
		myGame.playerWin(2);
		myGame.playerWin(2);
		String result = myGame.getGameScore();
		assertEquals("Receiver wins", result);
	}
	
	@Test
	void serverWinsScoreIsFortyForty() {
		for (int i=0; i<3; i++) {
			myGame.playerWin(2);
			myGame.playerWin(1);			
		}
		
		myGame.playerWin(1);
		String result = myGame.getGameScore();
		assertEquals("A:40", result);
	}
	
	@Test
	void receiverWinsScoreIsAForty() {
		for (int i=0; i<3; i++) {
			myGame.playerWin(2);
			myGame.playerWin(1);
		}
		myGame.playerWin(1);
		
		myGame.playerWin(2);
		String result = myGame.getGameScore();
		assertEquals("40:40", result);
	}
	
	@Test
	void serverWinsScoreIsAForty() {
		for (int i=0; i<3; i++) {
			myGame.playerWin(2);
			myGame.playerWin(1);			
		}
		myGame.playerWin(1);
		
		myGame.playerWin(1);
		String result = myGame.getGameScore();
		assertEquals("Server wins", result);
	}
	
	@Test
	void serversGoodDay() {
		for (int i=0; i<4; i++) {
			myGame.playerWin(1);			
		}
		String result = myGame.getGameScore();
		assertEquals("Server wins", result);
	}
	
	@Test
	void receiversGoodDay() {
		for (int i=0; i<4; i++) {
			myGame.playerWin(2);			
		}
		String result = myGame.getGameScore();
		assertEquals("Receiver wins", result);
	}
	
	
	

}
