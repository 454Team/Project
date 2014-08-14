/**
 * 
 */
package Monster.VesperSkills;

/**
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public class BrandishSpear implements VesperSkills{

	@Override
	public int attack() {
		System.out.println("I just threw a brandish spear!");
		return 0;
	}

	@Override
	public String getDesc() {
		return "BrandishSpear";
	}
}