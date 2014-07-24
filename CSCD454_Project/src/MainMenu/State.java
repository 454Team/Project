package MainMenu;

/*
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public interface State {
 
	public void clickChooseCharacters();
	public void clickChooseItems();
	public void clickTutorial();
	public void clickPlayGame();
}
