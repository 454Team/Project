package MainMenu;

/*
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class hasChosenCharactersState implements State {
    GameMachine gumballMachine;
 
    public hasChosenCharactersState(GameMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    //TODO: Maybe we should let him re-choose characters if he desires?
	public void clickChooseCharacters() {
		System.out.println("You have already chosen your characters"); 
		//gumballMachine.setState(gumballMachine.hasChosenCharactersState());
	}
 
	public void clickChooseItems() {
		//TODO: Insert concrete code for choosing items the first time around
		gumballMachine.setState(gumballMachine.hasChosenItemsState());
	}
 
	public void clickTutorial() {
		System.out.println("You have chosen a character so please equip him with items next.");
	 }
 
	public void clickPlayGame() {
		System.out.println("Your character needs to be equipped with items first.");
	} 
 
	public String toString() {
		return "waiting for items to be chosen";
	}
}
