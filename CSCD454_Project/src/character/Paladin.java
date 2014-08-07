package character;

import character.PaladinSkills.*;

/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public class Paladin extends Character {

	public Paladin() {
		super(new Gospel(), new HolyCrossAttack(), new Sacrifice(), 90.0, 40.0, 0, 30.0, 80.0, 80.0);
	} // End DVC
	
	@Override
	public void fight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defend() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retreat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void equip() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void useItem() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isAlive() {
		// TODO Auto-generated method stub
		return false;
	}

} // End Paladin
