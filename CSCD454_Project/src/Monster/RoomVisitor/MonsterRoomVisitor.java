/**
 * 
 */
package Monster.RoomVisitor;

import Monster.Monster;

/**
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public interface MonsterRoomVisitor {
	public void visit(Monster monster);
}
