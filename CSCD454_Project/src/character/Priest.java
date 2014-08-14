package character;

import character.PriestSkills.*;

/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public class Priest extends Character {

	public Priest() {
		super(new Heal(), new Resurrection(), new Sanctuary(), 10.0, 20.0, 70.0, 30.0, 30.0, 60.0, "Priest");
	} // End DVC
	
	@Override
	public int fight() {
		return super.fight();
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
	public boolean isAlive() {
		return super.isAlive();
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
} // End Priest
