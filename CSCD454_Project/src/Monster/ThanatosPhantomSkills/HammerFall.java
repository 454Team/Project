/**
 * 
 */
package Monster.ThanatosPhantomSkills;

/**
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public class HammerFall implements ThanatosPhantomSkills{

	@Override
	public int attack(double agility, double luck) {
		System.out.println("I just did a hammer fall!");
		return 0;
	}

	@Override
	public String getDesc() {
		return "HammerFall";
	}
}