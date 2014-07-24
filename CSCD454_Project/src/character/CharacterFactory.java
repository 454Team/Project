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
		case "warrior":
			return new Assassin();
		case "rogue":
			return new Rogue();
		case "priest":
			return new Priest();
		case "paladin":
			return new Paladin();
		case "mage":
			return new Sorcerer();
		default:
			return null;
		}
	} // End getCharacter
	
} // End CharacterFactory
