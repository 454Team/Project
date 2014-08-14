package character;

import java.util.Random;

import character.PaladinSkills.*;

/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public class Paladin extends Character {
	
	
	
	public Paladin() {
		super(new Gospel(), new HolyCrossAttack(), new Sacrifice(), 90.0, 40.0, 0, 30.0, 80.0, 80.0, "Paladin");
	} // End DVC
	
	@Override
	public int fight() {
		return super.fight();
	}

	@Override
	public boolean isAlive() {
		return super.isAlive();
	}
	
	@Override
	public void specialAttack() {
		super.specialAttack();	
	}
	
	@Override
	public void specialAttack2() {
		super.specialAttack2();	
	}
	
	@Override
	public void specialAttack3() {
		super.specialAttack3();	
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

} // End Paladin
