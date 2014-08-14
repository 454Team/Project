package character;

import MainMenu.Constants;
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
	public SkillsMain [] getSkillNames() {
		return Constants.sorcererSkillSkills;
	}

} // End Mage
