package FightingBattle.HeroSlots;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import Items.characterSlots.HeroSlot;
import MainMenu.MainMenuHeroSlot;
import Monster.Monster;

public class Battlefield {

	private static Battlefield battleField= null;
	private Queue<BattleHeroSlots> heroTurn;
	private Queue<MonsterSlots> monsterTurn;
	
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
		heroTurn = new LinkedList<BattleHeroSlots>();			// no turn at first
		monsterTurn = new LinkedList<MonsterSlots>();			// no turn for monster at first

	}
	
	public Battlefield loadHero(ArrayList<MainMenuHeroSlot> heroies){
		for(int i = 0 ; i < heroies.size();i++){
			heroSlots.add(new BattleHeroSlots(heroies.get(i)));
			heroTurn.add(heroSlots.get(i));
		}
		
		return battleField;
	}	
	
	public Battlefield loadMonster(ArrayList<Monster> monsters){
		for(int i = 0 ; i < monsters.size();i++){
			monsterSlots.add(new MonsterSlots(monsters.get(i)));
			monsterTurn.add(monsterSlots.get(i));
		}
		
		return battleField;
	}
	
	public void fight(){			// normal attack , 1-1 push 1 out of stack
		int turn = 1;							// special attack 1-3 push 3 monster out of stack , 1 hero out of stack
		while(checkEndFight() == false){
			
			System.out.println("***************************************************************************");
			System.out.println("[TURN "+turn+" ]");
			System.out.println("***************************************************************************");
			
			//hero attack
			
			BattleHeroSlots hero = heroTurn.remove();
			
			System.out.println(" hero " + hero.toString() + "is out");
			
			heroTurn.add(hero);
			
			// monster attack
			if(monsterTurn.peek() != null){
				MonsterSlots monster = monsterTurn.remove();
				
				monster.loseHealth(25);
				
				System.out.println(" monster " + monster.toString() + "is out");
				
				if(monster.checkDefeated() == true){
					//monsterTurn.add(monster);
					numMonster--;
				}else
					monsterTurn.add(monster);
			}
			turn++;
			
		}
	}
	
	public boolean checkEndFight(){
		boolean checking = true;
		int counter = 0 ;
		int i = 0;
		while(i <numMonster){
			MonsterSlots slot = monsterTurn.remove();
			if(slot.checkDefeated() == false)
				checking = false;
				//counter++;
			monsterTurn.add(slot);
			i++;
		}
		return checking;
	}

}
