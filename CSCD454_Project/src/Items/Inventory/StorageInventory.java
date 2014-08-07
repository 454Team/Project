package Items.Inventory;

import java.util.LinkedList;
import java.util.List;

import Items.MoneyBalance.Balance;
import Items.MoneyBalance.BalanceAccess;
import Items.WeaponArmor.Item;

public class StorageInventory implements BalanceAccess{
	
	private static final int max = 100;
	private static StorageInventory storageInventory = null;
	private List<Item> itemList = null;
	public static StorageInventory create(){
		if(storageInventory == null){
			storageInventory = new StorageInventory();
		}
		
		return storageInventory;
	}
	
	private  StorageInventory() {
		itemList = new LinkedList<Item>();
	}
	
	private boolean checkOverLimit(){
		return itemList.size() >= max ;
	}
	
	public void showStorage(){
		if(itemList.size() != 0){
			for(Item item : itemList){
				System.out.println("item :" + item.toString());
			}
		}else{
			System.out.println("There is no item in list");
		}
	}
	
	public boolean addItem(Item item){
		if(item != null){
			if(!checkOverLimit()){
				itemList.add(item);
				return true;
			}
		}
		return false;
	}
	
	public boolean SwapItem(Item selectedInListItem,Item fromSlotItem){
		for(Item item : itemList){
			if(item.compareName(selectedInListItem)){				// right item
				
			}
		}
		return false;
	}
	
	public Item getItemfromStorage(Item neededItem){
		Item temp_item = null;
		for(Item item : itemList){
			if(item.compareName(neededItem)){				// right item
				temp_item = item;
				itemList.remove(item);
			}
		}
		return temp_item;
	}
	
	public Item getItemfromStorage(String neededItem){
		Item temp_item = null;
		for(Item item : itemList){
			if(item.compareName(neededItem)){				// right item
				temp_item = item;
				itemList.remove(item);
			}
		}
		return temp_item;
	}
	
	public boolean sellItemfromStorage(Item removedItem){
		for(Item item : itemList){
			if(item.compareName(removedItem)){				// right item
				if(paidTransaction(Accesscreate(), item)){
					itemList.remove(item);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public double access(Balance balance) {
		return balance.getBalance();
	}

	@Override
	public Balance Accesscreate() {
		return Balance.create();
	}

	@Override
	public boolean paidTransaction(Balance balance, Item item) {
		return balance.CompleteAddedTransaction(item);
	}

}
