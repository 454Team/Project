package character;

import character.SorcererSkills.*;

/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public class Sorcerer extends Character {

	public Sorcerer() {
		super(new EarthSpike(), new MagicCrasher(), new SoulBurn(), 30.0, 50.0, 100.0, 60.0, 20.0, 60.0, "Sorcerer");
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

} // End Mage
