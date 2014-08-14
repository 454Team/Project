package character.AssassinSkills;

import character.SkillsMain;

/*
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public interface assassinSkills extends SkillsMain {
	public int attack(double agility, double luck);
	public String getDesc();
}
