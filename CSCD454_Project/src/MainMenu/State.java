package MainMenu;

import java.util.Scanner;

/*
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public interface State {
 
	public void clickChooseCharacters(Scanner scanchoice);
	public void clickChooseItems();
	public void clickTutorial();
	public void clickPlayGame();
}
