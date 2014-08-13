package FightingBattle.HeroSlots;

import java.util.ArrayList;
import java.util.Stack;

import Items.characterSlots.HeroSlot;
import MainMenu.MainMenuHeroSlot;
import Monster.Monster;

public class Battlefield {

	private static Battlefield battleField= null;
	private Stack<BattleHeroSlots> heroTurn;
	private Stack<MonsterSlots> monsterTurn;
	
	private ArrayList<BattleHeroSlots> heroSlots = new ArrayList<BattleHeroSlots>();
	private ArrayList<MonsterSlots> monsterSlots = new ArrayList<MonsterSlots>();
	
	private int numMonster = 3;
	
	public static Battlefield create(){
		if(battleField == null ){
			battleField = new Battlefield();
		}
		return battleField;
	}
	
	private Battlefield() {
		heroTurn = new Stack<BattleHeroSlots>();			// no turn at first
		monsterTurn = new Stack<MonsterSlots>();			// no turn for monster at first

	}
	
	public Battlefield loadHero(ArrayList<MainMenuHeroSlot> heroies){
		for(int i = 0 ; i < heroies.size();i++){
			heroSlots.add(new BattleHeroSlots(heroies.get(i)));
			heroTurn.push(heroSlots.get(i));
		}
		
		return battleField;
	}	
	
	public Battlefield loadMonster(ArrayList<Monster> monsters){
		for(int i = 0 ; i < monsters.size();i++){
			monsterSlots.add(new MonsterSlots(monsters.get(i)));
			monsterTurn.push(monsterSlots.get(i));
		}
		
		return battleField;
	}
	
	public void fight(){			// normal attack , 1-1 push 1 out of stack
									// special attack 1-3 push 3 monster out of stack , 1 hero out of stack
		while(checkEndFight() == false){
			//hero attack
			
			BattleHeroSlots hero = heroTurn.pop();
			
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
