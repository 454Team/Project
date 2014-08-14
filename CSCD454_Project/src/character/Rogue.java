package character;

import character.RogueSkills.*;

/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public class Rogue extends Character {

	public Rogue() {
		super(new BackStab(), new DeadlyInfect(), new Intimidate(), 100.0, 60.0, 20.0, 0, 50.0, 60.0, "Rogue");
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

} // End Rogue
