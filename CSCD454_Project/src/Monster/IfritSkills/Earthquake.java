/**
 * 
 */
package Monster.IfritSkills;

/**
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public class Earthquake implements IfritSkills{

	@Override
	public int attack(double agility, double luck) {
		System.out.println("I just created an earthquake!");
		return 0;
	}

	@Override
	public String getDesc() {
		return "EarthQuake";
	}
}