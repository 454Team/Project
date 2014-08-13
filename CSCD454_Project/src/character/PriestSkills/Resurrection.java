/**
 * 
 */
package character.PriestSkills;

/**
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class Resurrection implements priestSkills{

	@Override
	public int attack() {
		System.out.println("I just resurrected my teammates!");
		return 0;
	}

}