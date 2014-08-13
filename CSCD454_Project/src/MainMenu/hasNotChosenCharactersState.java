package MainMenu;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Scanner;

import Items.characterSlots.HeroSlot;
import character.Character;
import character.CharacterFactory;

/*
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class hasNotChosenCharactersState implements State {
    GameMachine gumballMachine;
 
    public hasNotChosenCharactersState(GameMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void clickChooseCharacters(Scanner kb, ArrayList<HeroSlot> heroies) {
		//Method for choosing characters
		System.out.println("Please input what type of heroes you would like to use one by one");
		for(int heroes = 1; heroes < 4;){
			try{
				
				//Get hero from character factory
				Character character1 = CharacterFactory.getCharacter(kb.next());
				
				//Don't allow wrong spelling to make default character
				if(character1.getDesc().equalsIgnoreCase("Default"))
					throw new EmptyStackException();
				
				//create hero slot
				MainMenuHeroSlot temp = new MainMenuHeroSlot();
				
				//add new hero to the hero slot
				temp.SwapHero(character1);
				
				//add hero slot to the array list
				heroies.add(temp);
				
				System.out.println("Character " + heroes + " picked");
				
				//If passes test of "not default" then increment
				heroes++;
				
				//Testing what was made
				//System.out.println(character1.toString());
			}catch(Exception e){
				System.out.println("Failed to pick that hero, please try again.");
			}
		}
		gumballMachine.setState(gumballMachine.hasChosenCharactersState());
		kb.nextLine();
	}
 
	public void clickChooseItems() {
		System.out.println("You can't choose items, you haven't got any characters to put items on.");
	}
 
	public void clickTutorial() {
		System.out.println("Please choose characters that you would like to play with in this game.");
		//Plus more info on how the game is played in itself
	}
 
	public void clickPlayGame() {
		System.out.println("You don't have any characters to play with yet.");
	}
 
	public String toString() {
		return "waiting for character to be chosen";
	}
}
