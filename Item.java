package Tok;

import java.io.Serializable;

public class Item implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name, grade;
	int type, defMod, strMod, rStrMod, mStrMod;

	public Item(String grade, String name, int defMod, int strMod, int rStrMod, int type) {
		this.grade = grade;
		this.name = (grade + " " + name);
		this.defMod = defMod;
		this.strMod = strMod;
		this.rStrMod = rStrMod;
		this.type = type;
	}
}