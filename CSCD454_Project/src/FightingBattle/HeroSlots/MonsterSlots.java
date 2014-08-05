package FightingBattle.HeroSlots;

import Items.Constants.Constants;
import Monster.Monster;
import Monster.MonsterFactory;

public abstract class MonsterSlots {

	private Monster monster;
	private boolean isMonsterAvailable = false;
	public MonsterSlots() {
		monster = MonsterFactory.getMonster(Constants.MONSTER_RANDOM);
		isMonsterAvailable = true;
	}
	
	public boolean checkMonsterAvailable(){
		return isMonsterAvailable;
	}

}
