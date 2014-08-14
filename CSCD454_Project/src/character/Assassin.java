package character;

import Items.Constants.Constants;
import character.AssassinSkills.*;

/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public class Assassin extends Character {

	public Assassin() {
		super(new DoubleAttack(), new SonicBlow(), new ThrowVenomKnife(), 50.0, 40.0, 0, 10.0, 100.0, 80.0, "Assassin",200,100);
		
		//super(new DoubleAttack(), new SonicBlow(), new ThrowVenomKnife(), 50.0, 40.0, 0, 10.0, 100.0, 80.0, "Assassin");
	} // End DVC
	
	@Override
	public int fight() {
		return super.fight();
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
		return Constants.assassinSkillSkills;
	}

} // End Warrior
