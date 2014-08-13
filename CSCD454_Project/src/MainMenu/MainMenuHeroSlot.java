package MainMenu;

import Items.Constants.Constants;
import Items.WeaponArmor.Item;
import Items.characterSlots.BodyArmorSlots;
import Items.characterSlots.HeadArmorSlots;
import Items.characterSlots.HeroSlot;
import Items.characterSlots.WeaponSlots;
import character.Character;
import character.CharacterFactory;

public class MainMenuHeroSlot extends HeroSlot{

	public MainMenuHeroSlot() {
		super();
	}

	public Item SwapWeapon(Item willBeSwappedItem) {
		
		return weaponSlot.swap(willBeSwappedItem);
		//return false;// swap failed
	}

	public Item SwapHeadArmor(Item willBeSwappedItem) {
		return headArmorSlot.swap(willBeSwappedItem);
		//return false;// swap failed
	}

	public Item SwapBodyArmor(Item willBeSwappedItem) {
		return bodyArmorSlot.swap(willBeSwappedItem);
		//return false; // swap failed
	}

	public Character SwapHero(Character willBeSwappedHero) {
		Character temp = hero;
		hero = null;
		hero = CharacterFactory.getCharacter(Constants.CHARACTER_RANDOM);
		return temp;
	}
	
	public Character getcharacter(){
		return hero;
	}
	
	public WeaponSlots getWeaponSlot(){
		return weaponSlot;
	}
	
	public BodyArmorSlots getBodyArmorSlots(){
		return bodyArmorSlot;
	}
	
	public HeadArmorSlots getHeadArmorSlots(){
		return headArmorSlot;
	}

}
