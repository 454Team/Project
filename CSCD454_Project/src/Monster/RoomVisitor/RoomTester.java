/**
 * 
 */
package Monster.RoomVisitor;

import Monster.DarkSnakeLord;
import Monster.Gopinich;
import Monster.Ifrit;
import Monster.Monster;
import Monster.OrcHero;
import Monster.ThanatosPhantom;
import Monster.Vesper;

/**
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public abstract class RoomTester implements Monster {
	Monster[] monsters;
	
	 public RoomTester() {
	 //create new Array of elements
		 
		 this.monsters = new Monster[] { 
				 new Gopinich(), 
				 new OrcHero(), 
				 new DarkSnakeLord(), 
				 new Vesper(), 
				 new ThanatosPhantom(), 
				 new Ifrit() };
		 }
	 
	 public void accept(MonsterRoomVisitor visitor) {
		 for(Monster elem : monsters) {
			 elem.accept(visitor);
		 }
		 visitor.visit(this);
	 }
}
