package tester;

import java.util.Random;

import Monster.Monster;
import Monster.MonsterFactory;

/*
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 * Tester Class to test the Monster Factory
 */
public class Monster_Tester {

	public static void main(String[] args) {
		
		Random randomGenerator = new Random();
	    randomGenerator.nextInt(100);
		
		Monster character = MonsterFactory.getMonster();
		character.test();
		
		character = MonsterFactory.getMonster();
		character.test();
		
		character = MonsterFactory.getMonster();
		character.test();
		
		character = MonsterFactory.getMonster();
		character.test();
		
		character = MonsterFactory.getMonster();
		character.test();
		
	} // End main

} // End Monster_Tester
