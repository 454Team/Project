/**
 * 
 */
package character.PaladinSkills;

/**
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class Gospel implements paladinSkills{

	@Override
	public int attack() {
		System.out.println("I just sang the Gospel and increased my team members stats!");
		return 0;
	}

	@Override
	public String getDesc() {
		return "Gospel";
	}

}