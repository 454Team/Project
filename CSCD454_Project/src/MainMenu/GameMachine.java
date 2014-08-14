package MainMenu;

import java.util.ArrayList;
import java.util.Scanner;

import Items.characterSlots.HeroSlot;

/*
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class GameMachine {
 
	State hasChosenCharactersState;
	State hasNotChosenCharactersState;
	State hasChosenItemsState;
 
	State state;
 
	public GameMachine() {
		hasNotChosenCharactersState = new hasNotChosenCharactersState(this);
		hasChosenCharactersState = new hasChosenCharactersState(this);
		hasChosenItemsState = new hasChosenItemsState(this);
		this.state = hasNotChosenCharactersState;
	}
 
	public void clickChooseCharacters(Scanner scanchoice, ArrayList<MainMenuHeroSlot> heroies) {
		state.clickChooseCharacters(scanchoice, heroies);
	}
 
	public void clickChooseCharacterSkills(Scanner scanchoice, ArrayList<MainMenuHeroSlot> heroies) {
		state.clickChooseSkills(scanchoice, heroies);
	}
 
	public void clickTutorial() {
		state.clickTutorial();
	}
	
	public void clickPlayGame(ArrayList<MainMenuHeroSlot> heroies) {
		state.clickPlayGame(heroies);
	}

	void setState(State state) {
		this.state = state;
	}

    public State getState() {
        return state;
    }

    public State hasChosenItemsState() {
        return hasChosenItemsState;
    }

    public State hasChosenCharactersState() {
        return hasChosenCharactersState;
    }

    public State hasNotChosenCharactersState() {
        return hasNotChosenCharactersState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\n");
		result.append("Game is in " + state + "\n");
		return result.toString();
	}

}
