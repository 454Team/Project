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
		switch(type) {
		case "Assassin":
			return new Assassin();
		case "Rogue":
			return new Rogue();
		case "Priest":
			return new Priest();
		case "Paladin":
			return new Paladin();
		case "Mage":
			return new Sorcerer();
		default:
			return new DefaultCharacter();
		}
	} // End getCharacter
	
} // End CharacterFactory
