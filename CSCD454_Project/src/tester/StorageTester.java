package tester;

import java.awt.Container;
import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

import Items.Constants.Constants;
import Items.Inventory.StorageInventory;
import Items.WeaponArmor.Item;
import Items.characterSlots.HeroSlot;
import Items.itemFactory.ItemFactory;
import MainMenu.MainMenuHeroSlot;

public class StorageTester {

	public static void main(String[] args){
		
		//buy some item
		buyItemTester(Constants.AKAVIRI_SWORD);
		buyItemTester(Constants.ANGEL_BODY_ARMOR);
		buyItemTester(Constants.ANGEL_HEAD_ARMOR);
		
		// show storeage
		StorageInventory.create().showStorage();
		
		// get an item from the list
		//getItemTester(Constants.ANGEL_BODY_ARMOR);
	
		// show storage again
		//StorageInventory.create().showStorage();
		
		// sell an item in list
		//sellItemTester(Constants.AKAVIRI_SWORD);
		
		// Try to buy a basic item
		buyItemTester(Constants.BASIC_AXES);
		
		// show 
		StorageInventory.create().showStorage();
		
		// sell basic item will fail 
		sellItemTester(Constants.BASIC_AXES);
		
		// show 
				StorageInventory.create().showStorage();
		
		int numberOfHero = 3;
		ArrayList<MainMenuHeroSlot> heroies = new ArrayList<MainMenuHeroSlot>();
		for(int i = 0 ; i < numberOfHero ; i++){
			heroies.add(new MainMenuHeroSlot());
		}
		
		/*for(HeroSlot heroslot : heroies){
			System.out.println(heroslot.toString());
		}*/
		
		addItemTester( heroies.get(0).SwapWeapon(getItemTester(Constants.AKAVIRI_SWORD)) );
		addItemTester( heroies.get(0).SwapHeadArmor(getItemTester(Constants.ANGEL_HEAD_ARMOR)) );
		addItemTester( heroies.get(0).SwapBodyArmor(getItemTester(Constants.ANGEL_BODY_ARMOR)) );
		for(HeroSlot heroslot : heroies){
			System.out.println(heroslot.toString());
		}
		
		// show 
		StorageInventory.create().showStorage();
		
	}
	
	public static void sellItemTester(String name){
		if(StorageInventory.create().sellItemfromStorage(name)){
			System.out.println("Sell "+ name + " successfully\n");
		}else
			System.out.println("sell "+name+" failed\n");
	}
	
	public static void addItemTester(Item item){
		if(item != null){
			if(StorageInventory.create().addItem(item)){
				
				System.out.println("add "+ item.toString() + " successfully\n");
			}else{
				System.out.println("add "+ item.toString() + " failed\n");
			}
		}else
			System.out.println("add item " + " failed\n");
	}
	
	public static Item getItemTester(String name){
		// get item
				Item item = StorageInventory.create().getItemfromStorage(name);
				if(item != null)
					System.out.println("you just get "+ item + " from item list \n");
				else
					System.out.println("getting "+ item + " failed\n");
				
				return item;
	}
	
	public static void buyItemTester(String name){
		if(!StorageInventory.create().addItem(ItemFactory.create().buyItem(name)) ){
			System.out.println(name + " cannot be bought\n");
		}
	}

}