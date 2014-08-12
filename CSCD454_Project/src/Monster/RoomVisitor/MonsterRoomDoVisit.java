/**
 * 
 */
package Monster.RoomVisitor;

import Monster.Monster;

/**
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class MonsterRoomDoVisit implements MonsterRoomVisitor{

	@Override
	public void visit(Monster monster) {
		// TODO Auto-generated method stub
		System.out.println("I'm visiting this monster");
	}

}
