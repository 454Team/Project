package tester;

import java.util.ArrayList;

import FightingBattle.HeroSlots.Battlefield;
import FightingBattle.HeroSlots.BattleHeroSlots;
import Items.characterSlots.HeroSlot;
import MainMenu.MainMenuHeroSlot;

public class BattleTester {

	public static void main(String [] args){
		
		//create 3 hero
		int numberOfHero = 3;
		ArrayList<HeroSlot> heroies = new ArrayList<HeroSlot>();
		for(int i = 0 ; i < numberOfHero ; i++){
			heroies.add(new MainMenuHeroSlot());
		}
		
		for(HeroSlot heroslot : heroies){
			System.out.println(heroslot.toString());
		}
		
		
		
		for(HeroSlot heroslot : heroies){
			System.out.println(heroslot.toString());
		}
		
		//Battlefield.create().loadHero(hero1, hero2, hero3)
		//					.loadMonster(1)
		//					.fight();
		
	}

}