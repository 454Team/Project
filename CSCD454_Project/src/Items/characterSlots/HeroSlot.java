package Items.characterSlots;

import Items.Constants.Constants;
import character.Character;
import character.CharacterFactory;

public abstract class HeroSlot {

	protected Character hero;
	protected WeaponSlots weaponSlot;
	protected HeadArmorSlots headArmorSlot;
	protected BodyArmorSlots bodyArmorSlot;
	
	
	public HeroSlot() {
		// create slot with all basic at first
		hero = CharacterFactory.create().buyCharacter(Constants.CHARACTER_DEFAULT);
		weaponSlot = new WeaponSlots();
		headArmorSlot = new HeadArmorSlots();
		bodyArmorSlot = new BodyArmorSlots();
	}

	@Override
	public String toString(){
		return 	"Hero : " + hero.toString() + "\n";
				//"Weapon : " + weaponSlot.toString() + "\n"+ 
				//"head armor : " + headArmorSlot.toString() + "\n" + 
				//"Body armor : " + bodyArmorSlot.toString() + "\n";
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
