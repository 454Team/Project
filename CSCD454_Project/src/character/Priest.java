package character;

import MainMenu.Constants;
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
		// TODO Auto-generated method stub
		
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
		return Constants.priestSkillSkills;
	}
} // End Priest
