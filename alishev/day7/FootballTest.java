package alishev.day7;
import java.util.Scanner;
public class FootballTest {

	public static void main(String[] args) {
		FootballPlay play = new FootballPlay();
		System.out.println("Numbers of player: " +Player.countPlayers);	
		play.createTeam();
		System.out.println("How many minutes does the game last ?");
		int minutes = new Scanner(System.in).nextInt();		
		play.playGame(minutes);
		System.out.println(Player.countPlayers+ " players played the "+ minutes +"-minute match.");
		
	}

}
