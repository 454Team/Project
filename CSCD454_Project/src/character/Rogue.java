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
		return super.getVitality() > 0;
	}
	
	public String toString() {
		return super.toString();
	}

} // End Rogue
