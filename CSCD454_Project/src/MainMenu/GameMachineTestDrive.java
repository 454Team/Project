package MainMenu;

import java.util.ArrayList;
/*
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
import java.util.Scanner;

import Items.characterSlots.HeroSlot;

public class GameMachineTestDrive {

	public static void main(String[] args) {
		GameMachine gameMachine = new GameMachine();
		ArrayList<HeroSlot> heroies = new ArrayList<HeroSlot>();
		
		//System.out.println(gameMachine);
		
		Scanner scanchoice = new Scanner(System.in);
		int choiceentry = 0;
		
		do {
			//Print out menu
			System.out.println("Please press: "
					+ "\n1). Display the hint of what you need to do at the given moment"
					+ "\n2). Choose characters that you would like to play with"
					+ "\n3). Choose the characters skills"
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
		            gameMachine.clickChooseCharacters(scanchoice, heroies);
		            break;
		        case 3: 
		            gameMachine.clickChooseCharacterSkills(scanchoice, heroies);
		            break;
		        case 4: 
		            gameMachine.clickPlayGame();
		            break;
		        case 99:
		        	//for testing of the arraylist of heroes
		        	for(int p = 0; p< heroies.size(); p++)
		        	{
		        		MainMenuHeroSlot temp = (MainMenuHeroSlot) heroies.get(p);
		        		System.out.println(temp.getcharacter().toString());
		        	}
		            break;
		    }   
		} while (choiceentry != 5);
		//Closing Scanner
		scanchoice.close();
   
	}
}
