package Monster;

import Monster.VesperSkills.DarknessJupitel;
import Monster.VesperSkills.SuicideBombing;

/*
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class Vesper extends Monster {

	public Vesper(int room) {
		super(new DarknessJupitel(), new SuicideBombing(), 50.0*room, 160.0*room, 70.00*room, 150.0*room, 100.0*room, 30.0*room, "Vesper");
	} // End DVC
}
