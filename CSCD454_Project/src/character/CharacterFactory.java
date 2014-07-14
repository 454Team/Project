package character;

/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public class CharacterFactory {

	/*
	 * @param String includes the type of the chosen character.
	 * @return Character based on input type.
	 */
	public static Character getCharacter(String type) {
		
		if(type.equals("warrior"))
			return new Warrior();
		else if(type.equals("rogue"))
			return new Rogue();
		else if(type.equals("priest"))
			return new Priest();
		else if(type.equals("paladin"))
			return new Paladin();
		else if(type.equals("mage"))
			return new Mage();
		//TODO: Change return from null to something safe.
		return null;
	} // End getCharacter
	
} // End CharacterFactory
