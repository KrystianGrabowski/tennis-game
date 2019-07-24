package tennisgame;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		TennisGame myGame;
		myGame = new TennisGame("Server", "Receiver");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Server= 1");
		System.out.println("Receiver=2");
		System.out.println("Exit=0");
		System.out.println("Please enter the player that wins the point:");
		int playerID;
		
		while(true) {
			try {
				playerID = scanner.nextInt();
				if (playerID == 0){
					scanner.close();
					break;
				}
				myGame.playerWin(playerID);
				System.out.println(myGame.getGameScore());
			}
			catch(IllegalArgumentException e) {
				System.err.println(e.getMessage());
			}
			catch(InputMismatchException e) {
				System.err.println("Please enter a valid numeric value");
				scanner.nextLine();
			}
			catch(Exception e) {
				System.err.println("Error");
				scanner.nextLine();
			}
		}
	}
}
