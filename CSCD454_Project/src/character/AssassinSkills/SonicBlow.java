/**
 * 
 */
package character.AssassinSkills;

/**
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class SonicBlow implements assassinSkills{

	@Override
	public int attack() {
		System.out.println("I just did a sonic blow!");
		return 0;
	}

}