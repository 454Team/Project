package FightingBattle.HeroSlots;

import Items.Constants.Constants;
import Monster.Monster;
import Monster.MonsterFactory;

public class MonsterSlots {

	protected Monster monster;
	protected boolean isMonsterAvailable = false;
	protected boolean isDefeated = false;
	public MonsterSlots() {
		monster = MonsterFactory.getMonster(Constants.MONSTER_RANDOM);
		isMonsterAvailable = true;
		isDefeated = false;
	}
	
	public MonsterSlots(Monster monster){
		this.monster = monster;
		isDefeated = false;
		isMonsterAvailable = true;
	}
	
	public boolean checkMonsterAvailable(){
		return isMonsterAvailable;
	}
	
	public void loseHealth(double damage){
		monster.defend(damage);
	}
	
	public void attack(){
		monster.fight();
	}
	
	public void defend(){
		monster.defend();
	}
	
	public boolean checkDefeated(){
		return monster.isAlive();
	}

}
