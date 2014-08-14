/**
 * 
 */
package Monster.OrcHeroSkills;

/**
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public class SpiralPierce implements OrcHeroSkills{

	@Override
	public int attack(double agility, double luck) {
		System.out.println("I just created a thunder storm!");
		return 0;
	}

	@Override
	public String getDesc() {
		return "SpiralPierce";
	}
}