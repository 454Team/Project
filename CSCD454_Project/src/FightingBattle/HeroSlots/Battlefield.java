package FightingBattle.HeroSlots;

import java.util.Stack;

import Items.Constants.Constants;
import Monster.Monster;

public class Battlefield {

	private static Battlefield battleField= null;
	private Stack heroTurn;
	private Stack monsterTurn;
	
	private HeroSlots Heroslot1;
	private HeroSlots Heroslot2;
	private HeroSlots Heroslot3;
	
	private MonsterSlots monsterSlot1;
	private MonsterSlots monsterSlot2;
	private MonsterSlots monsterSlot3;
	
	
	public static Battlefield create(){
		if(battleField == null ){
			battleField = new Battlefield();
		}
		return battleField;
	}
	
	private Battlefield() {
		heroTurn = new Stack<HeroSlots>();			// no turn at first
		monsterTurn = new Stack<Monster>();			// no turn for monster at first

	}
	
	public void loadHero(character.Character hero1,character.Character hero2,character.Character hero3){
		Heroslot1 = new CharacterBattleSlot1(hero1);
		Heroslot2 = new CharacterBattleSlot1(hero2);
		Heroslot3 = new CharacterBattleSlot1(hero3);
	}
	
	public void loadHero(String hero1,String hero2,String hero3){
		Heroslot1 = new CharacterBattleSlot1(hero1);
		Heroslot2 = new CharacterBattleSlot1(hero2);
		Heroslot3 = new CharacterBattleSlot1(hero3);
	}	
	
	private void loadMonster(Monster monster1,Monster monster2,Monster monster3){
		//monsterSlot1 = new MonsterSlots1(monster1);
	}
	
	private void loadMonster(String monster1,String monster2,String monster3){
		
	}

}
