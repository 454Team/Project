/**
 * 
 */
package Monster.OrcHeroSkills;

/**
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public class GuidedAttack implements OrcHeroSkills{

	@Override
	public int attack() {
		System.out.println("I just did a guided attack!");
		return 0;
	}

}