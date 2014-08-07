/**
 * 
 */
package character.RogueSkills;

/**
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class DeadlyInfect implements rogueSkills{

	@Override
	public void attack() {
		System.out.println("I just infected the enemy!");
	}

}