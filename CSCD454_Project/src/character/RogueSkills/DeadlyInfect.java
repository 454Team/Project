/**
 * 
 */
package character.RogueSkills;

/**
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class DeadlyInfect implements rogueSkills{

	@Override
	public int attack(double agility, double luck) {
		System.out.println("I just infected the enemy!");
		return 0;
	}

	@Override
	public String getDesc() {
		return "DeadlyInfect";
	}
}