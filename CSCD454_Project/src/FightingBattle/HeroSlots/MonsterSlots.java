package FightingBattle.HeroSlots;

import Items.Constants.Constants;
import Monster.Monster;
import Monster.MonsterFactory;

public abstract class MonsterSlots {

	protected Monster monster;
	protected boolean isMonsterAvailable = false;
	protected boolean isDefeated = false;
	public MonsterSlots() {
		monster = MonsterFactory.getMonster(Constants.MONSTER_RANDOM);
		isMonsterAvailable = true;
		isDefeated = false;
	}
	
	public boolean checkMonsterAvailable(){
		return isMonsterAvailable;
	}
	
	public boolean checkDefeated(){
		return isDefeated;
	}

}
