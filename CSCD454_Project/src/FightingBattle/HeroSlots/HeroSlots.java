package FightingBattle.HeroSlots;

import Monster.Monster;
import character.Character;
import character.CharacterFactory;
public abstract class HeroSlots {
	protected Character hero= null;
	protected Monster monster1= null;
	protected Monster monster2= null;
	protected Monster monster3= null;
	protected boolean isHeroAvailable = false;
	public HeroSlots(){
		
	}
	
	public HeroSlots(String type){
		hero = CharacterFactory.getCharacter(type);
		isHeroAvailable = true;
	}
	
	public boolean checkHeroAvailable(){
		return isHeroAvailable;
	}
	
	public void normalAttack() {
		hero.specialAttack();
	}
	public void specialAttack(){
		hero.specialAttack2();
	}
}
