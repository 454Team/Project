package Monster;

import Monster.OrcHeroSkills.SpiralPierce;
import Monster.OrcHeroSkills.ThunderStorm;

/*
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class OrcHero extends Monster {

	public OrcHero(int room) {
		super(new ThunderStorm(), new SpiralPierce(), 91.0*room, 105.0*room, 70.00*room, 2.0*room, 1.0*room, 30.0*room, "Orc Hero");
	} // End DVC

} // End OrcHero
