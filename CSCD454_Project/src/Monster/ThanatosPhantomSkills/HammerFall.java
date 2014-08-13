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
	public int attack() {
		System.out.println("I just did a hammer fall!");
		return 0;
	}

}