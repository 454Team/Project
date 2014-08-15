/**
 * 
 */
package MainMenuGame;

import java.util.ArrayList;
import java.util.Scanner;

import FightingBattle.HeroSlots.Battlefield;
import Items.Constants.Constants;
import Items.Inventory.ItemStorageInventory;
import Items.WeaponArmor.Item;
import Items.characterSlots.HeroSlot;
import Items.itemFactory.ItemFactory;
import MainMenu.MainMenuHeroSlot;
import Monster.Monster;
import Monster.MonsterFactory;
import tester.BattleTester;
import tester.StorageTester;

/**
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class MainMenuGame {
	public static Scanner kb = new Scanner(System.in);
	public static ArrayList<MainMenuHeroSlot> heroSlots;

//----------------------------------------------------------------------------------------------------------------------------------
	
	public static void main(String[] args, ArrayList<MainMenuHeroSlot> heroies) {
		int choice = 0;
		heroSlots = heroies;
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
		System.out.println("Please enter the name of the item you would like to buy\n\n");
		for(int i = 0; i < Constants.storeItemNames.length; i++)
			System.out.println(" - " + Constants.storeItemNames[i]);
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
		    printHeroList();
			System.out.println("Please enter what level of room that you would like to enter (integer from 1 to 10).\n"
					+ "Or please enter zero to go back to the main menu.\n");
			try{   
				choice = kb.nextInt();
			    ArrayList<Monster> monsters = new ArrayList<Monster>();
			    monsters = MonsterFactory.getMonster(choice,3);
			    Battlefield.create();
			    Battlefield.create().loadMonster(monsters);
			    Battlefield.create().loadHero(heroSlots);
			    heroSlots = Battlefield.create().fight();
			    printHeroList();
			    break;
		    }
		    catch(Exception e){
		    	break;
			}    	
		}		
	}

	private static void printHeroList()
	{
		for(HeroSlot heroslot : heroSlots){
			System.out.println(heroslot.toString());
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
				kb.nextLine();
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
			    	equipItem();
			    	break;
		    }
		}
	}

	private static void equipItem() {
		int heroChoice = 0;
		int choice = 0;
		String name = "";
		while(choice != 4)
		{
			System.out.println("Please choose what hero you would like to change equipment on(Enter the hero number).\n"
					+ "4). Or Exit.");
					printHeroList();
			try{   
				heroChoice = kb.nextInt();
				kb.nextLine();
		    }
		    catch(Exception e){
		    	break;
			}    
			System.out.println("Please choose what type of equipment you would like to change.\n"
					+ "1. To change weapon\n"
					+ "2. To change headgear\n"
					+ "3. To change armor\n"
					+ "4). Or Exit.\n");
			try{   
				choice = kb.nextInt();
				kb.nextLine();
		    }
		    catch(Exception e){
		    	break;
			} 
			System.out.println("Your inventory consists of: \n");
    		ItemStorageInventory.create().showStorage();
			System.out.println("Please enter what item you would like to equip: \n");
			try{   
				name = kb.nextLine();
				kb.nextLine();
		    }
		    catch(Exception e){
		    	break;
			} 
			switch(choice)
		    {
		    	case 1: 
		    		addItemSomething( heroSlots.get(heroChoice-1).SwapWeapon(getItemSomething(name)));
		    		break;
			    case 2:
		    		addItemSomething( heroSlots.get(heroChoice-1).SwapHeadArmor(getItemSomething(name)));
			   		break;
			   	case 3:
		    		addItemSomething( heroSlots.get(heroChoice-1).SwapBodyArmor(getItemSomething(name)));
			   		break;
		    }
		}		
		
	}
	
//----------------------------------------------------------------------------------------------------------------------------------
	public static void addItemSomething(Item item){
		if(item != null){
			if(ItemStorageInventory.create().addItem(item)){
				
				System.out.println("add "+ item.toString() + " successfully\n");
			}else{
				System.out.println("add "+ item.toString() + " failed\n");
			}
		}else
			System.out.println("add item " + " failed\n");
	}
	
	public static Item getItemSomething(String name){
		// get item
				Item item = ItemStorageInventory.create().getItemfromStorage(name);
				if(item != null)
					System.out.println("you just get "+ item + " from item list \n");
				else
					System.out.println("getting "+ item + " failed\n");
				
				return item;
	}
}
