package tester;

import Items.Constants.Constants;
import Items.Inventory.StorageInventory;
import Items.WeaponArmor.Item;
import Items.itemFactory.ItemFactory;

public class StorageTester {

	public static void main(String[] args){
		
		if(!StorageInventory.create().addItem(ItemFactory.create().buyItem(Constants.AKAVIRI_SWORD)) ){
			System.out.println("Item cannot be bought");
		}
		StorageInventory.create().addItem(ItemFactory.create().buyItem(Constants.ANGEL_BODY_ARMOR));
		StorageInventory.create().addItem(ItemFactory.create().buyItem(Constants.ANGEL_HEAD_ARMOR));
		StorageInventory.create().showStorage();
		
		// get item
		Item item = StorageInventory.create().getItemfromStorage(Constants.ANGEL_BODY_ARMOR);
		if(item != null)
			System.out.println(item);
		else
			System.out.println("getting item failed");
	
		StorageInventory.create().showStorage();
		
	}

}
