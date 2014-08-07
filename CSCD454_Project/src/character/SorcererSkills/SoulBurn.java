/**
 * 
 */
package character.SorcererSkills;

/**
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class SoulBurn implements SorcererSkills{

	@Override
	public void attack() {
		System.out.println("I just decreased my enemies agility in half!");
	}

}