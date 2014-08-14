package tester;

import Items.Constants.Constants;
import character.CharacterFactory;
import character.Paladin;

/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 * Tester Class to test the Character Factory
 */
public class Character_Tester {

	public static void main(String[] args) {
		
		character.Character character = CharacterFactory.create().buyCharacter(Constants.CHARACTER_ASSASSIN);
		System.out.println(character.toString());
		
		//character = CharacterFactory.getCharacter("mage");
		//System.out.println(character.toString());

		//character = CharacterFactory.getCharacter("paladin");
		//System.out.println(character.toString());

		//character = CharacterFactory.getCharacter("priest");
		//System.out.println(character.toString());

		//character = CharacterFactory.getCharacter("rogue");
		//System.out.println(character.toString());

	} // End main

} // End Character_Tester
