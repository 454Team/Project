/**
 * 
 */
package Monster.IfritSkills;

/**
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public class PulseStrike implements IfritSkills{

	@Override
	public int attack() {
		System.out.println("I just did a pulse strike!");
		return 0;
	}

}