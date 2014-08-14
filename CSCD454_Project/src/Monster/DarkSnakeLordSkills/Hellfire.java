/**
 * 
 */
package Monster.DarkSnakeLordSkills;

/**
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public class Hellfire implements DarkSnakeLordSkills{

	@Override
	public int attack() {
		System.out.println("I just rained hell fire!");
		return 0;
	}

	@Override
	public String getDesc() {
		return "HellFire";
	}
}