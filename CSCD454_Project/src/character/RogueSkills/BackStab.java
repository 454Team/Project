/**
 * 
 */
package character.RogueSkills;

/**
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class BackStab implements rogueSkills{

	@Override
	public int attack() {
		System.out.println("I just stabbed the enemy in the back!");
		return 0;
	}

}