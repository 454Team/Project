package Items.Inventory;

import java.util.LinkedList;
import java.util.List;

import character.Character;
import Items.MoneyBalance.Balance;
import Items.MoneyBalance.BalanceAccess;
import Items.WeaponArmor.Item;

public class ItemStorageInventory implements BalanceAccess{
	
	private static final int max = 100;
	private static ItemStorageInventory storageInventory = null;
	private List<Item> itemList = null;
	public static ItemStorageInventory create(){
		if(storageInventory == null){
			storageInventory = new ItemStorageInventory();
		}
		
		return storageInventory;
	}
	
	private  ItemStorageInventory() {
		itemList = new LinkedList<Item>();
	}
	
	private boolean checkOverLimit(){
		return itemList.size() >= max ;
	}
	
	public void showStorage(){
		
		System.out.println("Total Balance : " + access(Accesscreate()));
		
		
		if(itemList.size() != 0){
			System.out.println("List item : ");
			for(Item item : itemList){
				System.out.println("item :" + item.toString());
			}
		}else{
			System.out.println("There is no item in list");
		}
		
		System.out.println();
		
		
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
				
			}
		}
		
		itemList.remove(temp_item);
		
		return temp_item;
	}
	
	public Item getItemfromStorage(String neededItem){
		Item temp_item = null;
		for(Item item : itemList){
			if(item.compareName(neededItem)){				// right item
				temp_item = item;
	
			}
		}
		
		itemList.remove(temp_item);
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
	
	public boolean sellItemfromStorage(String removedItem){
		for(Item item : itemList){
			if(item.compareName(removedItem)){				// right item
				if(paidTransaction(Accesscreate(), item)){
					itemList.remove(item);
					
					// print out money
					System.out.println("Balance :" + access(Accesscreate()));
					
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

	@Override
	public boolean paidTransaction(Balance balance, Character character) {
		// TODO Auto-generated method stub
		return false;
	}

}
