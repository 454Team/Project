/**
 * 
 */
package Monster.ThanatosPhantomSkills;

/**
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public class Bash implements ThanatosPhantomSkills{

	@Override
	public int attack() {
		System.out.println("I just bashed the opponent!");
		return 0;
	}

}