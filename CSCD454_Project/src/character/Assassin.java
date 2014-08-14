package character;

import character.AssassinSkills.*;

/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public class Assassin extends Character {

	public Assassin() {
		super(new DoubleAttack(), new SonicBlow(), new ThrowVenomKnife(), 50.0, 40.0, 0, 10.0, 100.0, 80.0, "Assassin");
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

} // End Warrior
