package character;

import character.AssassinSkills.*;

/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public class Assassin extends Character {

	public Assassin() {
		super(new DoubleAttack(), new SonicBlow(), new ThrowVenomKnife(), 50.0, 40.0, 0, 10.0, 100.0, 80.0);
	} // End DVC
	
	@Override
	public void fight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void specialAttack() {
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

} // End Warrior
