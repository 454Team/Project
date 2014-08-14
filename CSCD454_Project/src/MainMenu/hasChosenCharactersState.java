package MainMenu;

import java.util.ArrayList;
import java.util.Scanner;

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
		
		String skillName = "";
		int check;
		int choiceCount = 0;
		
		for(int i = 0; i < heroies.size(); i++)
		{
			//For specific hero in hero slot
			MainMenuHeroSlot temp = (MainMenuHeroSlot) heroies.get(i);
			
			//Print out prompt with those certain skills
			System.out.println("Please choose 2 skills that you would like " + temp.getcharacter().getDesc() + " to have:");
			for(int p = 0; p < temp.getcharacter().getSkillNames().length; p++){
				System.out.println(temp.getcharacter().getSkillNames()[p].getDesc());
			}
			do {
			try {
			skillName = scanchoice.next();
			
			} catch(Exception e) {
				System.out.println("Error: Invalid input.");
			}
			check = validateSkill(skillName, temp);
			if(check != -1)
				choiceCount++;
			else
				System.out.println("Please input valid skill name.");
			if(choiceCount == 1) {
				temp.getcharacter().setSkill1(temp.getcharacter().getSkillNames()[check]);
				System.out.println("First Skill Chosen");
			}
			if(choiceCount == 2) {
				temp.getcharacter().setSkill2(temp.getcharacter().getSkillNames()[check]);
				System.out.println("Second Skill Chosen");
			}
			} while(choiceCount < 2);
		gumballMachine.setState(gumballMachine.hasChosenItemsState());
		scanchoice.nextLine();
		}
		
	} // End clickChooseSkills
	
	private int validateSkill(String skillName, MainMenuHeroSlot temp) {	
		for(int p = 0; p < temp.getcharacter().getSkillNames().length; p++) {
			if(temp.getcharacter().getSkillNames()[p].getDesc().equalsIgnoreCase(skillName))
				return p;
		} // End for
		return -1;		
	}
}
