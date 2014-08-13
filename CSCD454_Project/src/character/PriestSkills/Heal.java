/**
 * 
 */
package character.PriestSkills;

/**
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class Heal implements priestSkills {

	@Override
	public int attack() {
		System.out.println("I just all my teammates!");
		return 0;
	}

}