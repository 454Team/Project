/**
 * 
 */
package character.DefaultSkills;

/**
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public class Default implements defaultSkills {

	@Override
	public int attack() {
		System.out.println("I tried to do a special attack but I haven't set it so I failed at this turn...");
		return 0;
	}

}