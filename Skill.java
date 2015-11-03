package Tok;

import java.io.Serializable;

public class Skill implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name = "";
	int level = 1;

	public Skill(String name, int level) {
		this.name = name;
		this.level = level;
	}
}