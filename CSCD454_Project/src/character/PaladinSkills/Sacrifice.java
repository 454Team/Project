/**
 * 
 */
package character.PaladinSkills;

/**
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class Sacrifice implements paladinSkills{

	@Override
	public int attack() {
		System.out.println("I just sacrifized some of my life to do a major attack!");
		return 0;
	}

}