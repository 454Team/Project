package Monster;

import Monster.IfritSkills.Earthquake;
import Monster.IfritSkills.SonicBlow;

/*
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class Ifrit extends Monster {
	public Ifrit(int room) {
		super(new Earthquake(), new SonicBlow(), 180.0*room, 199.0*room, 190.00*room, 50.0*room, 120.0*room, 25.0*room, "Ifrit");
	} // End DVC

} // End Priest
