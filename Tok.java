package Tok;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Tok implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	//Utility Methods
	@SuppressWarnings("resource")
	public static String input() {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		return input;
	}
	
	public static void writeCharacter(Player character){
		
		String fileName = System.getProperty("user.dir") + "/characters/" + character.name + ".bin";
		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName));
			os.writeObject(character);
			os.flush();
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void welcomeScreen()
	{
		System.out.println("Welcome to...\n\n\n\tTTTTTTTTTTTTTTTTTTTTTTT              KKKKKKKKK    KKKKKKK\n\tT:::::::::::::::::::::T              K:::::::K    K:::::K\n\tT:::::::::::::::::::::T              K:::::::K    K:::::K\n\tT:::::TT:::::::TT:::::T              K:::::::K   K::::::K\n\tTTTTTT  T:::::T  TTTTTTooooooooooo   KK::::::K  K:::::KKK\n\t        T:::::T      oo:::::::::::oo   K:::::K K:::::K   \n\t        T:::::T     o:::::::::::::::o  K::::::K:::::K    \n\t        T:::::T     o:::::ooooo:::::o  K:::::::::::K     \n\t        T:::::T     o::::o     o::::o  K:::::::::::K     \n\t        T:::::T     o::::o     o::::o  K::::::K:::::K    \n\t        T:::::T     o::::o     o::::o  K:::::K K:::::K   \n\t        T:::::T     o::::o     o::::oKK::::::K  K:::::KKK\n\t      TT:::::::TT   o:::::ooooo:::::oK:::::::K   K::::::K\n\t      T:::::::::T   o:::::::::::::::oK:::::::K    K:::::K\n\t      T:::::::::T    oo:::::::::::oo K:::::::K    K:::::K\n\t      TTTTTTTTTTT      ooooooooooo   KKKKKKKKK    KKKKKKK");
		System.out.println("\n\n\n");
		System.out.println("Press Enter to continue...\n\n");
		input();
	}

	public static void Introduction() {
		
		String name = "";
		String race = "";
		String gender = "";

		System.out.println("\"Clocks slay time... time is dead as long as it is being clicked off by little wheels; \nonly when the clock stops does time come to life.\"\n\n\n...");

		input();

		System.out.println("\n\n\n\n\n\n\n\n\n\n" + "\n" + "\"WELCOME TO THE WORLD OF TOK, TRAVELER.\"" + "\n" + "\"FOR REASONS UNKNOWN, "
				+ "YOU HAVE BEEN BROUGHT HERE.\"" + "\n" + "" + "\n" + "YOU FEEL LIKE YOU JUST WOKE UP. YOU LOOK AROUND FRIGHTFULLY FOR THE "
				+ "THUNDERING\nVOICE, BUT YOU CANNOT SEE ANYHTING." + "\n" + "" + "\n" + "\"...LOOK DEEP INTO THE CORE OF YOUR MIND...\""
				+ "\n" + "\"...YOU ARE NOW BUT A SPEK OF SAND ON A BEACH OF ANOTHER PLANET\n90000000000000000000000000000000 LIGHT-YEARS AWAY FROM YOUR HOME"
				+ "...\"" + "\n" + "" + "\n" + "YOU STILL CANNOT SEE ANYTHING, YOU BEGIN TO WORRY YOUR VISION WILL NEVER RETURN" + "\n" + "" + "\n" 
				+ "\"...DO NOT BE AFRAID...\"" + "\n" + "\"...I AM YOU...\"" + "\n" + "" + "\n" + "THIS MONSTEROUS VOICE COULD NOT POSSIBLY BE ME, "
				+ "I'M...I'M..." + "\n" 
				+ "What was my name again?...");

		name = input();

		System.out.println("" + "\n" + "Yes, now I remember. I'm " + name + "!" + "\n" + "\n\n\n" + "\n" + "\"...I AM YOU...\"" + "\n" + "" + "\n" 
				+ "THE VOICE IS SLOWLY FADING AND YOU BEGIN TO FEEL YOUR SENSES RETURN TO YOU." + "\n" + "" + "\n" 
				+ "With your returning vision you see that you are in an unknown wood." + "\n" + "You feel a pain on your forearm so you look down at it." 
				+ "\n" + "To your surprise your skin color is not what you remember it to be..." + "\n" 
				+ "What race were you anyway?...");

		race = input();

		System.out.println("" + "\n" 
				+ "And what gender was I?");

		gender = input();

		System.out.println("\n\n\n" + "\n" + "After a bit of thought you remember that you're a " + gender + " of the " + race + " race." + "\n" 
				+ "As your vision clears you get a better view of a strange marking on your arm." + "\n" + "The marking looks like it's a word." 
				+ "\n" + "It reads:" + "\n" + "" + "\n" + "-ToK-" + "\n" + "" + "\n" 
				+ "Press Enter to continue...");

		input();

		Player character = new Player(name, race, gender);

		writeCharacter(character);
		tutorial(character);
	}

	private static void tutorial(Player character) { //TODO
		String choice = "";

		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

		System.out.println("YOUR SENSES HAVE FULLY RETURNED TO YOU AND YOU REALIZE THAT YOU ARE UNCLOTHED\nAND LOST. YOU HAVE LIMITED MEMORIES OF THE PAST, BUT THE ONLY THING YOU CAN THINK ABOUT IS\nTHE HORRIBLE VOICE THAT YOU HEARD ONLY A FEW SECONDS AGO. YOU CAN FEEL FAMINE\nAND DEHYDRATION SETTING IN. YOU NEED TO MAKE A DECISION SOON OR YOU WILL SURELY PERISH.\n");

		System.out.println("WILL YOU...");
		System.out.println("");
		System.out.println("1. Wait for something magical to happen...");
		System.out.println("2. Walk in one direction, hoping to find an exit to the wood.");

		if (character.race.equalsIgnoreCase("elvish"))
		{
			System.out.println("3. Attempt to contact the Wood Elves for help even though you are not a Wood Elf yourself...");
		}

		if (character.race.equalsIgnoreCase("human")) {
			System.out.println("3. Attempt to make some low grade tools out of the surrounding wood and stone...");
		}

		if (character.race.equalsIgnoreCase("dwarf")) {
			System.out.println("3. Dig a hole to search for potentially valuable surface minerals...");
		}

		if (character.race.equalsIgnoreCase("halfling")) {
			System.out.println("3. Attempt to forrage some berries on a nearby bush...");
		}

		choice = input();

		if (choice.equals("1"))
		{
			System.out.println("\nCongratulations, you've successfully soiled yourself...what next?");

			choice = "";
			System.out.println("");

			System.out.println("2. Walk in one direction, hoping to find an exit to the wood.");

			if (character.race.equalsIgnoreCase("elvish"))
			{
				System.out.println("3. Attempt to contact the Wood Elves for help even though you are not a Wood Elf yourself...");
			}

			if (character.race.equalsIgnoreCase("human"))
			{
				System.out.println("3. Attempt to make some low grade tools out of the surrounding wood and stone...");
			}

			if (character.race.equalsIgnoreCase("dwarf"))
			{
				System.out.println("3. Dig a hole to search for potentially valuable surface minerals...");
			}

			if (character.race.equalsIgnoreCase("halfling"))
			{
				System.out.println("3. Attempt to forrage some berries on a nearby bush...");
			}

			choice = input();

			if (choice.equals("2"))
			{
				System.out.println("\nYou walk for a couple minutes before you notice that you are passing by the same trees over and over again.\nYou feel that you are in a never ending wood.");

				choice = "";
				System.out.println("");

				if (character.race.equalsIgnoreCase("elvish"))
				{
					System.out.println("\nYou decide it is best to attempt to contact the Wood Elves for help even though you are not a Wood Elf yourself...");
				}

				if (character.race.equalsIgnoreCase("human"))
				{
					System.out.println("\nYou decide it is best to attempt to make some low grade tools out of the surrounding wood and stone...");
				}

				if (character.race.equalsIgnoreCase("dwarf"))
				{
					System.out.println("\nYour dwarven instincts tell you to dig a hole and try to tunnel your way out...");
				}

				if (character.race.equalsIgnoreCase("halfling"))
				{
					System.out.println("\nYour stomach rumbles loudly...it's time to find lunch...");
				}

				choice = "3";
			}

		}

		if (choice.equals("2"))
		{
			System.out.println("\nYou walk for a couple minutes before you notice that you are passing by the same trees over and over again.\nYou feel that you are in a never ending wood...");

			choice = "";
			System.out.println("");

			System.out.println("1. Wait for something magical to happen...");
			if (character.race.equalsIgnoreCase("elvish"))
			{
				System.out.println("3. Attempt to contact the Wood Elves for help even though you are not a Wood Elf yourself...");
			}

			if (character.race.equalsIgnoreCase("human")) {
				System.out.println("3. Attempt to make some low grade tools out of the surrounding wood and stone...");
			}

			if (character.race.equalsIgnoreCase("dwarf")) {
				System.out.println("3. Dig a hole to search for potentially valuable surface minerals...");
			}

			if (character.race.equalsIgnoreCase("halfling")) {
				System.out.println("3. Attempt to forrage some berries on a nearby bush...");
			}

			choice = input();

			if (choice.equals("1"))
			{
				System.out.println("\nCongratulations, you've successfully soiled yourself...");

				choice = "";
				System.out.println("");

				if (character.race.equalsIgnoreCase("elvish"))
				{
					System.out.println("You decide it is best to attempt to contact the Wood Elves for help even though you are not a Wood Elf yourself...");
				}

				if (character.race.equalsIgnoreCase("human"))
				{
					System.out.println("You decide it is best to attempt to make some low grade tools out of the surrounding wood and stone...");
				}

				if (character.race.equalsIgnoreCase("dwarf"))
				{
					System.out.println("Your dwarven instincts tell you to dig a hole and try to tunnel your way out...");
				}

				if (character.race.equalsIgnoreCase("halfling"))
				{
					System.out.println("Your stomach rumbles loudly...it's time to find lunch...");
				}

				choice = "3";
			}

		}

		if ((choice.equals("3")) && (character.race.equalsIgnoreCase("elvish")))
		{
			System.out.println("\nYou try your best to imitate the call of the Wood Elf, hoping to signal one out from where he or she may be lurking.\nSuddenly you hear some rustling in a tree just ahead of you. A few seconds pass as you wait to see what it could have been,\nbut nothing comes out. You make the call once more, and a dark figure drops down from an upper branch of the tree. The\nfigure slowly approaches you and the details of the wood elf start to become apparent. It is a female elf. She appears armed\nwith a Mithril Bow and a Steel Dagger. She begins to speak:\n\n\"Who are you elf? You do not belong here...\"\nYou begin to feel fear creep down your spine as the wood elf begins to pull back on her bow. You find yourself head to head\n with a Mithril Arrow. You slowly respond to her question:\n\n1. \"I am " + 
					character.name + ". Who are you?\"" + 
					"\n" + "2. (Bluff) \"You fool! I am your worst nightmare! Point that bow away from me or I will unleash my magiks upon you.\"");

			choice = input();

			if (choice.equals("1"))
			{
				System.out.println("\nThe wood elf replies:\n\"I am X-win of the Wood Elves, but who I am is not important. Why are you in our forest young elf?\"\n\nYou respond:\n\"I'm not sure. My memory is very unclear. Their was a voice earlier...I think? I don't know. Where am I?\"\n\nX-win can see that you are clearly not in good health and that you need aid. She walks up to you but\nyou feel your breath start to shorten and darkness take hold of your vision. You feel yourself beginning to slip away...\n\nPress Enter to continue..");

				input();
				System.out.println("\n\n\n\n\n");
			}

			if (choice.equals("2"))
			{
				System.out.println("\nYou blink. You feel the sharp sting of a mithril arrow in your foot and the wood elf was not where she was a second ago.\nYou realize you may have made a mistake. You feel your breath start to shorten and darkness take hold of your vision. You feel yourself beginning to slip away...\n\nPress Enter to continue..");

				input();
				System.out.println("\n\n\n\n\n");
			}/*    */ 
			System.out.println("You wake up to the smell of the morning dew in an unknown room. You feel like you have overslept. You vision is blurry, but you can make out a figure\nin the corner of the room. As your vision clears you realize it's the elf you met in the forest.\nBefore you can say a word, the elf walks up to you and says:\n\"Do you remember me, elf? My name is X-win. I have just saved your life. Do not say a word. You are in an inn\nof a local town nearby. I cannot stay here long with you, but I have a gift for you.\"\n\nShe hands you a book.\n\n\"Read this, and learn the ways of the wood elves. I must leave now. Goodbye.\"\nX-win quickly leaves the room with an almost fearful look on her face. You look down at the book she handed you.\nIt is titled: Elvish Archery Technique\nYou read the book cover to cover.\n");

			character.combatStats[1].level = 2;
			System.out.println("Your " + character.combatStats[1].name + " level is now level " + character.combatStats[1].level + "!");
			System.out.println("You feel yourself dozing off again...");

			System.out.println("Press Enter to continue...");
			input();

		}

		if ((choice.equals("3")) && (character.race.equalsIgnoreCase("human")))
		{
			System.out.println("\nYou start looking around for sturdy pieces of wood and sharp stones. A few hours pass and you seem to\nhave the supplies to make either a hatchet, or a fishing rod:\n\n1. Hatchet\n2. Fishing Rod");

			choice = input();

			if (choice.equals("1"))
			{
				character.inventory.add(new Item("Low-Grade", "Hatchet", 1, 0, 0, 0));
			}

			if (choice.equals("2"))
			{
				character.inventory.add(new Item("Low-Grade", "Fishing Rod", 0, 0, 0, 0));
			}

		}

		if ((choice.equals("3")) && (character.race.equalsIgnoreCase("dwarf")))
		{
			System.out.println("X");
		}

		if ((choice.equals("3")) && (character.race.equalsIgnoreCase("halfling")))
		{
			System.out.println("X");
		}

	}

	@SuppressWarnings("resource")
	private static Player loadCharacter(File theDir) throws IOException, ClassNotFoundException{
		
		File[] filesList = theDir.listFiles();
		System.out.println("Please choose a character: " + "\n");
        for(File f : filesList){
            if(f.isFile()){
                System.out.println(f.getName().substring(0, f.getName().indexOf(".")));
            }
        }
        
        String choice = input();
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/characters/" + choice + ".bin"); 
		ObjectInputStream ois = new ObjectInputStream(fis);
		Player character = (Player) ois.readObject();
		
		System.out.println("Loading " + character.name + "!");
		return character;
		
	}
	
	
	//Game Methods
	public static Player town(Player character) {
		System.out.println(character.name + " loaded into Town!");
		System.out.println(character.gender + character.name + character.level + character.race);
		return null;
	}

	public static Player forest(Player character)
	{
		return null;
	}

	public static Player deepForest(Player character)
	{
		return null;
	}

	public static Player valley(Player character)
	{
		return null;
	}

	public static Player deepValley(Player character)
	{
		return null;
	}

	public static Player mountains(Player character)
	{
		return null;
	}

	public static Player deepMountains(Player character)
	{
		return null;
	}

	public static Player towerOfTime(Player character)
	{
		return null;
	}

	public static Player combat(Player character, Monster enemy)
	{
		return null;
	}

	public static Player trade(Player character, NPC store)
	{
		return null;
	}

	public static Player equip(Player character, Item Item)
	{
		if (Item.type == 0)
		{
			character.equipped[0] = Item;
		}

		if (Item.type == 1)
		{
			character.equipped[1] = Item;
		}

		if (Item.type == 2)
		{
			character.equipped[2] = Item;
		}

		if (Item.type == 3)
		{
			character.equipped[3] = Item;
		}

		return character;
	}

	
	//Main Method
	public static void main(String[] args) throws ClassNotFoundException, IOException {

		welcomeScreen();
		File theDir = new File("characters");
		if(!theDir.exists()) { //There are no existing characters
			
			try{
				theDir.mkdir();
			} 
			catch(SecurityException se){
				se.printStackTrace();
			}

			Introduction();

		} else {//There are existing characters
			
			System.out.println("1. Load Character" + "\n" + "2. New Character");
			String choice = input();
			
			if(    choice.equals("1") 
				|| choice.equals("1.") 
				|| choice.equalsIgnoreCase("load character") 
				|| choice.equalsIgnoreCase("load") 
				|| choice.equalsIgnoreCase("1. Load Character") ){
				
				town(loadCharacter(theDir));
				
			}else if(  choice.equals("2") 
					|| choice.equals("2.") 
					|| choice.equalsIgnoreCase("new character") 
					|| choice.equalsIgnoreCase("new") 
					|| choice.equalsIgnoreCase("2. New Character") ){
				
				Introduction();
				
			}
		}
	}
}