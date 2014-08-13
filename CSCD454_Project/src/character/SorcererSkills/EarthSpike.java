/**
 * 
 */
package character.SorcererSkills;

/**
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class EarthSpike implements SorcererSkills{

	@Override
	public int attack() {
		System.out.println("I just spiked the enemy with some earth!");
		return 0;
	}

}