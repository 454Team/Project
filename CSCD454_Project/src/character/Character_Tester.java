package character;

/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 * Tester Class to test the Character Factory
 */
public class Character_Tester {

	public static void main(String[] args) {
		
		Character character = CharacterFactory.getCharacter("warrior");
		character.test();
		
		character = CharacterFactory.getCharacter("mage");
		character.test();
		
		character = CharacterFactory.getCharacter("paladin");
		character.test();
		
		character = CharacterFactory.getCharacter("priest");
		character.test();
		
		character = CharacterFactory.getCharacter("rogue");
		character.test();
		
	} // End main

} // End Character_Tester
