package Items.Inventory;

import java.util.LinkedList;
import java.util.List;

import Items.MoneyBalance.Balance;
import Items.MoneyBalance.BalanceAccess;
import Items.WeaponArmor.Item;

public class StorageInventory implements BalanceAccess{
	
	private static final int max = 100;
	private StorageInventory storageInventory = null;
	private List<Item> itemList = null;
	public StorageInventory create(){
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
	
	public boolean addItem(Item item){
		if(!checkOverLimit()){
			itemList.add(item);
			return true;
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
		for(Item item : itemList){
			if(item.compareName(neededItem)){				// right item
				return item;
			}
		}
		return null;
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
