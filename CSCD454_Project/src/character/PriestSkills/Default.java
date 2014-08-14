/**
 * 
 */
package character.PriestSkills;

/**
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class Default implements priestSkills{

	@Override
	public int attack() {
		System.out.println("I tried to do a special attack but I haven't set it so I failed at this turn...");
		return 0;
	}

	@Override
	public String getDesc() {
		return "Default";
	}
}