package MainMenu;

import java.util.ArrayList;
import java.util.Scanner;

import Items.characterSlots.HeroSlot;

/*
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class hasChosenItemsState implements State {
	GameMachine gumballMachine;
 
	public hasChosenItemsState(GameMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void clickChooseCharacters(Scanner kb, ArrayList<MainMenuHeroSlot> heroies) {
		System.out.println("You have already chosen characters to play with.");
	}
 
	public void clickChooseSkills(Scanner scanchoice, ArrayList<MainMenuHeroSlot> heroies) {
		System.out.println("You have already chosen items to use.");
	}
	
	public void clickTutorial() {
		System.out.println("You have already chosen characters and equipped them with items, now just click to play the game.");
		//TODO: Maybe add instructions of how the game will be played, how to move, what will happen, etc.?
	}

    public void clickPlayGame(ArrayList<MainMenuHeroSlot> heroies) {
    	//Initializes main menu for game play
    	MainMenuGame.MainMenuGame.main(new String [0], heroies);
    	//Once game is played reset the game so he can play again
		gumballMachine.setState(gumballMachine.hasNotChosenCharactersState());
    	}
 
	public String toString() {
		return "waiting for user to start the game";
	}
}
