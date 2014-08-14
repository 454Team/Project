/**
 * 
 */
package character.AssassinSkills;

/**
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class ThrowVenomKnife implements assassinSkills{

	@Override
	public int attack(double agility, double luck) {
		System.out.println("I just thre a venemous knife!");
		return 0;
	}

	@Override
	public String getDesc() {
		return "ThrowVenomKnife";
	}

}