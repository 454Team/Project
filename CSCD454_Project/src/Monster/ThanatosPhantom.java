package Monster;

import Monster.ThanatosPhantomSkills.Bash;
import Monster.ThanatosPhantomSkills.SoulStrike;

/*
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class ThanatosPhantom extends Monster {

	public ThanatosPhantom(int room) {
		super(new SoulStrike(), new Bash(), 90.0*room, 40.0*room, 0*room, 2.0*room, 80.0*room, 80.0*room, "Thanatos Phantom");
	} // End DVC
} // End ThanatosPhantom
