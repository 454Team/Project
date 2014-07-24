package MainMenu;

/*
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class hasNotChosenCharactersState implements State {
    GameMachine gumballMachine;
 
    public hasNotChosenCharactersState(GameMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void clickChooseCharacters() {
		//Method for choosing characters
		gumballMachine.setState(gumballMachine.hasChosenCharactersState());
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
