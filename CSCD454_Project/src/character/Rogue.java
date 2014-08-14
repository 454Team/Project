package character;

import MainMenu.Constants;
import character.RogueSkills.*;

/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public class Rogue extends Character {

	public Rogue() {
		super(new BackStab(), new DeadlyInfect(), new Intimidate(), 100.0, 60.0, 20.0, 0, 50.0, 60.0, "Rogue",350,175);
	} // End DVC
	
	@Override
	public int fight() {
		return super.fight();
	}

	@Override
	public void specialAttack() {
		// TODO Auto-generated method stub
		
	}
/*
	@Override
	public boolean isAlive() {
		return super.getVitality() > 0;
	}*/
	
	public String toString() {
		return super.toString();
	}

	@Override
	public SkillsMain[] getSkillNames() {
		return Constants.rogueSkillSkills;
	}

} // End Rogue
