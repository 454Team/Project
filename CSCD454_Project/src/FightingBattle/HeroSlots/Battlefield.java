package FightingBattle.HeroSlots;

import java.util.Stack;

import Items.Constants.Constants;
import Monster.Monster;

public class Battlefield {

	private static Battlefield battleField= null;
	private Stack<HeroSlots> heroTurn;
	private Stack<MonsterSlots> monsterTurn;
	
	private HeroSlots Heroslot1;
	private HeroSlots Heroslot2;
	private HeroSlots Heroslot3;
	
	private MonsterSlots monsterSlot1;
	private MonsterSlots monsterSlot2;
	private MonsterSlots monsterSlot3;
	
	private int numMonster = 3;
	
	public static Battlefield create(){
		if(battleField == null ){
			battleField = new Battlefield();
		}
		return battleField;
	}
	
	private Battlefield() {
		heroTurn = new Stack<HeroSlots>();			// no turn at first
		monsterTurn = new Stack<MonsterSlots>();			// no turn for monster at first

	}
	
	public Battlefield loadHero(HeroSlots hero1,HeroSlots hero2,HeroSlots hero3){
		//Heroslot1 = new CharacterBattleSlot1(hero1);
		//Heroslot2 = new CharacterBattleSlot1(hero2);
		//Heroslot3 = new CharacterBattleSlot1(hero3);
		
		heroTurn.push(hero1);
		heroTurn.push(hero2);
		heroTurn.push(hero3);
		
		return battleField;
	}	
	
	public Battlefield loadMonster(int roomLevel){
		monsterSlot1 = new MonsterSlot1();
		monsterSlot2 = new MonsterSlot2();
		monsterSlot3 = new MonsterSlot3();
		
		monsterTurn.push(monsterSlot1);
		monsterTurn.push(monsterSlot2);
		monsterTurn.push(monsterSlot3);
		
		return battleField;
	}
	
	public void fight(){			// normal attack , 1-1 push 1 out of stack
									// special attack 1-3 push 3 monster out of stack , 1 hero out of stack
		while(checkEndFight() == false){
			//hero attack
			
			HeroSlots hero = heroTurn.pop();
			
			System.out.println(" hero " + hero.toString() + "is out");
			
			heroTurn.push(hero);
			
			// monster attack
			
			MonsterSlots monster = monsterTurn.pop();
			
			monster.loseHealth(25);
			
			System.out.println(" monster " + monster.toString() + "is out");
			
			monsterTurn.push(monster);
			
		}
	}
	
	public boolean checkEndFight(){
		boolean checking = true;
		int i = 0;
		while(i <numMonster){
			MonsterSlots slot = monsterTurn.pop();
			if(slot.checkDefeated() == false)
				checking = false;
			monsterTurn.push(slot);
			i++;
		}
		return checking;
	}

}
