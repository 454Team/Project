package tester;

import java.awt.Container;
import java.util.ArrayList;

import character.CharacterFactory;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

import FightingBattle.HeroSlots.Battlefield;
import Items.Constants.Constants;
import Items.Inventory.CharacterStorageInventory;
import Items.Inventory.ItemStorageInventory;
import Items.WeaponArmor.Item;
import Items.characterSlots.HeroSlot;
import Items.itemFactory.ItemFactory;
import MainMenu.MainMenuHeroSlot;
import Monster.Monster;
import Monster.MonsterFactory;

public class StorageTester {

	public static void main(String[] args){
		
		//buy some item
		buyItemTester(Constants.AKAVIRI_SWORD);
		buyItemTester(Constants.ANGEL_BODY_ARMOR);
		buyItemTester(Constants.ANGEL_HEAD_ARMOR);
		
		// show storeage
		ItemStorageInventory.create().showStorage();
		
		// get an item from the list
		//getItemTester(Constants.ANGEL_BODY_ARMOR);
	
		// show storage again
		//StorageInventory.create().showStorage();
		
		// sell an item in list
		//sellItemTester(Constants.AKAVIRI_SWORD);
		
		// Try to buy a basic item
		buyItemTester(Constants.BASIC_AXES);
		
		// show 
		ItemStorageInventory.create().showStorage();
		
		// sell basic item will fail 
		sellItemTester(Constants.BASIC_AXES);
		
		// show 
				ItemStorageInventory.create().showStorage();
		
		int numberOfHero = 3;
		ArrayList<MainMenuHeroSlot> heroies = new ArrayList<MainMenuHeroSlot>();
		ArrayList<Monster> monsters = new ArrayList<Monster>();
		for(int i = 0 ; i < numberOfHero ; i++){
			heroies.add(new MainMenuHeroSlot());
			monsters.add(MonsterFactory.getMonster(1));
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
		ItemStorageInventory.create().showStorage();
		
		
		CharacterStorageInventory.create().addCharacter(CharacterFactory.create().buyCharacter(Constants.CHARACTER_PALADIN));
		CharacterStorageInventory.create().addCharacter(CharacterFactory.create().buyCharacter(Constants.CHARACTER_ROGUE));
		
		CharacterStorageInventory.create().showStorage();
		
		CharacterStorageInventory.create().addCharacter(heroies.get(0).SwapHero(CharacterStorageInventory.create().getCharacterfromStorage(Constants.CHARACTER_PALADIN)));
		
		CharacterStorageInventory.create().showStorage();
		for(HeroSlot heroslot : heroies){
			System.out.println(heroslot.toString());
		}
		
		for(Monster monster : monsters){
			System.out.println(monster.toString());
		}
		
		Battlefield.create().loadHero(heroies).loadMonster(monsters).fight();
		
		
	}
	
	public static void sellItemTester(String name){
		if(ItemStorageInventory.create().sellItemfromStorage(name)){
			System.out.println("Sell "+ name + " successfully\n");
		}else
			System.out.println("sell "+name+" failed\n");
	}
	
	public static void addItemTester(Item item){
		if(item != null){
			if(ItemStorageInventory.create().addItem(item)){
				
				System.out.println("add "+ item.toString() + " successfully\n");
			}else{
				System.out.println("add "+ item.toString() + " failed\n");
			}
		}else
			System.out.println("add item " + " failed\n");
	}
	
	public static Item getItemTester(String name){
		// get item
				Item item = ItemStorageInventory.create().getItemfromStorage(name);
				if(item != null)
					System.out.println("you just get "+ item + " from item list \n");
				else
					System.out.println("getting "+ item + " failed\n");
				
				return item;
	}
	
	public static void buyItemTester(String name){
		if(!ItemStorageInventory.create().addItem(ItemFactory.create().buyItem(name)) ){
			System.out.println(name + " cannot be bought\n");
		}
	}

}