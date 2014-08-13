package MainMenu;

import java.util.ArrayList;
import java.util.Scanner;

import Items.characterSlots.HeroSlot;

/*
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public interface State {
 
	public void clickChooseCharacters(Scanner scanchoice, ArrayList<HeroSlot> heroies);
	public void clickChooseItems();
	public void clickTutorial();
	public void clickPlayGame();
}
