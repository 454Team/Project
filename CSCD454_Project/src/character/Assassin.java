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
		return super.getVitality() > 0;
	}
	
	public String toString() {
		return super.toString();
	}

} // End Warrior
