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
	public int attack(double agility, double luck) {
		System.out.println("I just did a suicide bombing!");
		return 0;
	}

	@Override
	public String getDesc() {
		return "SuicideBombing";
	}

}