package character;

import java.util.Random;

import MainMenu.Constants;
import character.PaladinSkills.*;

/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public class Paladin extends Character {
	
	
	
	public Paladin() {
		super(new Gospel(), new HolyCrossAttack(), new Sacrifice(), 90.0, 40.0, 0, 30.0, 80.0, 80.0, "Paladin",300,150);
	} // End DVC
	
	@Override
	public int fight() {
		return super.fight();
	}

	@Override
	public boolean isAlive() {
		return super.getVitality() > 0;
	}
	
	public String toString() {
		return super.toString();
	}

	@Override
	public SkillsMain[] getSkillNames() {
		return Constants.paladinSkillSkills;
	}

} // End Paladin
