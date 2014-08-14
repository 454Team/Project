package Monster;

import Monster.DarkSnakeLordSkills.DarkBreath;
import Monster.DarkSnakeLordSkills.FrostDiver;

/*
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class DarkSnakeLord extends Monster {

	public DarkSnakeLord(int room) {
		super(new FrostDiver(), new DarkBreath(), 83.00*room, 164.00*room, 80.00*room, 2.0*room, 70.0*room, 62.0*room, "Dark Snake Lord");
	} // End DVC
	
} // End SnakeLord
