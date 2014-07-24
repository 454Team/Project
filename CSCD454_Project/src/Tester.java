import PaladinSkills.Gospel;
import character.Paladin;

/**
 * 
 */

/**
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paladin pally = new Paladin();
		pally.setSkill1(new Gospel());
		pally.specialAttack();
	}

}
