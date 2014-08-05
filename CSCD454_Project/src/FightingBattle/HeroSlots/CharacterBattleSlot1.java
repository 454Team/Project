package FightingBattle.HeroSlots;

public class CharacterBattleSlot1 extends HeroSlots {

	
	public CharacterBattleSlot1(String type) {
		super(type);
	}
	
	public CharacterBattleSlot1(character.Character hero){
		this.hero = hero;
		isHeroAvailable = true;
	}

}
