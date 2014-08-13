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
	public int attack() {
		System.out.println("I just thre a venemous knife!");
		return 0;
	}

}