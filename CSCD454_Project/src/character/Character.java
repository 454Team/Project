package character;

import PaladinSkills.Default;
import PaladinSkills.paladinSkills;

/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public abstract class Character {
	private SkillsMain skill1;
	private SkillsMain skill2;
	
	public Character()
	{
		setSkill1(new Default());
		setSkill2(new Default());
	}
	
	public abstract void fight();
	
	public void specialAttack(){
		skill1.attack();
	}
	
	public void specialAttack2(){
		skill2.attack();
	}

	public void setSkill2(SkillsMain skill2) {
		this.skill2 = skill2;
	}
	
	public void setSkill1(SkillsMain skill1) {
		this.skill1 = skill1;
	}
	
	public abstract void defend();
	public abstract void retreat();
	public abstract void equip();
	public abstract void useItem();
	public abstract boolean isAlive();
	
} // End Character
