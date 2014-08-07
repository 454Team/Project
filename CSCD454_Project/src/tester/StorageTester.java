package tester;

import java.awt.Container;

import Items.Constants.Constants;
import Items.Inventory.StorageInventory;
import Items.WeaponArmor.Item;
import Items.itemFactory.ItemFactory;

public class StorageTester {

	public static void main(String[] args){
		
		//buy some item
		buyItemTester(Constants.AKAVIRI_SWORD);
		buyItemTester(Constants.ANGEL_BODY_ARMOR);
		buyItemTester(Constants.ANGEL_HEAD_ARMOR);
		
		// show storeage
		StorageInventory.create().showStorage();
		
		// get an item from the list
		getItemTester(Constants.ANGEL_BODY_ARMOR);
	
		// show storage again
		StorageInventory.create().showStorage();
		
		// sell an item in list
		sellItemTester(Constants.AKAVIRI_SWORD);
		
		// Try to buy a basic item
		buyItemTester(Constants.BASIC_AXES);
		
		// show 
		StorageInventory.create().showStorage();
		
		// sell basic item will fail 
		sellItemTester(Constants.BASIC_AXES);
		
		
	}
	
	public static void sellItemTester(String name){
		if(StorageInventory.create().sellItemfromStorage(name)){
			System.out.println("Sell "+ name + " successfully\n");
		}else
			System.out.println("sell "+name+" failed\n");
	}
	
	
	public static void getItemTester(String name){
		// get item
				Item item = StorageInventory.create().getItemfromStorage(name);
				if(item != null)
					System.out.println("you just get "+ item + " from item list \n");
				else
					System.out.println("getting "+ item + " failed\n");
	}
	
	public static void buyItemTester(String name){
		if(!StorageInventory.create().addItem(ItemFactory.create().buyItem(name)) ){
			System.out.println(name + " cannot be bought\n");
		}
	}

}
