package Monster;

import Monster.GopinichSkills.FireBall;
import Monster.GopinichSkills.MeteorStorm;

/*
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class Gopinich extends Monster {
	
	public Gopinich(int room) {
		super(new FireBall(), new MeteorStorm(), 65.0*room, 152.0*room, 103.00*room, 2.0*room, 50.0*room, 55.0*room, "Gopinich");
	} // End DVC

} // End Gopinich
