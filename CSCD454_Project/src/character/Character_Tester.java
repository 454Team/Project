package character;

/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 * Tester Class to test the Character Factory
 */
public class Character_Tester {

	public static void main(String[] args) {
		
		Character character = CharacterFactory.getCharacter("warrior");
		
		character = CharacterFactory.getCharacter("mage");
		
		character = CharacterFactory.getCharacter("paladin");
		
		character = CharacterFactory.getCharacter("priest");
		
		character = CharacterFactory.getCharacter("rogue");
		
	} // End main

} // End Character_Tester
