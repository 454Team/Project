package MainMenu;

/*
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
import java.util.Scanner;

public class GameMachineTestDrive {

	public static void main(String[] args) {
		GameMachine gameMachine = new GameMachine();

		//System.out.println(gameMachine);
		
		Scanner scanchoice = new Scanner(System.in);
		int choiceentry = 0;
		
		do {
			//Print out menu
			System.out.println("Please press: "
					+ "\n1). Display the hint of what you need to do at the given moment"
					+ "\n2). Choose characters that you would like to play with"
					+ "\n3). Choose items that you would like to equip your character with"
					+ "\n4). Play the game!"
					+ "\n5). Exit the program.");	  
			//For Testing purposes
			//System.out.println(gameMachine);
			//try taking the input
			try{
				choiceentry = Integer.parseInt(scanchoice.nextLine());
			}catch(Exception e){
				System.out.println("Please enter a valid menu choice.");
			}
			//do something if it's a valid input
		    switch (choiceentry)
		    {
		        case 1:
		            gameMachine.clickTutorial();
		            break;
		        case 2: 
		            gameMachine.clickChooseCharacters(scanchoice);
		            break;
		        case 3: 
		            gameMachine.clickChooseItems();
		            break;
		        case 4: 
		            gameMachine.clickPlayGame();
		            break;
		    }   
		} while (choiceentry != 5);
		//Closing Scanner
		scanchoice.close();
   
	}
}
