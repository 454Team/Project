package Items.Inventory;

import java.util.LinkedList;
import java.util.List;

import character.Character;
import Items.MoneyBalance.Balance;
import Items.MoneyBalance.BalanceAccess;
import Items.WeaponArmor.Item;

public class CharacterStorageInventory implements BalanceAccess{
	
	private static final int max = 100;
	private static CharacterStorageInventory storageInventory = null;
	private List<Character> characterList = null;
	public static CharacterStorageInventory create(){
		if(storageInventory == null){
			storageInventory = new CharacterStorageInventory();
		}
		
		return storageInventory;
	}
	
	private  CharacterStorageInventory() {
		characterList = new LinkedList<Character>();
	}
	
	private boolean checkOverLimit(){
		return characterList.size() >= max ;
	}
	
	public void showStorage(){
		
		System.out.println("Total Balance : " + access(Accesscreate()));
		
		
		if(characterList.size() != 0){
			System.out.println("List character : ");
			for(Character character : characterList){
				System.out.println("character :" + character.toString());
			}
		}else{
			System.out.println("There is no character in list");
		}
		
		System.out.println();
		
		
	}
	
	public boolean addCharacter(Character character){
		if(character != null){
			if(!checkOverLimit()){
				characterList.add(character);
				return true;
			}
		}
		return false;
	}
	
	/*public boolean SwapItem(Character selectedInListCharacter,Item fromSlotCharacter){
		for(Character character : characterList){
			if(character.compareName(selectedInListCharacter)){				// right item
				
			}
		}
		return false;
	}*/
	
	public Character getCharacterfromStorage(Character neededCharacter){
		Character temp_character = null;
		for(Character character : characterList){
			if(character.compareName(neededCharacter)){				// right character
				temp_character = character;
			}
		}
		
		characterList.remove(temp_character);
		
		return temp_character;
	}
	
	public Character getCharacterfromStorage(String neededCharacter){
		Character temp_character = null;
		for(Character character : characterList){
			if(character.compareName(neededCharacter)){				// right item
				temp_character = character;
	
			}
		}
		
		characterList.remove(temp_character);
		return temp_character;
	}
	
	public boolean sellCharacterfromStorage(Character removedCharacter){
		for(Character character : characterList){
			if(character.compareName(removedCharacter)){				// right item
				if(paidTransaction(Accesscreate(), character)){
					characterList.remove(character);
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean sellCharacterfromStorage(String removedCharacter){
		for(Character character : characterList){
			if(character.compareName(removedCharacter)){				// right item
				if(paidTransaction(Accesscreate(), character)){
					characterList.remove(character);
					
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
		//return balance.CompleteAddedTransaction(item);
		return false;
	}

	@Override
	public boolean paidTransaction(Balance balance, Character character) {
		return balance.CompleteAddedTransaction(character);
	}

}
