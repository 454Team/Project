package MainMenu;

import FightingBattle.HeroSlots.BattleHeroSlots;
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

	public MainMenuHeroSlot(BattleHeroSlots battleHeroSlot){
		this.hero = battleHeroSlot.getcharacter();
		this.weaponSlot = battleHeroSlot.getWeaponSlot();
		this.headArmorSlot = battleHeroSlot.getHeadArmorSlots();
		this.bodyArmorSlot = battleHeroSlot.getBodyArmorSlots();
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
		Character temp = null;
		try{
			temp = hero;
			hero = null;
			//hero = CharacterFactory.getCharacter(Constants.CHARACTER_RANDOM);
			hero = willBeSwappedHero;
		}catch(Exception e){
			hero = temp;
			temp = null;
		}
		return temp;
	}
	
	@Override
	public String toString(){
		return 	"Hero : " + hero.toString() + "\n"+
				"Weapon : " + weaponSlot.toString() + "\n"+ 
				"head armor : " + headArmorSlot.toString() + "\n" + 
				"Body armor : " + bodyArmorSlot.toString() + "\n";
	}

}
