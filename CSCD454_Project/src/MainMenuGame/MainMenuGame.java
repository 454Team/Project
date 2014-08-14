/**
 * 
 */
package MainMenuGame;

import java.util.Scanner;

import Items.Inventory.ItemStorageInventory;
import Items.WeaponArmor.Item;
import Items.itemFactory.ItemFactory;
import tester.BattleTester;
import tester.StorageTester;

/**
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class MainMenuGame {
	public static Scanner kb = new Scanner(System.in);

//----------------------------------------------------------------------------------------------------------------------------------
	
	public static void main(String[] args) {
		int choice = 0;
		while(choice != 4)
		{
			System.out.println("Please choose what you would like to do.\n"
					+ "1). Enter the inventory.\n"
					+ "2). Enter a room to fight.\n"
					+ "3). Buy an Item from the store.\n"
					+ "4). Exit.");
			try{   
				choice = kb.nextInt();
		    }
		    catch(Exception e){
		    	break;
			}    		
			switch(choice)
		    {
		    	case 1: 
		    		inventoryMenu();
		    		break;
			    case 2:
			    	roomToFight();
			   		break;
			   	case 3:
			   		storeMenu();
			   		break;
		    }
		}
		kb.close();
	}
	
//----------------------------------------------------------------------------------------------------------------------------------
	
	private static void storeMenu() {
		String name = "Avakiri Sword";
		System.out.println("Please enter the name of the item you would like to buy\n");
		try{   		
			kb.nextLine();
			name = kb.nextLine();
	    }
		catch(Exception e){
		   	System.out.println("Please enter a valid option");
		    System.out.println(name);
		}   

		if(!ItemStorageInventory.create().addItem(ItemFactory.create().buyItem(name)) ){
			System.out.println(name + " cannot be bought\n");
		}
	}

//----------------------------------------------------------------------------------------------------------------------------------

	private static void roomToFight() {
		int choice = -1;
		while(choice != 0)
		{
			choice = 100;
			System.out.println("Please enter what level of room that you would like to enter (integer from 1 to 10).\n"
					+ "Or please enter zero to go back to the main menu.\n");
			try{   
				choice = kb.nextInt();
		    }
		    catch(Exception e){
		    	break;
			}    	
			//TODO: Need to finish rooms before doing this
			switch(choice)
		    {
		    	case 1: 
		    		
		    		break;
			   	//for testing
		    	case 99:
			   		BattleTester.main(new String[0]);
			   		break;
		    }
		}		
	}

//----------------------------------------------------------------------------------------------------------------------------------

	private static void inventoryMenu() {
		int choice = 0;
		String name = "";
		Item item;
		while(choice != 4)
		{
			System.out.println("Please choose what you would like to do.\n"
					+ "1). List everything in your inventory\n"
					+ "2). Sell item from inventory\n"
					+ "3). Equip Item from inventory **TODO:\n"
					+ "4). Exit.");
			try{   
				choice = kb.nextInt();
		    }
		    catch(Exception e){
		    	break;
			}    		
			switch(choice)
		    {
		    	case 1: 
					System.out.println("**Your Storage List**\n");
		    		ItemStorageInventory.create().showStorage();
		    		break;
			    case 2:
					System.out.println("Please enter what item you would like to sell\n");
					kb.nextLine();
		    		name = kb.nextLine();
			    	if(ItemStorageInventory.create().sellItemfromStorage(name)){
						System.out.println("Sold "+ name + " successfully\n");
					}else
						System.out.println("sell "+name+" failed\n");
			   		break;
			    case 3:
			    	
			    	break;
		    }
		}
	}
	
//----------------------------------------------------------------------------------------------------------------------------------

}
