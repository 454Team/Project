package character.RogueSkills;

import character.SkillsMain;


/*
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public interface rogueSkills extends SkillsMain {
	public int attack(double agility, double luck);
	public String getDesc();
}
