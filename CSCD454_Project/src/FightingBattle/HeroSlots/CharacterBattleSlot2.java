package FightingBattle.HeroSlots;

public class CharacterBattleSlot2 extends HeroSlots {

	public CharacterBattleSlot2(String type) {
		super(type);
	}

	public CharacterBattleSlot2(character.Character hero){
		this.hero = hero;
		isHeroAvailable = true;
	}
	
}
