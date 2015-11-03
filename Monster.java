package Tok;

public class Monster {
	
	String name = "";
	int level = 1;
	int[] combatStats = new int[3];

	public Monster(String name, int level, int[] combatStats) {
		this.name = name;
		this.level = level;
		this.combatStats = combatStats;
	}
}