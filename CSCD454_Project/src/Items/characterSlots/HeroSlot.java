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
		hero = CharacterFactory.getCharacter(Constants.CHARACTER_RANDOM);
		weaponSlot = new WeaponSlots();
		headArmorSlot = new HeadArmorSlots();
		bodyArmorSlot = new BodyArmorSlots();
	}

}