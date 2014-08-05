package FightingBattle.HeroSlots;

public class CharacterBattleSlot3 extends HeroSlots {

	public CharacterBattleSlot3(String type) {
		super(type);
	}
	
	public CharacterBattleSlot3(character.Character hero){
		this.hero = hero;
		isHeroAvailable = true;
	}

}
