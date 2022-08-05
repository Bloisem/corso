package alishev.day7;

import java.util.Random;

public class Player {
	private int stamina;
	private final int MAX_STAMINA = 101;
	private final int MIN_STAMINA = 0;
	static int countPlayers;
	

	public Player() {
		Random rand = new Random();
		this.stamina = rand.nextInt(MIN_STAMINA + 90, MAX_STAMINA);
		// TODO Auto-generated constructor stub
	}

	public int getStamina() {
		return stamina;
	}

	public void setStamina(int stamina) {
		this.stamina = stamina;
	}

	public void run() {
		Random rand = new Random();
		stamina -= rand.nextInt(1, 91);
		
	}

	public boolean info() {
		return stamina <= 10? true : false;

	}
}
