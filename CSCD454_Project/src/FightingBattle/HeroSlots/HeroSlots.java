package FightingBattle.HeroSlots;

import Items.characterSlots.Slots;
import character.Character;
import character.CharacterFactory;
public abstract class HeroSlots {
	protected Character hero= null;
	protected boolean isDefeated = false;
	protected boolean isHeroAvailable = false;
	
	private Slots weapon;
	private Slots headarmor;
	private Slots bodyarmor;
	// more slots here
	
	public HeroSlots(){
		
	}
	
	public HeroSlots(String type){
		hero = CharacterFactory.getCharacter(type);
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
