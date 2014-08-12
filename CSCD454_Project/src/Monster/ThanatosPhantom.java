package Monster;

import Monster.RoomVisitor.MonsterRoomVisitor;

/*
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class ThanatosPhantom implements Monster {

	public double strength = 100.00;
	public double agility = 108.00;
	public double vitality = 30.00;
	public double intelligence = 86.00;
	public double dexterity = 147.00;
	public double luck = 32.00;
	public double health = 100;
	@Override
	public void fight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void specialAttack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defend() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isAlive() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void test() {
		System.out.println("I am a Thanatos Phantom!");
	}

	@Override
	public void specialAttack2() {
		// TODO Auto-generated method stub
		
	}
	
	public double getStrength() {
		return strength;
	}
	
	public double getAgility() {
		return agility;
	}

	public double getVitality() {
		return vitality;
	}

	public double getIntelligence() {
		return intelligence;
	}

	public double getDexterity() {
		return dexterity;
	}

	public double getLuck() {
		return luck;
	}
	
	@Override
	public void defend(double damage) {
		this.health -=damage;
	}

	@Override
	public void accept(MonsterRoomVisitor room) {
		room.visit(this);		
	}
	


} // End ThanatosPhantom
