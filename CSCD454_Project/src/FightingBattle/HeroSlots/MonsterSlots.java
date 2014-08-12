package FightingBattle.HeroSlots;

import Items.Constants.Constants;
import Monster.Monster;
import Monster.MonsterFactory;

public abstract class MonsterSlots {

	protected Monster monster;
	protected boolean isMonsterAvailable = false;
	protected boolean isDefeated = false;
	public MonsterSlots() {
		monster = MonsterFactory.getMonster();
		isMonsterAvailable = true;
		isDefeated = false;
	}
	
	public boolean checkMonsterAvailable(){
		return isMonsterAvailable;
	}
	
	public void loseHealth(double damage){
		monster.defend(damage);
	}
	
	public boolean checkDefeated(){
		return monster.isAlive();
	}

}
