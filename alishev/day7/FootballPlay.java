package alishev.day7;
import java.util.Random;
public class FootballPlay {
	
	private Player[] players = new Player[6];
	
	public Player[] createTeam() {
		for (int i = 0; i < 6; i++) {
			Player one = new Player();
			Player.countPlayers++;
			players[i]= one;
		}
		return players;
	}
	public void playGame(int minutes) {
		for (int i = 0; i<minutes/5; i++) {
			Random rand = new Random();
			int numberPlayer = rand.nextInt(0, 6);
			players[numberPlayer].run();
			if (players[numberPlayer].info()) {
				System.out.println("Player "+(numberPlayer+1) + " is tired, change ");
				players[numberPlayer] = new Player();
				Player.countPlayers++;
			}
			
		}
	}

}
