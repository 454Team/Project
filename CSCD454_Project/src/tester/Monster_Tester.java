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
		
		Monster character = MonsterFactory.getMonster(2);
		System.out.println(character.toString());
		
		character = MonsterFactory.getMonster(3);
		System.out.println(character.toString());
		
		character = MonsterFactory.getMonster(4);
		System.out.println(character.toString());
		
		character = MonsterFactory.getMonster(5);
		System.out.println(character.toString());
		
		character = MonsterFactory.getMonster(6);
		System.out.println(character.toString());
		
	} // End main

} // End Monster_Tester
