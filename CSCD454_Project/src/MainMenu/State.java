package MainMenu;

import java.util.ArrayList;
import java.util.Scanner;

import Items.characterSlots.HeroSlot;

/*
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public interface State {
 
	public void clickChooseCharacters(Scanner scanchoice, ArrayList<MainMenuHeroSlot> heroies);
	public void clickChooseSkills(Scanner scanchoice, ArrayList<MainMenuHeroSlot> heroies);
	public void clickTutorial();
	public void clickPlayGame(ArrayList<MainMenuHeroSlot> heroies);
}
