package FightingBattle.HeroSlots;

import Items.Constants.Constants;
import Monster.Monster;
import Monster.MonsterFactory;

public class MonsterSlots {

	protected Monster monster;
	protected boolean isMonsterAvailable = false;
	protected boolean isDefeated = false;
	public MonsterSlots() {
		//TODO: put in what room number to getMonster();
		//monster = MonsterFactory.getMonster(2);
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
	
	public int attack(){
		return monster.fight();
	}
	
	public void defend(){
		monster.defend();
	}
	
	public boolean checkDefeated(){
		return monster.isAlive();
	}

	@Override
	public String toString(){
		return monster.toString();
	}
	
}
