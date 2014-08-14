package MainMenu;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Scanner;

import character.Character;
import character.CharacterFactory;
import Items.characterSlots.HeroSlot;

/*
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class hasChosenCharactersState implements State {
    GameMachine gumballMachine;
 
    public hasChosenCharactersState(GameMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void clickChooseCharacters(Scanner kb, ArrayList<MainMenuHeroSlot> heroies) {
		System.out.println("You have already chosen your characters"); 
	}
 
	public void clickTutorial() {
		System.out.println("You have chosen your characters so please equip him with items next.");
	 }
 
	public void clickPlayGame(ArrayList<MainMenuHeroSlot> heroies) {
		System.out.println("You need to set the character skills first.");
	} 
 
	public String toString() {
		return "waiting for items to be chosen";
	}

	public void clickChooseSkills(Scanner scanchoice, ArrayList<MainMenuHeroSlot> heroies) {
		for(int i = 0; i < heroies.size(); i++)
		{
			int chosen = 0;
			//For specific hero in hero slot
			MainMenuHeroSlot temp = (MainMenuHeroSlot) heroies.get(i);
			
			//Print out prompt with those certain skills
			System.out.println("Please choose 2 skills that you would like " + temp.getcharacter().getDesc() + " to have:");
			for(int p = 0; p < temp.getcharacter().getSkillNames().length; p++){
				System.out.println(temp.getcharacter().getSkillNames()[p].getDesc());
			}
			//TODO: Need to implement skill choosing.
		}
		gumballMachine.setState(gumballMachine.hasChosenItemsState());
	}
}
