package Tok;

import java.io.Serializable;
import java.util.ArrayList;

public class Player implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name = "", race = "", gender = "";
	int level = 1, XP = 0, HP = 3, wallet = 0;
	Skill[] combatStats = new Skill[3], skillStats = new Skill[3];
	ArrayList<Item> inventory = new ArrayList<Item>();
	Item[] equipped;

	public Player(String name, String race, String gender) {
		Skill attack = new Skill("Attack", 1);
		Skill archery = new Skill("Archery", 1);
		Skill magik = new Skill("Magik", 1);
		Skill forestry = new Skill("Forestry", 1);
		Skill prospecting = new Skill("Prospecting", 1);
		Skill angling = new Skill("Angling", 1);

		this.name = name;
		this.race = race;
		this.gender = gender;
		this.level = (1 + (int)Math.sqrt(this.XP));
		this.XP = 0;
		this.HP = 3;
		this.wallet = 0;
		this.combatStats = new Skill[] { attack, archery, magik };
		this.skillStats = new Skill[] { forestry, prospecting, angling };
		this.equipped = new Item[4];
	}
}
