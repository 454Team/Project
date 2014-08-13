package FightingBattle.HeroSlots;

import Items.Constants.Constants;
import Items.characterSlots.BodyArmorSlots;
import Items.characterSlots.HeadArmorSlots;
import Items.characterSlots.HeroSlot;
import Items.characterSlots.Slots;
import Items.characterSlots.WeaponSlots;
import MainMenu.MainMenuHeroSlot;
import character.Character;
import character.CharacterFactory;
public class BattleHeroSlots extends HeroSlot{
	protected boolean isDefeated = false;
	protected boolean isHeroAvailable = false;
	// more slots here
	
	public BattleHeroSlots(MainMenuHeroSlot mainMenuHeroSlot){
		this.hero = mainMenuHeroSlot.getcharacter();
		this.weaponSlot = mainMenuHeroSlot.getWeaponSlot();
		this.headArmorSlot = mainMenuHeroSlot.getHeadArmorSlots();
		this.bodyArmorSlot = mainMenuHeroSlot.getBodyArmorSlots();
	}
	
	public BattleHeroSlots(){
		super();
		isHeroAvailable = true;
	}
	
	public boolean checkHeroAvailable(){
		return isHeroAvailable;
	}
	
	public boolean checkDefeated(){
		return isDefeated;
	}
	
	public void normalAttack() {
		hero.specialAttack();
	}
	public void specialAttack(){
		hero.specialAttack2();
	}
}
