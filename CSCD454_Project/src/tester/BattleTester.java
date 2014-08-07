package tester;

import FightingBattle.HeroSlots.Battlefield;
import FightingBattle.HeroSlots.CharacterBattleSlot1;
import FightingBattle.HeroSlots.CharacterBattleSlot2;
import FightingBattle.HeroSlots.CharacterBattleSlot3;
import FightingBattle.HeroSlots.HeroSlots;

public class BattleTester {

	public static void main(String [] args){
		
		HeroSlots hero1 = new CharacterBattleSlot1("warrior");
		HeroSlots hero2 = new CharacterBattleSlot2("warrior");
		HeroSlots hero3 = new CharacterBattleSlot3("warrior");
		
		Battlefield.create().loadHero(hero1, hero2, hero3)
							.loadMonster(1)
							.fight();
		
	}

}
