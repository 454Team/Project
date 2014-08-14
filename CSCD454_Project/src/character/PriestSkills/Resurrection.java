/**
 * 
 */
package character.PriestSkills;

/**
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class Resurrection implements priestSkills{

	@Override
	public int attack(double agility, double luck) {
		System.out.println("I just resurrected my teammates!");
		return 0;
	}

	@Override
	public String getDesc() {
		return "Resurrection";
	}
}