
public class EnhancedPlayer {

	private String name;
	private int hp;
	private String weapon;
	
	public EnhancedPlayer(String name, int health, String weapon) {
		this.name = name;
		if (health > 0 && health <= 100) {
			this.hp = health;
		}
		this.weapon = weapon;
	}
	
	public void loseHealth(int damage) {
		this.hp = this.hp - damage;
		if (this.hp <= 0) {
			System.out.println("Player is unconscious");
		}		
	}
	
	public int getHealth() {
		return hp;
	}
}
