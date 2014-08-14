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
	public int attack(double agility, double luck) {
		System.out.println("I just decreased my enemies agility in half!");
		return 0;
	}

	@Override
	public String getDesc() {
		return "SoulBurn";
	}
}