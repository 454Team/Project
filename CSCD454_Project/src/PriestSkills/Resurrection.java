/**
 * 
 */
package PriestSkills;

/**
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class Resurrection implements priestSkills{

	@Override
	public void attack() {
		System.out.println("I just resurrected my teammates!");
	}

}