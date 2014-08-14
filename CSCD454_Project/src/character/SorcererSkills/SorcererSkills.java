package character.SorcererSkills;

import character.SkillsMain;

/*
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public interface SorcererSkills extends SkillsMain {
	public int attack(double agility, double luck);
	public String getDesc();
}
