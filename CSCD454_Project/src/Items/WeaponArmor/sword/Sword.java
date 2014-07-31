package Items.WeaponArmor.sword;

import Items.WeaponArmor.WeaponItem;

public class Sword extends WeaponItem{
	
	// 
	
	@Override
	public String toString(){
		return super.toString()+  "		in category : Sword"  + "		with attack " + this.attackScore;
	}
}
