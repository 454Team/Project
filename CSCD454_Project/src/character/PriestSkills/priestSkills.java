package character.PriestSkills;

import character.SkillsMain;

/*
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public interface priestSkills extends SkillsMain {
	public int attack(double agility, double luck);
	public String getDesc();
}
