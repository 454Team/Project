/**
 * 
 */
package Monster.VesperSkills;

/**
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public class SuicideBombing implements VesperSkills{

	@Override
	public int attack() {
		System.out.println("I just did a suicide bombing!");
		return 0;
	}

}