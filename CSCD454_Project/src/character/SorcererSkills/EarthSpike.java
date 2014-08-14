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
	public int attack(double agility, double luck) {
		System.out.println("I just spiked the enemy with some earth!");
		return 0;
	}

	@Override
	public String getDesc() {
		return "EarthSpike";
	}
}